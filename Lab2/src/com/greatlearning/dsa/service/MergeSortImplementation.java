package com.greatlearning.dsa.service;

public class MergeSortImplementation {
	
	public void merge(int arr[], int lft,int mid, int rght) {
		int n1 = mid - lft + 1;
		int n2 = rght - mid;
		
		int lftarr[] = new int [n1];
		int rghtarr[] = new int [n2];
		
		for(int i=0; i<n1; i++) {
			lftarr[i] = arr[lft+i];
		}
		
		for(int j=0; j<n2; j++) {
			rghtarr[j] = arr[mid+1+j];
		}
		
		int i = 0;
		int j = 0;
		int k = lft;
		
		while(i<n1 && j<n2) {
			if(lftarr[i] >= rghtarr[j]) //Decreasing order that's why >= or else <=
			{
				arr[k] = lftarr[i];
				i++;
			}
			else {
				arr[k] = rghtarr[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = lftarr[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = rghtarr[j];
			j++;
			k++;
		}
	}
	
	public void mergeSort(int notes[], int lft, int rght) {
		if(lft < rght) {
			int mid = (lft + rght) / 2;
			mergeSort(notes, lft, mid);
			mergeSort(notes, mid+1, rght);
			merge(notes, lft, mid, rght);
		}
	}
}