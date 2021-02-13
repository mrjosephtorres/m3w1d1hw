package org.perscholas.m3w1d1hw;

public class Main {

    // 1. Write a Java program that reverse a word.

    public static void main(String[] args) {

        String myName = "Try again";
        String reversedName = new StringBuilder(myName).reverse().toString();
        System.out.println(reversedName);
        primeNumChecker();
        getUp(4);
    }

//    2. Write a Java program that prints all prime numbers from 1-20 using a while loop.

    public static void primeNumChecker() {

        int primeNumberCheck;
        int n = 1;
        int divisibleCount;

        while (n <= 20) {
            divisibleCount = 0;
            primeNumberCheck = 2;
            while (primeNumberCheck <= n / 2) {
                if (n % primeNumberCheck == 0) {
                    divisibleCount++;
                    break;
                }
                primeNumberCheck++;
            }
            if (divisibleCount == 0 && n != 1) {
                System.out.print(n + " ");
            }
            n++;
        }
    }

//  3. We have a parrot that like to squawk at night in its cage when it's scared.
//  Write a method named getUp that has 2 parameters.
// 1st parameter should be a boolean and be name squawking to represent if the parrot is squawking.
// 2nd parameter represents the hour of the day and is an int named currentHour.
// Has a valid range of 0 - 23.
// We have to get up if the parrot is squawking before 6 or after 22 hours.
// So in that case return true.
// All other cases will return false.
// If the currentHour parameter is less than 0 or greater than 23 return false.

    public static void  getUp(int currentHour) {
        boolean squawking = false;
        while (currentHour <= 23){
            if(currentHour < 6 || currentHour > 22){
                squawking  = true;
                System.out.println( "Get up");
                break;
            }else{
                squawking  = false;
                System.out.println( "Go back to sleep");
            }   break;
        }
    }
}
