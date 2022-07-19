package com.paulrowlandapps.kotlinkatas.interview

object Fibonacci {
    @JvmStatic
    fun main(args: Array<String>) {
        var n1 = 0
        var n2 = 1
        var n3 = 0
        println("$n1\n$n2")
        for (i in 0..9) {
            n3 = n1 + n2
            println("" + n3)
            n1 = n2
            n2 = n3
        }
    }
}