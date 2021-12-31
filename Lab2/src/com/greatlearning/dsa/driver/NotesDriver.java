package com.greatlearning.dsa.driver;
import java.util.Scanner;
import com.greatlearning.dsa.service.*;

public class NotesDriver {
	public static void main(String[] args) {
		MergeSortImplementation msi = new MergeSortImplementation();
		NotesCount nc = new NotesCount();
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the size of the Currency denominations: ");
		size = s.nextInt();
		System.out.println("Please enter the Currency denomination values: ");
		int noteDenomination[] = new int[size];
		for(int i=0; i<size; i++) {
			noteDenomination[i] = s.nextInt();
		}
		System.out.println("Please enter the amount you want to pay: ");
		int amt = s.nextInt();
		msi.mergeSort(noteDenomination, 0, noteDenomination.length-1);
		nc.implementNotesCount(noteDenomination, amt);
	}
}
