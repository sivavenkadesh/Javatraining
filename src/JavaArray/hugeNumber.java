package JavaArray;

import java.util.Arrays;

public class hugeNumber {
    public static void main(String[] args) {
        long [] bignumber={9,2,8,1,3,5,6,7,3,1,1,6};
        long [ ] bignumber1={7,8,4,6,2,1,9,9,7};
       toaddhuge(bignumber,bignumber1);
    }
    public static void toaddhuge(long []array1,long []array2){
        long no1=0;
        long no2=0;
         long tense=1;
      for (int j= array1.length-1;j>=0;j--){
          long temp=array1[j];
          no1+=temp*tense;
          tense*=10;
          if (j==0){
              tense=1;
          }
      }
      for (int j= array2.length-1;j>=0;j--){
          long temp=array2[j];
          no2+=temp*tense;
          tense*=10;

      }
      long add=no1+no2;
      int tocreate=0;
      tense=1;
      while (true){
          long temp=add/tense;
          if (temp==0){
              break;
          }
          tocreate++;
          tense*=10;
      }
      long[]dup=new long[tocreate];
      tense=10;
      for (int j=tocreate-1;j>=0;j--){
          long temp=add%tense;
          dup[j]=temp;
          add=add/tense;
      }
      System.out.println(Arrays.toString(dup));
    }


}
