package com.eS;

public class ParsingValuesFromString {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2018.125";
        System.out.println("numberAsString " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number " + number);

        numberAsString += 1;
        System.out.println("numberAsString " + numberAsString);
        number += 1;
        System.out.println("number " + number);


    }
}
