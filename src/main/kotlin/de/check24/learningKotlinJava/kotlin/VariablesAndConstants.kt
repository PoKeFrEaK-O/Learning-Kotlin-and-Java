package de.check24.learningKotlinJava.kotlin

fun main() {
    var myVariable = 42
    myVariable = 50
    val myConstant = 42
    // Kotlin has the keywords var (variable) and val (constant).
    // The compiler in Kotlin can automatically assign the corresponding data type to a value.

    val myNumByte: Byte = 17
    val myNuShort: Short = 5555
    val myNumInt: Int = 1000000000
    val myNumLong: Long = 100000000000000000
    val myNumFloat: Float = 5.99f
    val myNumDouble: Double = 76.24
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null
    val myChar: Char = 'a'
    val myString: String = "Hello World"

    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }

    // Primitive type arrays:
    val myArray = IntArray(5) {42} // Array of int of size 5 with values [42, 42, 42, 42, 42]
    myArray.forEach { println(it) }
    // There are also, ByteArray, ShortArray,
}
