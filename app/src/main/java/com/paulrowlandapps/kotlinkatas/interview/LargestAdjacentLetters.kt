package com.paulrowlandapps.kotlinkatas.interview

import java.util.*

object LargestAdjacentLetters {
    @JvmStatic
    fun main(args: Array<String>) {
        println(adjacentLetters("aqaaaabbbcddddddddefgg"))
    }

    private fun adjacentLetters(input: String): Char? {
        var counter = 0
        val maxNumber: Int
        val map: MutableMap<Int, Char> = HashMap()

        //Put values in Map
        for (i in input.indices) {
            if (i > 0 && input[i - 1] != input[i]) {
                map[counter] = input[i - 1]
                counter = 0
            }
            counter++
        }
        // Use Collections to get max key, highest count
        maxNumber = Collections.max(map.keys)
        return map[maxNumber]
    }
}