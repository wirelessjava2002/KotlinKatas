package com.paulrowlandapps.kotlinkatas.interview

object SwapWithoutTemp {

    @JvmStatic
    fun main(args: Array<String>) {
        var a = 1
        var b = 2
        // print out before
        println("A=$a B=$b")

        //XOR bit shift to swap numbers
        a = a xor b
        b = b xor a
        a = a xor b
        // print out after
        println("A=$a B=$b")
    }
}