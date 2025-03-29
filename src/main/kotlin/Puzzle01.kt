import kotlin.streams.toList

class Puzzle01 {
    fun solve(input: List<String>): Int {
        return input.map {
            val isValidSms: Boolean = validateSms(it)
            val isValidTweet: Boolean = validateTweet(it)

            if (isValidSms && isValidTweet) 13
            else if (isValidSms) 11
            else if (isValidTweet) 7
            else 0
        }.sum()
    }

    private fun validateSms(message: String): Boolean {
        return message.encodeToByteArray().size <= 160
    }

    private fun validateTweet(message: String): Boolean {
        return message.chars().toList().size <= 140
    }
}