import java.util.Arrays;

public class PuzzleJavaTest {
    public static void main(String[] args) {

        int[] myArray = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];

        }
        System.out.println(sum);

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 10) {
                System.out.println(myArray[i]);
            }
        }
        PuzzleJava puzzle = new PuzzleJava();
        puzzle.PrintArrstr();
        puzzle.moreThanFiveChar();
        // puzzle.suffleLetters();

        int[] result = puzzle.generateRand();
        System.out.println(Arrays.toString(result));
        
         int[]sortedresult = puzzle.generateRandAndSorted();

         System.out.println(Arrays.toString(sortedresult));
         puzzle.randString();
    }

}