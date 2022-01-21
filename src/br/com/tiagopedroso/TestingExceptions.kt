package br.com.tiagopedroso

import java.io.IOException

fun main() {

}

fun aFunctionThatThrowRuntimeException() { throw IOException() }

@Throws(IOException::class)
fun aFunctionHasThrowsAnnotation() { throw IOException() }
