import java.util.Scanner;

public class Training{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.println("------" + "1" + "------");
		// System.out.print("Enter size: ");
		// int n = scanner.nextInt();
		// boolean status = false;
		// int degree = -1;
		// for(int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		int count = 1;
		// 		System.out.print("Enter element[" + i + "][" + j + "]: ");
		// 		int numb = scanner.nextInt();
		// 		int copyNumb = numb;
		// 		int renumb = 0;
		// 		numb /= 10;
		// 		while (numb != 0) {
		// 			count *= 10;
		// 			numb /= 10;
		// 		}
		// 		numb = copyNumb;
		// 		while(numb != 0) {
					
		// 			renumb += (numb % 10) * count;
		// 			count /= 10;
		// 			numb /= 10;
		// 		}
		// 		if(renumb == copyNumb) {
		// 			degree++;
		// 		}
		// 	}
		// 	if(degree <= i) {
		// 		status = true;
		// 	} else {
		// 		status = false;
		// 	}
		// }
		// if (degree == --n && status == true) {
		// 	System.out.println("Correct array");
		// } else {
		// 	System.out.println("Wrong array");
		// }

		// System.out.println("------" + "2" + "------");
		// System.out.print("Enter size: ");
		// int n = scanner.nextInt();
		// int saveCount = 0;
		// int count = -1;
		// int status = 0;
		// int[][] array = new int[n][n];
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		System.out.print("Enter element[" + i + "][" + j + "]: ");
		// 		int numb = scanner.nextInt();
		// 		array[i][j] = numb;
		// 	}
		// }
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		int number = array[j][i];
		// 		count = 0;
		// 		while (number != 0) {
		// 			count += number % 10;
		// 			number /= 10;
		// 		}
		// 		if (count == saveCount) {
		// 			status++;
		// 		} 
		// 		saveCount = count;
		// 	}
		// 	if (status == --n) {
		// 		System.out.println("Correct array");
		// 	} else {
		// 		System.out.println("Wrong array");
		// 	}

		// }

		// System.out.println("------" + "3" + "------");
		// System.out.print("Enter size: ");
		// int n = scanner.nextInt();
		// boolean status = false;
		// int numbCount = 0;
		// int[][] array = new int[n][n];
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		System.out.print("Enter element[" + i + "][" + j + "]: ");
		// 		int numb = scanner.nextInt();
		// 		array[i][j] = numb;
		// 	}
		// }
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		int count = 0;
		// 		numbCount = 0;
		// 		int numb = array[i][j];
		// 		int divide = 2;
		// 		while(divide < numb) {
		// 			if (numb % divide == 0) {
		// 				status = false;
		// 				break;
		// 			} else {
		// 				status = true;
		// 			}
		// 			divide++;
		// 		}
		// 		if (status == true) {
		// 			while(numb != 0) {
		// 				count += numb % 10;
		// 				numb /= 10;
		// 			}
		// 			divide = 2;
		// 			while(divide < count) {
		// 				if (count % divide == 0) {
		// 					status = false;
		// 					break;
		// 				} else {
		// 					status = true;
		// 				}
		// 				divide++;
		// 			}
		// 		}
				
		// 		if(status == true) {
		// 			numbCount++;
		// 			if (i != n - 1 && j != n -1) {
		// 				i++;
		// 				j = 0;
		// 			}
					
		// 		}

		// 	}
		// }
		// if(numbCount == --n) {
		// 	System.out.println("Correct array");
		// } else {
		// 	System.out.println("Wrong array");
			
		// }

		// System.out.println("------" + "4" + "------");
		// System.out.print("Enter size: ");
		// int n = scanner.nextInt();
		// int count = 0;
		// int part = 0;
		// int countNumb = 0;
		// boolean status = false;
		// int[][] array = new int[n][n];
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		System.out.print("Enter element[" + i + "][" + j + "]: ");
		// 		int numb = scanner.nextInt();
		// 		array[i][j] = numb;
		// 	}
		// }
		// for (int i = 0; i < n; i++) {
		// 	for(int j = 0; j < n; j++) {
		// 		int numb = array[i][j];
		// 		while (numb != 0) {
		// 			int number = numb % 10;
		// 			if(number < part) {
		// 				status = true;
		// 			} else {
		// 				status = false;
		// 			}
		// 			part = number;
		// 			numb /= 10;
					

		// 		}
		// 		part = 0;
		// 		if(status) count++;
		// 	}
		// 	if (count % 2 == 0 && count != 0) countNumb++;
		// }
		// if(countNumb == n) {
		// 	System.out.println("Correct array");
		// } else {
		// 	System.out.println("Wrong array");
			
		// }

		// System.out.println("------" + "5" + "------");
		// System.out.print("Enter size: ");
		// int n = scanner.nextInt();
		// int half = n / 2;
		// for (int i = 0; i < n; i++) {
		// 	for (int j = 0; j < n; j++) {
		// 		if(i == half || j == half) {
		// 			System.out.print("1 ");
		// 		} else {
		// 			System.out.print("0 ");
		// 		}
				
		// 	}
		// 	System.out.println();
		// }

		System.out.println("------" + "6" + "------");
		System.out.print("Enter size: ");
		int n = scanner.nextInt();
		int half1 = n / 2;
		int half2 = n / 2;
		int half3 = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j == half1 || j == half2 || i == half3 || j == half3) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
				
				
			}
			if (i == half3 || i == n-2) {
				half1--;
				half2++;
			} else {
				half2--;
				half1++;
			}

			System.out.println();
		}








		

	}
}