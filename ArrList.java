import java.util.*;

public class ArrList {

    public static void main(String[] args) {

        System.out.println("Hello Aarraylist");
        int[] myArray1 = {4, 8, 8, 5, 9};

        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(10);
        int num = myArray.get(0);
        System.out.println(num);

        ArrayList<Object> list = new ArrayList<Object>();
        list.add(10);
        list.add("Hello");
        list.add(new ArrayList<Integer>());
        list.add(new Double(12.0)); // adding a Double of value 12.0

        System.out.println(list); // [10, "Hello", [], 12.0]

    }
}