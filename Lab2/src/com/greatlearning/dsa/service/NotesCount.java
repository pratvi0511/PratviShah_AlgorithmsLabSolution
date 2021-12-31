package com.greatlearning.dsa.service;

public class NotesCount {
	
	public void implementNotesCount(int notes[], int amt) {
		int noteCounter[] = new int[notes.length];
		try {
			for(int i=0; i<notes.length; i++) {
				if(amt > notes[i]) {
					noteCounter[i] = amt / notes[i];
					amt -= (noteCounter[i] * notes[i]);
				}
			}
			if(amt > 0) {
				System.out.println("The exact amount cannot be given with the highest denomination.");
			}
			else {
				System.out.println("Your payment in order to give minimum number of notes will be: ");
				for(int i=0; i<notes.length; i++) {
					if(noteCounter[i] != 0) {
						System.out.println(notes[i] + " : " + noteCounter[i]);
					}
				}
			}
		}
		catch(ArithmeticException ae){
			System.out.println(ae + "Note of denomination is invalid.");
		}
	}
}
