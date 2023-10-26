package javalearning;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram {
    public static void main(String args[]){ {
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of a an array:");
        int len=scan.nextInt();
        int [] ary=new int[len];
        for (int j=0;j<len;j++){
            int temp=scan.nextInt();
            ary[j]=temp;
        }
        System.out.println(Arrays.toString(ary));

       sort(ary);

    }
    public static void sort(int []array){
        int of=0;
        int toknow=0;
        while(of<array.length){
            int count1=0;
        for(int j=of;j<array.length;j++){
            int count=0;
            for (int i=0;array.length>i;i++){
                if (array[j]==array[i]){
                    count++;
                }
            }
            if (count>count1){
                count1=count;
                toknow=j;
            }
        }
            for (int i=0;i<array.length;i++){
                if (array[i]==array[toknow]){
                    int temp=array[of];
                    array[of]=array[toknow];
                    toknow=of;
                    of++;
                    array[i]=temp;
            }
        }
        }
        System.out.println(Arrays.toString(array));
    }

}




