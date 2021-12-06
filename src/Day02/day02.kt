package Day02

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        var horizontal = 0
        var depth = 0

        input.forEach {
            val value = it.substringAfter(" ").toInt()
            when (it.substringBefore(" ")) {
                "forward" -> {
                    horizontal += value
                }
                "down" -> {
                    depth += value
                }
                "up" -> {
                    depth -= value
                }
            }
        }

        return horizontal * depth
    }

    fun part2(input: List<String>): Int {
        var horizontal = 0
        var depth = 0
        var aim = 0

        input.forEach {
            val value = it.substringAfter(" ").toInt()
            when (it.substringBefore(" ")) {
                "forward" -> {
                    horizontal += value
                    depth += aim * value
                }
                "down" -> {
                    aim += value
                }
                "up" -> {
                    aim -= value
                }
            }
        }

        return horizontal * depth
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02/Day02_test")
    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("Day02/Day02")
    println("part 1: ${part1(input)}")
    println("part 2: ${part2(input)}")
}
