
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        BankAccount user = new BankAccount();
        user.withdraw(2000);

        MobilePhone phone = new MobilePhone();
        phone.powerOn();

        Product product = new Product();
        product.displayInfo();

        Car car = new Car();
        car.displayInfo();

    }  
}
