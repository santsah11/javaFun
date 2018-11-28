import jdk.nashorn.internal.objects.annotations.Setter;

public class Project {

     private String  name; 
     public void setName(String name) { this.name = name; }    
     public String getName() { return name; }
  
     private String description;
     public String getDescription() {
         return description;
     }
     public void setDescription(String description) {
         this.description = description;
     }


    public String elevatorPitch(String name, String description) {
        return name +":"+ description;
    }

    public Project() {
    
    }

    public Project(String name) {

    }

    public Project(String name, String description) {
       
    }  

}
