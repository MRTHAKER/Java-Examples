import java.util.Scanner;
public class FindVowels{
String dummy;
FindVowels(String dummy){
this.dummy=dummy;//this.dummy refers to variable of class 
}

int Count(String vowel){
int count=0;
//run a for loop and find vowels in String
for(int i =0;i<vowel.length();i++){
if(vowel.charAt(i)=='a' || vowel.charAt(i)=='e' || vowel.charAt(i)=='i' || vowel.charAt(i)=='o' || vowel.charAt(i)=='u' || vowel.charAt(i)=='A' || vowel.charAt(i)=='E' || vowel.charAt(i)=='I' || vowel.charAt(i)=='O' || vowel.charAt(i)=='U'){
count++;
} 
}
return count;
}
String Replace(String vowel){
vowel=vowel.replaceAll("a","*");
vowel=vowel.replaceAll("e","*");
vowel=vowel.replaceAll("i","*");
vowel=vowel.replaceAll("o","*");
vowel=vowel.replaceAll("u","*");
vowel=vowel.replaceAll("A","*");
vowel=vowel.replaceAll("E","*");
vowel=vowel.replaceAll("I","*");
vowel=vowel.replaceAll("O","*");
vowel=vowel.replaceAll("U","*");
return vowel;
}



public static void main(String args[]){
//Execution begins from main method always 
//take input from user
Scanner sc=new Scanner(System.in);
System.out.println("Enter your string: ");
String vowel=sc.nextLine();
//initialize object of class 
FindVowels obj=new FindVowels("Dummy string");//calling constructor of class
//which will take string as paramteter
//count number of vowels in string
int count=obj.Count(vowel);
//replace vowels with * symbol
vowel=obj.Replace(vowel);
//print the output
System.out.println("Number of vowels found in your string are: "+count);
System.out.println(vowel);
System.out.println(obj.dummy);
//done
}
}
