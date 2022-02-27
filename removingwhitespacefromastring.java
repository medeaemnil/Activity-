package Emnil;

import java.util.Scanner;


public class removingwhitespacefromastring {

  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  
   
  System.out.println("Enter string to remove white space =  medea ");
   String str1 = sc.nextLine();
   
   System.out.println(" String with White Space = " + str1);
   
   String str2 = str1. replaceAll("\\s", "");
   System.out.println( "Final String without white space=" + str2);
   

  }

}