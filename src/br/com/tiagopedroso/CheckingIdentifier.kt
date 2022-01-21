package br.com.tiagopedroso

fun isValidIdentifier(text: String): Boolean {
    //using 'in' operator
//    fun isValidChar(char: Char) =
//            char == '_' ||
//            char in '0'..'9' ||
//            char in 'a'..'z' ||
//            char in 'A'..'Z'

    //using Char methods
    fun isValidChar(char: Char) =
            char == '_' ||
            char.isLetterOrDigit()

    //using 'in' operator
//    if (text.isBlank() || text[0] in '0'..'9') return false

    //using Char methods
    if (text.isBlank() || text[0].isDigit()) return false

    for (char in text) {
        if (!isValidChar(char)) return false
    }

    return true
}

fun isValidIdentifierWithRegex(text: String): Boolean {
    return "^[a-zA-Z_][a-zA-Z0-9_]+\$".toRegex() in text
}

fun main(args: Array<String>) {
    println("== Kotlin Local Function  \t\t == Kotlin Regex")
    println("${isValidIdentifier("named")} \t\t\t\t\t\t\t ${isValidIdentifierWithRegex("named")}")   // true
    println("${isValidIdentifier("_name")} \t\t\t\t\t\t\t ${isValidIdentifierWithRegex("_name")}")   // true
    println("${isValidIdentifier("_12")} \t\t\t\t\t\t\t ${isValidIdentifierWithRegex("_12")}")       // true
    println("${isValidIdentifier("")} \t\t\t\t\t\t\t ${isValidIdentifierWithRegex("")}")             // false
    println("${isValidIdentifier(".012")} \t\t\t\t\t\t\t ${isValidIdentifierWithRegex(".012")}")     // false
    println("${isValidIdentifier("no$")} \t\t\t\t\t\t\t ${isValidIdentifierWithRegex("no$")}")       // false
}