import java.io.File

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File({}::class.java.getResource("$name.txt")?.file).readLines()
