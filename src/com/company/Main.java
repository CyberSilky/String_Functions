package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String p = "   Panda";
        String f = " Fish ";
        String h = "Horse     ";
        String c = " Cat";
        String nothing = " ";
        String[] strings = {p, f, c, h, nothing}; // created an array for the strings

        for (String s : strings) //for each string in the string array we are going to manipulate it
        {
            System.out.println(s); //prints out their initial state
            s = s.trim(); //this takes out the front and back spaces
            System.out.println(s); //prints out the string again to see the string trimmed

            if (!s.isEmpty()) //checks to see if the word is empty
            {
                System.out.println("Not empty: " + s); //if the word is not empty this will print out the word notice adding the plus sign and the variable name s
            }

            if (s.length() > 3) //if the length of the string is greater than 3 then run the code below
            {
                System.out.println("More than 3: " + s);
            }

            if (s.length() >= 3) //if the length of the string is greater than or equal to 3 then run the code below
            {
                System.out.println("Greater than or equal to 3: " + s);
            }

            System.out.println(s.toLowerCase()); //prints out the word in lowercase
            System.out.println(s.toUpperCase()); //prints out the word in uppercase

            System.out.println(); //gives the words some space


        }
    }
}
