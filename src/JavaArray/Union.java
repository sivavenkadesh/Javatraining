package JavaArray;

import java.util.Arrays;
import java.util.Scanner;

public class Union {
    public static int[] sort(int[] array){
        for (int j=0;j< array.length;j++){
            for (int i=j+1;i< array.length;i++){
                if(array[j]>array[i]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }

    }
        return array;
    }
    public static  void tounite(int[] array1,int[]array2) {
        array1=sort(array1);
        array2=sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int toless=0;
        for (int j=0;j< array1.length;j++){
            if( (j== array1.length-1)||(array1[j]!=array1[j+1] )){
                for (int i=0;i<array2.length;i++){
                    if (array1[j]==array2[i]){
                        toless++;
                    }
                }
            }
        else  if (array1[j]==array1[j+1]){
                toless++;
            }
        }
        System.out.println(toless);
        int[] dup=new int[array1.length+ array2.length-toless];
        int of=0;
       for(int j=0;j< array1.length;j++){
           if((j== array1.length-1)||(array1[j]!=array1[j+1])){
               dup[of]=array1[j];
               of+=1;
           }
       }
       for (int j=0;j< array2.length;j++){
           int count=0;
               for (int i=0;i< array1.length;i++){
                   if((j== array1.length-1)||(array1[j]!=array1[j+1])){
                   if (array2[j]==array1[i]){
                  count++;}
               }
           }
               if (count==0){
                   dup[of]=array2[j];
                   of+=1;
               }
       }
     dup=sort(dup);
            System.out.println(Arrays.toString(dup));
    }

    public static void main(String[] args) {
        int []array1={1,4,2,3,4,5,6};
        int []array2={4,3,7,11,0,9,8,13,12};
        if (array1.length>array2.length){
        tounite(array1,array2);
    }
        tounite(array2,array1);
    }
}



