/*
Yonatan Mengesha

Accepting and displaying an array of books with title,author and description

java bootcamp
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Creating a Scanner object named keyboard

        Scanner keyboard= new Scanner (System.in);
        int size=25;//initialize the size of the array
        int counter=0;//create a counter to loop through the array
        String answere="";//Create a string variable and initialize it with an empty string



        //Create a String array with the name title
        String title[]= new String[size];
        //Create a String array with the name author
        String author[]= new String[size];
        //Create a String array with the name description
        String description[]= new String[size];



        //Create a while loop which will enter a record if the user want to continue and
        //displays the record if the user types quite
        while(!answere.equalsIgnoreCase ( "quite" ))
        {
            //Accepts from the keyboard the book title
            System.out.println ("Enter a Book title: " );
            title[counter]= keyboard.nextLine ();

            //Accepts from the keyboard the book author
            System.out.println ("Enter a Book Author: " );
            author[counter]= keyboard.nextLine ();

            //Accepts from the keyboard the book Description
            System.out.println ("Enter a Book Description: " );
            description[counter]=keyboard.nextLine ();


          //Askes the user to enter another a record and accepts input from the keyboard

            System.out.println ( "Enter another record: (Yes/quite)");
            answere=keyboard.nextLine ();

            //increments counter to loop through the array
            counter++;

        }

        //Displays the Array by iterating 

        System.out.println ("-----------------------------------------" );
        System.out.println ("|Title |"+"|Author   |" +"|   Description|" );
        System.out.println ("--------------------------------------" );
        for(int i=0;i<counter;i++)
        {

            System.out.println("|"+title[i]+"|" +"  " +"|"+  author[i]+"|"+"  "+"|"+description[i]+"|");

        }
        System.out.println ("|-----------------------------------------|" );

    }
}
