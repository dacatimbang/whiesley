import java.util.Scanner;
public class LabExer1A{

  public static void main (String [] args){
  
  Scanner sc = new Scanner (System.in);
  int faveNumber = 9;
  String faveCartChar = "obito";
  char mi = 'C';
  char[] nickNameArray = {'w','e','s'};
 
  
  System.out.println(faveNumber +" my favorite number"); // my favorite number is 9
  System.out.println(faveCartChar+" my favorite character"); // my favorite character is obito
  System.out.println(mi+" my middle initial"); // my middle initial is C
  System.out.print(nickNameArray[0]); // nickNameArray is wes
  System.out.print(nickNameArray[1]); // nickNameArray is wes
  System.out.print(nickNameArray[2]); // nickNameArray is wes
  
  }
}