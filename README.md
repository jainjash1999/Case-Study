# Case-Study

package caseStudy;

import java.util.*;

public class CountLettersInArray {

	private static char[] createArray(char[] arrch, int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Characters in the array");
		for (int i = 0; i < n; i++) {
			arrch[i] = sc.next().charAt(0);
		}
		return arrch;
	}

	private void displayArray(char[] array) {
		System.out.println("Entered elements are: ");
		for (int i = 0; i < array.length; i++) {
			if (i == 20) {
				System.out.println();
			}
			if (i < 20) {

				System.out.print(array[i] + " ");
			}

			else
				System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	private void dispalyCounts(char[] array) {
		int n = array.length;
		boolean visited[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			visited[i] = false;
		}
		System.out.println();
		System.out.println("No of occurence of each Element");
		for (int i = 0; i < n; i++) {

			if (visited[i] == true)
				continue;

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (array[i] == array[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(array[i] + " no. of times: " + count);
		}

	}

	public static void main(String[] args) {
		CountLettersInArray obj = new CountLettersInArray();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements in arrays: ");
		int n = sc.nextInt();
		char arrch[] = new char[n];

		char array[] = obj.createArray(arrch, n);

		obj.displayArray(array);

		obj.dispalyCounts(array);
	}

}
