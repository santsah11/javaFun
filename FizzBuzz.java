public class FizzBuzz {
    public void fizzBuzz(int number) {

        if (number%15==0 && number%5==0 && number%3==0 ){
            System.out.println("Fizz");
        }else if(number%5==0 || number%3==0){
            System.out.println("buzz");
        }else{
            System.out.println("fixxbuzz");
        }
        
    
    }
}