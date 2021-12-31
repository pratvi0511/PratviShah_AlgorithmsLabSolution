package com.greatlearning.dsa;
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the size of the transaction array: ");
		int size = s1.nextInt();
		int[] transactions = new int[size];
		System.out.println("Please enter the values of the transaction: ");
		for(int i=0; i<size; i++) {
			transactions[i] = s1.nextInt();						
		}
		System.out.println("Please enter the total number of targets that is to be achieved: ");
		int targetNo = s1.nextInt();
		while(targetNo > 0) {
			int flag = 0;
			int target;
			System.out.println("Please enter your target: ");
			target = s1.nextInt();
			long sumOfTransactions = 0;
			for(int i=0; i<size; i++) {
				sumOfTransactions += transactions[i];
				if(sumOfTransactions >= target) {
					System.out.println("The target is achieved after " + (i+1) + " transactions1.");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("The given target is not achieved.");
			}
			targetNo--;
		}
		System.out.println("You have finished your target check!");
	}
}