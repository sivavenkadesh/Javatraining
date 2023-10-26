package JavaArray;

import java.util.Scanner;
import java.util.Arrays;

public class SortingWithLength {
    public static void Sort(int array[]) {
        for (int j = array.length-1; j >0; j--) {
            for (int i = j-1; i >= 0; i--) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
System.out.println(Arrays.toString(array));
        int of=0;
        int toKnow=0;
        while(of< array.length) {
            int count1 = 0;
            for (int j = of; j < array.length; j++) {
                int count = 0;
                for (int i = 0; i < array.length; i++) {
                    if ((j == array.length - 1) || (array[j] != array[j + 1])) {
                        if (array[j] == array[i]) {
                            count++;
                        }
                    }
                }
                if (count > count1) {
                    count1 = count;
                    toKnow=j;
                }
            }
            int end=count1+of;
            for (int j=of;j<end;j++){
                int temp=array[j];
                array[j]=array[toKnow];
                of++;
                array[toKnow]=temp;
                toKnow--;
            }
        }
        System.out.println(Arrays.toString(array));
    }public static void main (String[]args){
            int[] ex = {2,2,3,12,2,3,3,3,12,4,5};
            Sort(ex);

    }}
