package com.paulrowlandapps.kotlinkatas.interview

object Factorial {

    object Factorial {
        @JvmStatic
        fun main(args: Array<String>) {
            println(factorial(8))
        }

        private fun factorial(number: Int): Int {
            var number = number
            var result = 1
            while (number != 0) {
                result *= number
                number--
            }
            return result
        }
    }
}