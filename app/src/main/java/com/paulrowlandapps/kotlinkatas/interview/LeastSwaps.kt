package com.paulrowlandapps.kotlinkatas.interview

import java.util.*

object LeastSwaps {

    @JvmStatic
    fun main(args: Array<String>) {
        val input = intArrayOf(1, 2, 4, 3, 5, 6, 7, 8)
        println(leastSwaps(input))
    }

    private fun leastSwaps(input: IntArray): Int {

        var swapCounter = 0
        val sorted = IntArray(input.size)
        var temp = 0

        // create sorted array so we know what sorted state is
        for (i in input.indices) {
            sorted[i] = input[i]
        }
        Arrays.sort(sorted)

        // iterate over input array, checking if current number is in right place
        for (i in input.indices) {
            // if not in right place, swap it with the right one.
            if (input[i] != sorted[i]) {
                temp = input[i]
                input[i] = sorted[i]
                input[temp - 1] = temp
                swapCounter++
            }
        }
        // return the swap counter
        return swapCounter
    }
}