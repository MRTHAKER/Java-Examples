/*Create simple login system for different types of users
1.admin,2.manager,3.HR(Human Resource). 
*/
import java.util.Scanner;
class ExampleConditional{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int answer;
String username,password;
//create array to display list of users
String arr[]={"Admin","Manager","HR(Human Resource"};
//create never ending loop to display menu
while(true){
System.out.println("1.Login\n2.Display users\n\t ENTER YOUR CHOICE");
answer=sc.nextInt();
if(answer==1){
//ask for credentials
System.out.println("Which user you are?");
username=sc.next();
System.out.println("Enter your Password: ");
password=sc.next();
//handle user based on username
switch(username){
case "Admin":
//handle admin
if(password.equalsIgnoreCase("Admin1234")){
System.out.println("Welcome Admin");
}
else{
System.out.println("Wrong Password");
}
break;
case "Manager":
//handle manager
if(password.equalsIgnoreCase("Manager1234")){
System.out.println("Welcome Manager");
}
else{
System.out.println("Wrong Password");
}
break;
case "HR":
//handle HR
if(password.equalsIgnoreCase("HR1234")){
System.out.println("Welcome HR");
}
else{
System.out.println("Wrong Password");
}
break;
default:
//If user input anything else handle here
System.out.println("Invalid User");
break;
}
}
else if(answer==2){
//display all users from array
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}
}
}
