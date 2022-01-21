package br.com.tiagopedroso;

// Shortcut Convert Java to Kotlin: Ctrl + Alt + Shift + K

import java.io.IOException;

public class TestingExceptionsJava {

    static char variavel;

    public static void main(String[] args) {
        System.out.println(variavel);

        //RUNTIME EXCEPTIONS

        //Error: Exception 'java.io.IOException' is never thrown in the corresponding try block
//        try {
//            TestingExceptionsKt.aFunctionThatThrowRuntimeException();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        TestingExceptionsKt.aFunctionThatThrowRuntimeException();

        //Error: Exception 'java.io.IOException' is never thrown in the corresponding try block
//        try {
//            TryingExceptions.aFunctionThatThrowRuntimeException();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        TryingExceptions.aFunctionThatThrowRuntimeException();


        //CHECKED EXCEPTIONS

        //Error: Unhandled exception: java.io.IOException
//        TestingExceptionsKt.aFunctionHasThrowsAnnotation();
        try {
            TestingExceptionsKt.aFunctionHasThrowsAnnotation();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Error: Unhandled exception: java.io.IOException
//        TryingExceptions.aFunctionThatThrowCheckedException();
        try {
            TryingExceptions.aFunctionThatThrowCheckedException();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


class TryingExceptions {

    public static boolean aFunctionThatThrowCheckedException() throws IOException {
        throw new IOException();
    }

    public static boolean aFunctionThatThrowRuntimeException() {
        throw new RuntimeException();
    }
}