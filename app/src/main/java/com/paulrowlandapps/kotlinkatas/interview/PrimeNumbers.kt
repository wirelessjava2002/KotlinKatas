package com.paulrowlandapps.kotlinkatas.interview

object PrimeNumbers {

    @JvmStatic
    fun main(args: Array<String>) {
        println(isPrime(29))
    }

    private fun isPrime(number: Int): Boolean {
        var isPrime = true
        if (number < 2) isPrime = false
        for (i in 2 until number) {
            if (number % i == 0) {
                isPrime = false
            }
        }
        return isPrime
    }
}