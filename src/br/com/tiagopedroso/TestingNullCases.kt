package br.com.tiagopedroso

fun main() {

    //Nullable type
//    val stringNotNull: String = null //Null can not be a value of a non-null type String
    val stringWithNull: String? = null
    val length = stringWithNull?.length
    println(length) //length == Int?

    //Elvis operator
    val a: Int? = null
    val b: Int? = 1
    val c: Int = 2

    val s1 = (a ?: 0) + c
    val s2 = (b ?: 0) + c
    println("$s1$s2")

    //Not-null Assertion == Allow throws NullPointerException
    val logic: Boolean? = null
    val result = isEnabled(logic)
//    println(result.toString())

    //Testing nullable values
//    isFoo1(null)
    isFoo2(null)
    isFoo3(null)
    isFoo4(null)

    //Operator Precedence:
    //       ++ -- . ?. ? !      * / %           + -                  ?:    < > <= >=    == !==     &&              ||
    // FIRST Postfix/Prefix, Multiplicative and Additive, AFTER that Elvis, Comparison, Equality, Conjunction and Disjunction
    val x: Int? = 1
    val y: Int = 2
    val sum1 = x ?: 0 + y
    val sum2 = x?: (0 + y)  //the line above make this
    val sum3 = (x?: 0) + y  //marking the real intention
    println(
        "sum1: $sum1" +
        "sum2: $sum2" +
        "sum3: $sum3"
    )

}

fun isEnabled(test: Boolean?): Boolean =
    test!!.toString() !== ""

class Name(var value: String?) {
}

fun isFoo1(n: Name) = n.value == "foo"
fun isFoo2(n: Name?) = n?.value == "foo"
fun isFoo3(n: Name?) = n != null && n.value == "foo"
fun isFoo4(n: Name?) = n?.value == "foo"

//fun foo(list1: List<Int?>, list2: List<Int>?) {
//    list1.size
//    list2.size
//
//    val i: Int =
//            list1.get(0)
//    val j: Int =
//            list2.get(0)
//}

