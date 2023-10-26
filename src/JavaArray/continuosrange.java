package JavaArray;

import java.util.Arrays;

public class continuosrange {
    public static  void findRange(int array[]){
        for (int j=0;j< array.length;j++){
            for (int i=j+1;i< array.length;i++){
                if(array[j]>array[i]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int toknow=0;
        while (true){
            int count1=0;
        for (int j=0;j<array.length;j++){int toless=1;
            int count=0;
            for (int i=j+1;i<array.length;i++){
                int temp=array[i];
                if (array[j]==(temp-toless)){
                    count++;
                    toless++;
                }
            }
            if (count1<count){
                count1=count;
                toknow=j;
            }
        }if(count1!=0){
        for (int j=toknow;j<=count1+toknow;j++){
            System.out.print(array[j]+" ");

        }
        break;
        }System.out.println("There is no continuos range");
        break;
        }

    }

    public static void main(String[] args) {
        int ary[]={4,8,10,0,2,3,5,1,9,7,11,12,13};
        findRange(ary);
    }
}
