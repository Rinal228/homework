import java.util.Scanner;

public class Shit3{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.println("------" + "1" + "------");
		// int m = 2;
		// int n = 3;
		// int count = 0;
		// int count1 = 0;
		// int[][] array = new int[m][n];
		// int[] array1 = new int[m];
		// for (int i = 0; i < m; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		int element = scanner.nextInt();
		// 		array[i][j] = element;
		// 	}
		// }
		// for (int i = 0; i < m; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		int element = array[i][j];
		// 		while (element != 0) {
		// 			count1 += element % 10;
		// 			element /= 10;
		// 		}
		// 		if (count1 == 10) {
		// 			array1[i] = 1;
		// 		}
		// 		count1 = 0;
		// 	}
		// 	if (count > 1) {
		// 		break;
		// 	}
			
		// }
		// for (int i : array1) {
		// 	if (i == 1) {
		// 		count++;
				
		// 	} 
		// }
		// if (count == m) {
		// 	System.out.println("True");
		// } else {
		// 	System.out.println("False");
		// }
		

		System.out.println("------" + "2" + "------");
		int n = 7;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (n % 2 == 0) {
					if (i == n / 2 || i == n / 2 - 1 || j == 0 || j == (n - 1) || 
					(j + i) == (n - 1) || i == j) {
					System.out.print("1 ");
					} else {
					System.out.print("0 ");
					} 
				} else {
					if (i == n / 2 || j == 0 || j == (n - 1) || 
					(j + i) == (n - 1) || i == j) {
					System.out.print("1 ");
					} else {
					System.out.print("0 ");
					} 
				}

			
				
			}
			System.out.println();
		}

	} 
	  
}
     