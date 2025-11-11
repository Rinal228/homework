import java.util.Scanner;

public class Expression{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.println("------" + "1" + "------");
		// System.out.print("Enter email: ");
		// String email = scanner.nextLine();
		// if(findEmails(email)) {
		// 	System.out.println("Like");
		// } else {
		// 	System.out.println("Dislike");
		// }
		
		// System.out.println("------" + "2" + "------");
		// System.out.print("Enter date: ");
		// String date = scanner.nextLine();
		// if(findDates(date)) {
		// 	System.out.println("Like");
		// } else {
		// 	System.out.println("Dislike");
		// }
		
		
		// System.out.println("------" + "3" + "------");
		// System.out.print("Enter sentence: ");
		// String sentence = scanner.nextLine();
		// if(text.matches(".+\\s[A-ZА-Я]+.*")) {
		// 	System.out.println("Like");
		// } else {
		// 	System.out.println("Dislike");
		// }
		
		
		// System.out.println("------" + "4" + "------");
		// System.out.print("Enter sentence: ");
		// String sentence = scanner.nextLine();
		// System.out.println(countDigits(sentence));

		

		// System.out.println("------" + "5" + "------");
		// String message = scanner.nextLine();
		
		// int count = 1;
		// for(int i = 0; i < message.length(); i++) {
		// 	char element = message.charAt(i);
		// 	if(element == ' ') count++;

		// }
		// String[] parts = new String[count];
		// int index = 0;
		// String word = "";
		// message += " ";
		// for(int i = 0; i < message.length(); i++) {
		// 	char element = message.charAt(i);
		// 	if(("" + element).matches("[\",:]")) {
				
		// 	} else {
		// 		if(element == '.' && message.charAt(i + 1) == ' ') {

		// 		} else {
		// 			if(element == ' ' || i == message.length() - 1) {
		// 			parts[index] = word;
		// 			index++;
		// 			word = "";
		// 			} else {
		// 				word += element;
		// 			}
		// 		}
				
		// 	}
			
			
			

		// }
		// System.out.println("Email-адреса:");
		// for(String part : parts) {
		// 	if(findEmails(part)) {
		// 		System.out.println(part);
		// 	}
		// }
		// System.out.println("Даты:");
		// for(String part : parts) {
		// 	if(findDates(part)) {
		// 		System.out.println(part);
		// 	}
		// }
		// System.out.println("Слова с заглавной буквы:");
		// for(String part : parts) {
		// 	if(findCapitalizedWords(part)) {
		// 		System.out.println(part);
		// 	}
		// }
		// System.out.print("Общее количество цифр: " + countDigits(message));

		System.out.println("------" + "6" + "------");
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		if(name.matches("([А-Я][а-я]+){1,15}")) {
			System.out.println("Like");
		} else {
			System.out.println("Dislike");
		}
	} 

	public static boolean findEmails(String text) {
		
		if(text.matches("[\\w.%+-]+@[a-z0-9.-]+\\.[a-zA-Z]{2,}+")) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean findDates(String text){
		if(text.matches("((([0-2][1-9]|[12][0-9]|3[01])\\.(0[13578]|1[02]))|((0[1-9]|[12][0-9]|30)\\.(0[469]|11))|((0[1-9]|1[0-9]|2[0-8])\\.02))\\.(19|20)[0-9]{2}")) {
			return true;
		} else {
			return false;
		}
	}  
	public static boolean findCapitalizedWords(String text){
		if(text.matches("[A-ZА-Я]+.*")) {
			return true;
		} else {
			return false;
		}

	}
	public static int countDigits(String text){
		int count = 0;
		for(int i = 0; i < text.length(); i++) {
			char element = text.charAt(i);
			String letter = element + "";
			if(letter.matches("\\d")) {
				count++;
			}
		}
		return count;

	} 
}