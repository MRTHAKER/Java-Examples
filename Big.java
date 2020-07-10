/*Create menu driven Program which dynamically takes Name and Email input from user and Display it. 
*/
import java.util.Scanner;
import java.util.ArrayList;
public class Big{
String name;
String email;
Big(String name,String email){
this.name=name;
this.email=email;
}

public static void main(String args[]){
ArrayList<Big> arr= new ArrayList();
int input;
Scanner sc=new Scanner(System.in);
String name,email;
while(true){
System.out.println("\nWELCOME \n1.Enter details\n2.Display");
input=sc.nextInt();
if(input==1){
System.out.println("\nEnter Name\n");
name=sc.next();
System.out.println("\nEnter Email\n");
email=sc.next();
arr.add(new Big(name,email));
System.out.println("Details added.");
}
else if(input==2){
if(arr.size()==0){
System.out.println("\nNothing to display\n");
}
else{
System.out.println("\nDetails are:");
for(int j=0;j<arr.size();j++){
System.out.println("\nName is: "+arr.get(j).name);
System.out.println("\nEmail id is: "+arr.get(j).email+"\n");
}
}
}
System.out.println("press 9 to exit otherwise press 0");
input=sc.nextInt();
if(input==9){
break;
}
}
}
}

