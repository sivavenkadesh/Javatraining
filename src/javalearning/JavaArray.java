package javalearning;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray {
    public static void main(String args[]) {
        System.out.println("Enter a no of student :");
        Scanner scan = new Scanner(System.in);
        int noStd = scan.nextInt();
        String[] collectionOfName = new String[noStd];
        int[] collectionOfTotal = new int[noStd];
        String[] sub = {"Tamil", "English", "Maths", "Chemistry", "Physics"};

        for (int j = 0; j < noStd; j++) {
            System.out.println("Enter a Student name :");

            collectionOfName[j] = scan.next();
            String in=scan.nextLine();
            int total = 0;
            for (int i = 0; i < sub.length; i++) {

                System.out.println("Enter a " + sub[i] + " : ");
                int mark = scan.nextInt();
                if (mark < 101) {
                    total += mark;
                }
            }
            collectionOfTotal[j] = total;
            System.out.println("The total for Student " + collectionOfName[j] + " " + total);


        }
        sortfunction(collectionOfTotal,collectionOfName);

    }

 static    void sortfunction(int array[],String aray[])
    {for(int j=0;j< array.length;j++){
        for (int i=j+1;i< array.length;i++){
            int temp=array[j];
            String tem=aray[j];
            if(array[i]>temp){
                aray[j]=aray[i];
                array[j]=array[i];
                array[i]=temp;
                aray[i]=tem;
            }
        }

    }
        for(int i=0;i<array.length;i++) {
            System.out.println("The " + (i + 1) + "mark is " + aray[i] + " with " + array[i] + " total! ");

        }

        }


}
