import java.util.Scanner;
import java.util.regex.*;

public class Classwork{
	public static void main(String[] args) {
		System.out.println("------" + "1" + "------");
		String text = "Она сказала: \"Привет!\", а он ответил: \"Как дела?\", потом: \"Отлично!\"";
		Pattern.compile("\".*?\"").matcher(text).results().forEach(m -> System.out.println(m.group()));
		System.out.println();

		System.out.println("------" + "2" + "------");
		String logs = """
		[ERROR] 2024-01-15: Connection failed 
    [INFO] 2024-01-15: User logged in 
    [DEBUG] 2024-01-15: Processing request 
    [ERROR] 2024-01-15: Database timeout 
     """; 
     	Pattern pattern = Pattern.compile(".ERROR.*\\s");
     	Matcher matcher = pattern.matcher(logs);
    	while(matcher.find()) {
     		System.out.println(matcher.group());
     	}

     	System.out.println("------" + "3" + "------");
     	String html = """
     	<div class="product"> 
        <h3>Телефон</h3> 
        <p>Цена: 20000 руб</p> 
    </div> 
    <div class="product"> 
        <h3>Ноутбук</h3>  
        <p>Цена: 50000 руб</p> 
    </div> 
     """; 
     	Pattern.compile("<h3>.*?</h3>").matcher(html).results().forEach(m -> System.out.println(m.group()));
     	System.out.println();

		System.out.println("------" + "4" + "------");
		String csv = "Вика,18,Альметьевск;Анна,24,Казань;Аскар,6,Бугульма;";
		Pattern.compile(".*?;").matcher(csv).results().forEach(m -> System.out.println(m.group()));
		System.out.println();

		System.out.println("------" + "5" + "------");
		String post = "Сегодня был в #парке и #кино #отдых #выходные ";
		Pattern.compile("#.*?\\s").matcher(post).results().forEach(m -> System.out.println(m.group()));





	}
}