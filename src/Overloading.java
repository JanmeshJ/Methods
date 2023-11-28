import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
//        fun(45);
//        fun("Janmesh");
//        int ans = sum(10,20,70);
//        System.out.println(ans);
        demo(1,2,3,4,5);
        demo("Janmesh", "Rahul", "Gaurav", "Aakash");
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a ) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
