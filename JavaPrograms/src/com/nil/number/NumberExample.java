package com.nil.number;

public class NumberExample {

	public void findDuplicateNo() {
		int[] arr = { 11, 5, 6, 7, 7, 59, 5, 77, 11 }; // 11 5 7 are duplicate no
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("duplicate element::" + arr[i]);
				}
			}
		}
	}

	public void sortArray() {
		int[] arr = { 11, 5, 6, 7, 7, 59, 5, 77, 11 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("sorted array::");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public void reverseNumber(int num) {
		int reminder, sum = 0;
		while (num > 0) {
			reminder = num % 10;
			sum = (sum * 10) + reminder;
			num = num / 10;
		}
		System.out.println("Reverse number::" + sum);
	}

	public void checkPalidrome(int num) {
		int temp=num;
		
		int reminder, sum = 0;
		while (num > 0) {
			reminder = num % 10;
			sum = (sum * 10) + reminder;
			num = num / 10;
		}
		
		if(temp==sum) {
			System.out.println("given no is palidrome ");
		}else {
			System.out.println("given no is not palidrome ");

		}
		
	}

	public void factorial(int num) {
		int fact=1;
		for (int i = 1; i <= num; i++) {
			fact=fact*i;
			
		}
		System.out.println("factorial is :"+fact);
	}
}
