package de.check24.learningKotlinJava.kotlin

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val isMonday = true
    val anListWithTheNameList = buildList {
        add("catfish")
        add("water")
        add("tulips")
        add("blue paint")
        if (isMonday) {
            add(0,"Cat")
        }
    }
    //anListWithTheNameList[1] = "bottle of water"
    for (s in anListWithTheNameList) {
        println(s)
    }
}