package javalearning;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class shape {
   String Substring(int sta,int end,String str){
      String toReturn ="";
      if (sta>=0) {
          for (int j = sta; j <= end; j++) {
              toReturn+=str.charAt(j);

          }
          return toReturn;
      }
      else {
          for (int j = sta; j >= end; j--) {
              toReturn += str.charAt(j);
          }

          return toReturn;
      }
  }
public static void main(String args[]){
    shape in =new shape();
  /*  Scanner o=new Scanner(System.in);
    System.out.println("Enter a string :");
    String p=o.nextLine();
    System.out.println("Stating index");

    int start=o.nextInt();
    System.out.println("Ending index");
    int end=o.nextInt();*/
    String p="hellowolrd";
    p.substring(-1);


    System.out.println("args = " +    in.Substring(1,3,p));
    System.out.println("args = " +    in.Substring(-1,-3,p));
  }
}


