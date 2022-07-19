package com.paulrowlandapps.kotlinkatas.interview

import java.util.*

object ReverseString {
    @JvmStatic
    fun main (args: Array<String>){

        val input = "Reverse Me"
        val stack = Stack<Char>()
        var output = ""

        input.forEach{ stack.push(it) }
        while (!stack.isEmpty())
            output += stack.pop()

        println(output)

    }
}