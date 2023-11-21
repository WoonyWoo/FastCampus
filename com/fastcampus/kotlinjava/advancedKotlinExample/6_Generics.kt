package com.fastcampus.kotlinjava.advancedKotlinExample

class MyGenerics<T>(val t: T) {

}

fun main(){
    // 제네릭을 사용한 클래스의 인스턴스를 만드려면 타입아규먼트를 제공
    val generics = MyGenerics<String>("테스트")

}