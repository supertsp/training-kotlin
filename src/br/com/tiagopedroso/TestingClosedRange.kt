package br.com.tiagopedroso

import java.time.LocalDate

fun main() {

    val intRange: IntRange = 1..9
    val anotherIntRange = 1 until 10
    val charRange: CharRange = 'a'..'z'
    val stringRange: ClosedRange<String> = "ab".."az"
    val dateRange: ClosedRange<LocalDate> = LocalDate.parse("2021-12-25")..LocalDate.parse("2022-01-31")

    println("intRange: $intRange")
    println("anotherIntRange: $anotherIntRange")
    println("charRange: $charRange")
    println("stringRange: $stringRange")
    println("dateRange: $dateRange")

    println()

    val languageRange = "Java".."Scala"
//    val languageRange:Boolean = "Kotlin" in "Java".."Scala"
    val isInsideLetters1: Boolean = "kk" in "aa".."ka"
    val isInsideLetters2: Boolean = "kk" in "aa".."kk"
    val isInsideLetters3: Boolean = "kk" in "aa".."m"

    println("\"Kotlin\" in \"Java\"..\"Scala\": " + ("Kotlin" in languageRange))
    println("\"Kotlin\" in setOf(\"Java\", \"Scala\"): " + ("Kotlin" in setOf("Java", "Scala")))
    println("\"kk\" in \"aa\"..\"ka\": $isInsideLetters1")
    println("\"kk\" in \"aa\"..\"kk\": $isInsideLetters2")
    println("\"kk\" in \"aa\"..\"m\": $isInsideLetters3")

    println()

    val myDate = LocalDate.parse("2022-01-03")
    val startDate = LocalDate.parse("2021-12-25")
    val endDate = LocalDate.parse("2022-01-31")
    println("myDate >= startDate && myDate <= endDate: " + (myDate >= startDate && myDate <= endDate))
    //using "range check"
    println("myDate in startDate..endDate: " + (myDate in startDate..endDate))

    println()

}