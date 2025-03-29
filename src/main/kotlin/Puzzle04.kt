import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.time.temporal.ChronoUnit
import java.util.*

class Puzzle04 {
    fun solve(input: List<String>): Int {
        val departures = mutableListOf<ZonedDateTime>()
        val arrivals = mutableListOf<ZonedDateTime>()

        val dateTimeFormatter = DateTimeFormatterBuilder()
            .appendPattern("MMM dd, yyyy, HH:mm")
            .toFormatter(Locale.ENGLISH)

        input.forEach {
            if (it.startsWith("Departure")) {
                departures.add(convertToZonedDateTime(it, dateTimeFormatter))
            } else if (it.startsWith("Arrival")) {
                arrivals.add(convertToZonedDateTime(it, dateTimeFormatter))
            }
        }

        var sum = 0
        departures.forEachIndexed { index, zonedDateTime ->
            sum += (ChronoUnit.MINUTES.between(zonedDateTime, arrivals[index])).toInt()
        }
        return sum
    }

    private fun convertToZonedDateTime(input: String, dateTimeFormatter: DateTimeFormatter): ZonedDateTime {
        return ZonedDateTime.of(
            LocalDateTime.parse(input.substring(42), dateTimeFormatter),
            ZoneId.of(input.substring(11, 42).trimEnd())
        )
    }


}