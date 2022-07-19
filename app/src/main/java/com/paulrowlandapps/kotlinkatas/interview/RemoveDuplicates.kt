package com.paulrowlandapps.kotlinkatas.interview

import java.util.LinkedHashSet

object RemoveDuplicates {

    @JvmStatic
    fun main(args: Array<String>) {
        val list = mutableListOf(1,2,3)
        list.add(3)
        println(list.toSet()) // easiest way

        val dups = LinkedHashSet(list)
        list.clear()
        list.addAll(dups)
        println(list)
    }
}