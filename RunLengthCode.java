/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runlengthcode;
import java.util.*;

public class RunLengthCode {
    
public static void printRLC(String inputString){

    

int count =1;
String newString = "";

for(int i =1; i <inputString.length()-1; i++)
{
char currentChar = inputString.charAt(i);
char nextChar = inputString.charAt(i+1);

if (currentChar== nextChar){
count++;
}
else if(currentChar != nextChar && count ==0){
        newString+= currentChar;
        
System.out.print(currentChar);
System.out.print(count);
}
else if (currentChar != nextChar && count+1>4){
newString += "/";
newString += "0";
newString += String.valueOf(count + 1);
count = 0;
newString += currentChar;
}
else if (currentChar != nextChar && count+1<=4){
System.out.print(currentChar);
System.out.print(count);
    
}
}
}

    

public static void main(String[] args) 
    {
String str="wwwwaaadexxxxxxywww";
printRLC(str);
        }
    
}
