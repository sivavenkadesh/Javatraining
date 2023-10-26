package JavaArray;

import java.util.Arrays;

public class maxFind {
    public static int [] tocheck(int array[],int num){
       int n;
       for (int i=0;i< array.length;i++){
               n=array[i];
           if (i!=0){
          n+=array[i];

           }
       }

        return null;
    }

    public static void main(String[] args) {
        int array[]={0,1,1,3,4,8,10};
        int num=5;
       System.out.println(Arrays.toString(tocheck(array,num)));
    }
}
