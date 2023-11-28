import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        String person = greeting(name);
        System.out.println(person);
    }

    static String greeting(String name) {
        String message = "Hello " + name;
        return message;
//        System.out.println("kaise ho tum?" + greet);
    }
}