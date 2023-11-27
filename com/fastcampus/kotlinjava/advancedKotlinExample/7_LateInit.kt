package com.fastcampus.kotlinjava.advancedKotlinExample

class `7_LateInit` {

    lateinit var text: String

    val textInitialized: Boolean
        get() = this::text.isInitialized

    fun printText() {
        println(text)
    }
}

fun main() {
    val test = `7_LateInit`()

    if(!test.textInitialized) {
        test.text = "하이요"
    }
    test.printText()
}
