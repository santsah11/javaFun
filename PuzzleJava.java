import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.*;
import java.lang.*;

public class PuzzleJava {

    ArrayList<String> names = new ArrayList<String>();

    public void PrintArrstr() {

        names.add("Nany");
        names.add("Jinichi");
        names.add("FujiBaysahi");
        names.add("NOmochi");
        names.add("Ishika");
        Collections.shuffle(names);
        System.out.println(names);

    }

    public void moreThanFiveChar() {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 5) {
                System.out.println(names.get(i));
            }
        }
    }

    public void suffleLetters() {
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'x' };

        System.out.println(letters);
        for (int i = 0; i < letters.length; i++) {
            Random rand = new Random();

            int randomNum = rand.nextInt(letters.length) + 0;
            char temp = letters[i];
            letters[i] = letters[randomNum];
            letters[randomNum] = temp;
            System.out.println(letters);
        }

    }

    public int[] generateRand() {
        int[] myArray;
        myArray = new int[10];
        Random r = new Random();
        int low = 55;
        int high = 100;
        for (int i = 0; i < myArray.length; i++) {
            int result = r.nextInt(high - low) + low;

            myArray[i] = result;
            System.out.println(result);
        }
       
        return myArray;
    }
    public int[] generateRandAndSorted() {
        int[] myArray;
        myArray = new int[10];
        Random r = new Random();
        int low = 55;
        int high = 100;
        for (int i = 0; i < myArray.length; i++) {
            int result = r.nextInt(high - low) + low;

            myArray[i] = result;
            
        }
        Arrays.sort(myArray);
        int min = myArray[0];
        System.out.println(min);
        int max = myArray[myArray.length-1];
        System.out.println(max);
       
        return myArray;
    }
  
     public void randString() {
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'x' };
            String  myString = "";

        for (int i = 0; i < 5; i++) {
            Random rand = new Random();

            int randomNum = rand.nextInt(letters.length) + 0;
            myString += letters[randomNum];
        }
        System.out.println(myString);

    }
}