package br.com.tiagopedroso

fun main() {
    println("a".repeat(4))
}

fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}


//fun main() {
//    val data1 = LocalDate.parse("2000-01-01");
//    val data2 = LocalDate.now();
//    val dataResult = data1 + data2;
//    println("data1: $data1")
//    println("data2: $data2")
//    println("dataResult: $dataResult")
//}
//
//operator fun LocalDate.plus(date: LocalDate): LocalDate {
//    println(this)
//    return this.plus(date.toEpochDay(), )
////    return this
//}
