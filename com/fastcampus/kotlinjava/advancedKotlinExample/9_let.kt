package com.fastcampus.kotlinjava.advancedKotlinExample

fun main() {
    val str: String? = "안녕"

    val result: Int? = str?.let {
        println(it)

        val abc: String? = "abc"
        val def : String? = "def"
        if(!abc.isNullOrBlank() && !def.isNullOrBlank()) {
            println("abcdef가 null 아님")
        }

        1234
    }
    println(result)
}