package com.bridgelabz;
import java.util.*;
public class SubsetArray {
	
	public static void main(String[] args) {
		int arr1 [] = {1,2,3,4,5};
		int arr2 [] = {3,4,5};
		
		int m = arr1.length;
		int n = arr2.length;
		
		if (isSubset(arr1, arr2, m, n))
			System.out.println("arr2[] is" + "subset of arr1[] ");
		
		else
			System.out.println("arr2[] is" + "not subset of arr1[]");
	}

		private static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
		return false;
	}
}
		
//Write a program to determine the array is a subset of another array
//arr1 = {1,2,3,4,5}  , arr2 = {3,4,5}
//arr2 is a subset of arr1 (As, arr1 contains all the elements of arr2)