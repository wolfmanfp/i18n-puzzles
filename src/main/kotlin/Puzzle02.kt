import java.time.OffsetDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

class Puzzle02 {
    fun solve(input: List<String>): String {
        val timestampCountMap = input.map {
            OffsetDateTime.parse(it).atZoneSameInstant(ZoneId.of("UTC"))
        }
        .groupingBy { it }
        .eachCount()

        val gravitationalWaveDate = timestampCountMap.filter { it.value >= 4 }.keys.toList()[0]
        return gravitationalWaveDate.toOffsetDateTime()
            .format(DateTimeFormatter.ISO_DATE_TIME)
            .replace("Z", "+00:00")
    }
}