//creating class here
public class JavaFirstExample{
    String FirstName,LastName;
    int Age;
    JavaFirstExample(String FirstName,String LastName,int Age){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Age=Age;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public int getAge(){
        return Age;
    }
    public static void main(String args[]){
        JavaFirstExample obj=new JavaFirstExample("John", "doe", 21);
        System.out.println("Name is "+obj.getFirstName()+" "+obj.getLastName());
        System.out.println("Age is: "+obj.getAge());
    }
}