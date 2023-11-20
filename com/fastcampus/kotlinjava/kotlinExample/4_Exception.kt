package com.fastcampus.kotlinjava.kotlinExample

import java.lang.IllegalArgumentException
import java.util.IllegalFormatCodePointException

fun main(){
    try {
        throw Exception()
    } catch (e: Exception) {
        println("catch 수행!")
    } finally {
        println("finally 수행!")
    }

    val a = try {
        "1234".toInt()
    } catch(e: Exception) {
        println("예외 발생!")
    }
    println(a)

//    throw Exception("예외 발생!")

    val b: String? = null
    val c: String = b ?: failFast("a is null")

    println(c.length)
}

fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}