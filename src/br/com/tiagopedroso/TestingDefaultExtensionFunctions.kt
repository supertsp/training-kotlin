package br.com.tiagopedroso

fun main(args: Array<String>) {

    //List.joinToString
    val myList = listOf('a', 'b', 'c')
    println(myList.joinToString("", "(", ")"))

    //Array.getOrNull
    println("Hello, ${ args.getOrNull(0) }")

    //infix functions
    1.until(10)


    //Exercise: Sum as an extension function
    //before
    val sum = sum_before(listOf(1, 2, 3))
    println(sum)    // 6
    //after
    println(
        listOf(1, 2, 3).sum()
    )

    //Extensions don't hide members
    println("""
        Extensions don't hide members:
           Case 1: Expected = 2, but returned = ${A().foo()}
           Case 2: Expected = 3, and returned = ${A().foo(3)}
        """
    )

}

//Exercise: Sum as an extension function
//before
fun sum_before(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}
//after
fun List<Int>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

//Extensions don't hide members
class A {
    fun foo() = 1
}

fun A.foo() = 2 //Warning: Extension is shadowed by a member: public final fun foo(): Int

fun A.foo(number: Int) = number