import java.lang.reflect.Array;
import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun();
        multiple(2, 3, "Janmesh", "Rahul", "Gaurav");

    }

    static void multiple(int a, int b, String ...v){
        int num = a;
        int num2 = b;
        System.out.println(a);
        System.out.println(b);
    }
    static void fun(int ...s){
        System.out.println(Arrays.toString(s));
    }
}
