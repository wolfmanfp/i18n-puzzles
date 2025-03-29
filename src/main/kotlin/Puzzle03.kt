class Puzzle03 {
    fun solve(input: List<String>): Int {
        return input.count {
            validateLength(it)
                    && validateDigits(it)
                    && validateUppercase(it)
                    && validateLowercase(it)
                    && validateNonAscii(it)
        }
    }

    private fun validateLength(password: String): Boolean {
        return password.length in 4..12
    }

    private fun validateDigits(password: String): Boolean {
        return password.toCharArray().any { it.isDigit() }
    }

    private fun validateUppercase(password: String): Boolean {
        return password.toCharArray().any { it.isUpperCase() }
    }

    private fun validateLowercase(password: String): Boolean {
        return password.toCharArray().any { it.isLowerCase() }
    }

    private fun validateNonAscii(password: String): Boolean {
        return password.toCharArray().any { it.code >= 128 }
    }
}