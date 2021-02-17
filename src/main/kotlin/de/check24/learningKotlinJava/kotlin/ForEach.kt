package de.check24.learningKotlinJava.kotlin

fun main(){
    val viererReihe = IntArray(5)
    for (i in viererReihe.indices) {
        viererReihe[i] = (i + 1) * 4
    }
    for (i in viererReihe) {
        println(i)
    }
}