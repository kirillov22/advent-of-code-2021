package day1

class Solution {
    fun partOne(input: List<Int>): Int {
        var depthMeasurementIncreases = 0

        (1 until input.size).forEach {
            val first = input[it - 1]
            val second = input[it]

            if (second > first) {
                depthMeasurementIncreases++
            }
        }

        return depthMeasurementIncreases
    }

    fun partTwo(input: List<Int>): Int {
        var depthMeasurementIncreases = 0

        (3 until input.size).forEach {
            val first = input[it - 3]
            val second = input[it - 2]
            val third = input[it - 1]
            val previousSum = first + second + third

            val current = input[it]
            val currentSum = second + third + current

            if (currentSum > previousSum) {
                depthMeasurementIncreases++
            }
        }

        return depthMeasurementIncreases
    }
}
