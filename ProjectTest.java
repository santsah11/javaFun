public class ProjectTest{
    public static void main(String[] args) {
        Project javaProject =  new Project();
        
         String javaProject1 = javaProject.elevatorPitch("sant  ", " This is your new Project");
         System.out.println(javaProject1);

         javaProject.setName("Speros");
         String myName = javaProject.getName();
         System.out.println(myName);
        
         javaProject.setName("Sant");
         String mySant = javaProject.getName();
         System.out.println(mySant);
         
    }

}