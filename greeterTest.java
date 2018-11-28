import com.sun.org.apache.xpath.internal.operations.Equals;

public class greeterTest{
    public static void main(String[] args) {
        Greeter g = new Greeter();
        String greeting = g.greet();
       System.out.println(greeting);
       String firstnameandlastname = g.greet("sant sah ");
       System.out.println(firstnameandlastname);
       String firstnameandlastname1 = g.greet("sant sah ", "root");
       System.out.println(firstnameandlastname1);

        // String greetingWithName = g.greet("Santosh");  
        // if (greeting.equals("Hello world") || greetingWithName.equals("Hello Santosh")){
        //     System.out.println("Test Sucesss");
        // } else{
        //     System.out.println("Test Fail");
        // }
    }


}