package com.example.exercises.exercise1;

public class FatorialNumber {
   
    long number;
    long result;
    String message;

    public FatorialNumber(long number) {
        this.number = number;
        this.result = fatorial(number);
        this.message = "Fatorial de " + number + ": " + result;
    }

    public long getNumber() {
        return number;
    }

    public long getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }
    

    public static long fatorial(long number) {
        long result = 1;
        if (number > 0) {
            for (long i = number; i > 0; i--) {
                result *= i;
            }
        }
        return result;
    }
}

//para resultados com numeros maiores de 100, usar BigInteger.
//https://www.geeksforgeeks.org/biginteger-class-in-java/
