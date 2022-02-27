package Emnil;

public class findingthefirstnonrepeatedcharacter {

  public static void main(String[] args) {
   
  String inputStr = " Medea";
  for(char i : inputStr. toCharArray()) {
    if(inputStr.indexOf(i) == inputStr. lastIndexOf(i)) {
      
      System.out.println("First non repeated character is; " +i);
      
    }
  }
  

  }

}