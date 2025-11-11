import java.util.Scanner;

public class Class{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите текст: ");
		String sentence = scanner.nextLine();
		System.out.println("Выберите действие: \n1. Найти подстроку \n2. Заменить подстроку \n3. Разбить строку на слова \n4. Объединить слова в строку \n0. Выход ");
		int numb = scanner.nextInt();
		scanner.nextLine();
		if(numb == 1) {
			System.out.print("Введите подстроку: ");
			String subString = scanner.nextLine();
			findSubstring(sentence, subString);
		} else if(numb == 2) {
			System.out.print("Введите подстроку для замены: ");
			String subString = scanner.nextLine();
			System.out.print("Введите новую подстроку: ");
			String newString = scanner.nextLine();
			replaceSubstring(sentence, subString, newString);
		} else if(numb == 3) {
			System.out.println("Слова: ");
			splitWords(sentence);
		} else if(numb == 4) {
			System.out.print("Введите слова через запятую: ");
			String parts = scanner.nextLine();
			joinWords(parts);
		} else {

		}


	}
	public static int findSubstring(String string, String substring) {
		int index = 0;
		
		for(int i = 0; i < string.length(); i++) {
			String partString = "";
			for(int j = i; j < substring.length() + i; j++) {
				char nextLetter = string.charAt(j);
				partString += nextLetter;
			}
			if(partString.equals(substring)) {
				System.out.println("Найдено в позиции: " + i);
				index = i;
				break;
			}
		}
		return index;
		
	}
	public static void replaceSubstring(String string, String substring, String newstring) {
		int index = findSubstring(string, substring);
		for (int i = 0; i < string.length(); i++) {
			char letter = string.charAt(i);
			if(i == index) {
				i += substring.length() - 1;
				System.out.print(newstring);
			} else {
				System.out.print(letter);
			}
			
		}

	}
	public static void splitWords(String string) {
		String partString = "";

		for(int i = 0; i < string.length(); i++) {
			
			char letter = string.charAt(i);
			partString += letter;
			if(letter == ' ' || i == string.length() - 1) {
				System.out.println(partString);
				partString = "";
			}

			
			

		}

	}
	public static void joinWords(String string) {
		String partString = "";

		for(int i = 0; i < string.length(); i++) {
			
			char letter = string.charAt(i);

			if(letter == ',') {
				System.out.print(' ');
			} else {
				System.out.print(letter);
			}
			

			
			

		}

	}

}