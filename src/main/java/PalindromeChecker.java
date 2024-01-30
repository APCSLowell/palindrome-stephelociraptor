import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  //your code here
  String word2 = onlyLetters(word);
  if ((word2.toLowerCase()).equals(reverse(word2.toLowerCase()))){
    return true;
  }
  return false;
}
public String reverse(String str)
{
 String sNew = new String();
    //your code here
  for (int i = str.length(); i > 0; i--){
   // if (str.substring(i-1,i) != (" ") && Character.isLetter(str.charAt(i))){
      sNew = sNew + (str.charAt(i-1));
     //   }
  }
  return sNew;
}

  public String onlyLetters(String sString){
  String newS = "";
  for (int i = 0; i < sString.length(); i++){
    if (Character.isLetter(sString.charAt(i))){
      newS = newS + sString.charAt(i);
    }
  }
  return newS;
}
