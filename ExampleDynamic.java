/*Create menu driven Program which dynamically takes Name and Email input from user and Display it. 

1. Take input from user
2. store it in some Array which contains objects of class as elements
3. create loop for displaying our menu
4. create menu options
5. Grab actual values from user and store it in object
6. Store object in Array
7. Moving to our Display part 
8. Access each array element and display values from the object
9. Also add option where user can terminate program */
import java.util.Scanner;
import java.util.ArrayList;
public class ExampleDynamic{
String Name,Email;
ExampleDynamic(String Name,String Email){
this.Name=Name;
this.Email=Email;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
ArrayList<ExampleDynamic> arr=new ArrayList();
String Name,Email;
int input;
while(true){
System.out.println("Enter your choice \n1.Enter details \n2.Display users \n3.Press 9 to exit.");
input=sc.nextInt();
//based on input handle the menu item
if(input==1){
System.out.println("Enter your Name: ");
Name=sc.next();
System.out.println("Enter your Email address: ");
Email=sc.next();
arr.add(new ExampleDynamic(Name,Email));
}
else if(input==2){
if(arr.size()==0){
System.out.println("Nothing to display here");
}
else{
System.out.println("User details are\n");
for(int i=0;i<arr.size();i++){
	System.out.println("Name is: "+arr.get(i).Name);
	System.out.println("Email is: "+arr.get(i).Email);
}
}
}
else if(input==9){ break;}
else{
System.out.println("Please enter valid input");
}
}

}
}
