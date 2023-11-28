import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        int a = 10;
        int b = 20;
        {
            a = 78;
            int c = 99;
        }
        System.out.println(a);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
