package com.company;

import java.util.Scanner;

// 1. Get 2 numbers from user.  (number1, number2)
// 2. print out the Sum of the 2 numbers.  (+)
// 3. print out the subtraction of the numbers. and write description (-)
// 4. print out numbers multiplication. and write description (*)
// 4. print out numbers division. and write description (/)

// 5. print out the remaining of number1 with number2 (number1 % number2). and write description // מציאת שארית

public class Main {

    public static void main(String[] args) {

      Scanner s = new Scanner(System.in); /// I want to get input from user

        /*System.out.println("Enter your Name - ");
        String name = s.nextLine(); // getting the input

        System.out.println("Hey " + name);

        System.out.println("Enter number - ");
        int number = s.nextInt();
        System.out.println("your number is: " + (number + 10) );*/

        System.out.println("Enter first Number: ");
        float number1 = s.nextFloat();
        System.out.println("Enter second Number: ");
        float number2 = s.nextFloat();


        System.out.println("number1 + number2 = " + (number1 + number2));
        System.out.println("number1 - number2 = " + (number1 - number2));
        System.out.println("number1 * number2 = " + (number1 * number2));
        System.out.println("number1 / number2 = " + (number1 / number2));
        System.out.println("number1 % number2 = " + (number1 % number2));

        /*// int #$%^&*(); // Error!
      //String 8A;     // Error!
      int _number;     // not Error!
      int $number;     // Not Error!
      int people in_party ; ?? Error!*/

      /*int peopleInParty = 100;
      peopleInParty = peopleInParty + 80;
      peopleInParty = ++peopleInParty;
      System.out.println(peopleInParty);
      peopleInParty -=10;
      peopleInParty += 20;
      System.out.println(peopleInParty);*/


    }

}