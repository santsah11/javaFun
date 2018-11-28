import java.util.*;

public class forLoop {
    public static void main(String[] args) {

        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");
        // for (int i = 0; i < dynamicArray.size(); i++) {
        //     System.out.println(dynamicArray.get(i) +" "+ i);
        // }

        // for(int i = 0; i < dynamicArray.size(); i++){
        //     String name = dynamicArray.get(i);
        //     System.out.println("hello " + name);
        //     // other operations using name
        // }

        for(String name : dynamicArray){
            System.out.println(name + "   concate any word here to if you wannt");
            // other operations using name
        }
        
        

    }
} 