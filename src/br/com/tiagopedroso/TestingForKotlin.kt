package br.com.tiagopedroso

fun main() {

    /**
     * Iterating over Range
     */
    println(" - for in .. -> ranges including upper bound")
    for (number in 1..9){
        print(number)
    }
    println("\n")

    println(" - for in until -> ranges excluding upper bound")
    for (number in 1 until 9){
        print(number)
    }
    println("\n")

    println(" - for in downTo -> decreasing ranges ")
    for (number in 9 downTo 1){
        print(number)
    }
    println("\n")

    println(" - for in downTo step -> decreasing ranges with step ")
    for (number in 9 downTo 1 step 2){
        print(number)
    }
    println("\n")


    /**
     * LISTS
     */
    println(" - for in -> lists")
    val list = listOf("a", "b", "c")
    for (element in list){
        println(element)
    }
    print("\n")

    println(" - for in index -> lists")
    for ((index, element) in list.withIndex()){
        println("$index: $element")
    }
    print("\n")

    /**
     *  MAP
     */
    println(" - for in -> maps")
    val map = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )
    for ((key, value) in map){
        println("$key = $value")
    }
    print("\n")


//    for (ch in "abc") {
//        print(ch)
//    }
//
//    println()
//
//    for (c in '0'..'9') {
//        print(c)
//    }
//
//    println()
//
//    for (c in '0' until '9') {
//        print(c)
//    }
//
//    println()

}