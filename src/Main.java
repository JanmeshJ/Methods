import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        int swapped = swap(num1,num2);
        System.out.println(swapped);

    }

    static int swap(int a, int b){
        int temp = a;
        a = b;
        b = a;
        return a & b;
    }
}