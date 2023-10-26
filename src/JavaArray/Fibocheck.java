package JavaArray;

public class Fibocheck {
    public static void toreturnFibo(int array[]){
        if(array!=null){
        for (int j=0;j< array.length;j++){
            int fibo=0;
            int fibo1=0;
            int i=1;
            if (fibo==array[j]){
                System.out.println(fibo);
            }
          do {

              fibo=fibo1+i;
              fibo1=i;
              i=fibo; if (fibo==array[j]){
                  System.out.println(fibo);
              }

          }while (fibo<=array[j]);
          }

            }}

    public static void main(String[] args) {
        int fib[]={0,2,10,4,8};
        toreturnFibo(fib);
    }
}




