package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n = 0;
	int counter1=1;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter a number: ");
	n=keyboard.nextInt();
	while(counter1<=n){
	    String var = "["+counter1+"] ";
	    System.out.print(var);
	    counter1++;
    }
    }
}
