package br.com.tiagopedroso


fun main() {

    /**
     * 'in' using like range
     */
    println(" - function in .. -> validating ranges")
    println("isLetterNormal('a'): ${isLetterNormal('a')} \t isLetterShort('a'): ${isLetterShort('a')}")
    println("isLetterNormal('1'): ${isLetterNormal('1')} \t isLetterShort('1'): ${isLetterShort('1')}")
    println("isLetterNormal('Ç'): ${isLetterNormal('Ç')} \t isLetterShort('Ç'): ${isLetterShort('Ç')}")
    println("isLetterNormal('%'): ${isLetterNormal('%')} \t isLetterShort('%'): ${isLetterShort('%')}")
    println("isLetterNormal('á'): ${isLetterNormal('á')} \t isLetterShort('á'): ${isLetterShort('á')}")
    println("isLetterNormal('Z'): ${isLetterNormal('Z')} \t isLetterShort('Z'): ${isLetterShort('Z')}")
    println("\n")

    /**
     *  NOT 'in' using like range
     */
    println(" - function NOT in .. -> validating ranges")
    println("isNotDigit('a'): ${isNotDigit('a')}")
    println("isNotDigit('1'): ${isNotDigit('1')}")
    println("isNotDigit('Ç'): ${isNotDigit('Ç')}")
    println("isNotDigit('%'): ${isNotDigit('%')}")
    println("isNotDigit('á'): ${isNotDigit('á')}")
    println("isNotDigit('Z'): ${isNotDigit('Z')}")
    println("\n")

    /**
     *  'when' 'in' using like range
     */
    println(" - function when in .. -> validating ranges")
    println("recognizeChar('a'): ${recognizeChar('a')}")
    println("recognizeChar('1'): ${recognizeChar('1')}")
    println("recognizeChar('Ç'): ${recognizeChar('Ç')}")
    println("recognizeChar('%'): ${recognizeChar('%')}")
    println("recognizeChar('á'): ${recognizeChar('á')}")
    println("recognizeChar('Z'): ${recognizeChar('Z')}")
    println("\n")

}


fun isLetterNormal(c: Char): Boolean {
    return c in 'a' .. 'z' || c in 'A' .. 'Z'
}

fun isLetterShort(c: Char) = c in 'a' .. 'z' || c in 'A' .. 'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognizeChar(c: Char) = when (c) {
    in '0'..'9' -> "It's a Digit"
    in 'a'..'z', in 'A'..'Z' -> "It's a Letter"
    else -> "I don't know"
}