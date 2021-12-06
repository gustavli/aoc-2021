package Day01

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        return input.windowed(2, 1).count { it[0].toInt() <= it[1].toInt() }
    }

    fun part2(input: List<String>): Int {
        return input.windowed(3, 1).map { it.sumOf { it.toInt() } }.windowed(2, 1).count { it[0] < it[1] }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01/Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("Day01/Day01")
    println("part 1: ${part1(input)}")
    println("part 2: ${part2(input)}")
}
