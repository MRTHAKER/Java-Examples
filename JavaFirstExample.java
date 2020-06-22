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
        //created object of class
        JavaFirstExample obj;
        obj=new JavaFirstExample("John", "doe", 21);//initialized object
        System.out.println("Name is "+obj.getFirstName()+" "+obj.getLastName());
        System.out.println("Age is: "+obj.getAge());
        //print example 
        System.out.println("Hello i am from main method");
        //accessed the methods of our class
        JavaFirstExample obj2=new JavaFirstExample("random", "abc", 12);
        System.out.println("Name is "+obj2.getFirstName()+" "+obj2.getLastName());
        System.out.println("Age is: "+obj2.getAge());
    }
}