package javalearning;
import java.util.Scanner;
public class prime {
static int b;
static int n;
public static void main(String args[]){
   simplemaths obj=new simplemaths();
   prime s=new prime();
   Solution K=new Solution();
   for(int w=0;w<=100;w++) {
       System.out.println("");
       System.out.println("Play with maths ");
       System.out.println("1 * Calculator ");
       System.out.println("2 * Prime Factorisation ");
       System.out.println("3 * To calculate range of prime number ");
       System.out.println("4 * To Check odd or even ");
       System.out.println("5 * Exit!");
        Scanner sac=new Scanner(System.in);
        n=sac.nextInt();
        if(n<5) {
            while (true) {
                if (n == 4) {
                    System.out.println("Enter a number to check :");
                    long c = sac.nextLong();
                    if (c % 2 == 0) {
                        System.out.println("The Given number " + c + " is Even");
                        break;
                    } else {
                        System.out.println("The given number " + c + " is Odd");
                        break;
                    }
                }
                if (n == 2) {
                    System.out.println("Enter a Prime number :");
                    int p = sac.nextInt();
                    if (s.check(p)) {
                        s.fact(p);
                        break;
                    } else {
                        System.out.println("Your given number " + p + " is not prime");
                        break;
                    }
                }
                if (n == 1) {
                    obj.calculator();
                    break;
                }
                if (n == 3) {
                    K.range();
                    break;
                }

            }
        }else {
            break;
        }
    }
}
  boolean check(int o){
    if(o==0){
        return false;
    }
    else{
        for(int b=2;b<=o;b++){
        if(o%b==0){
            if(o==b){
                return true;
            }else {break;}

        }}
    }
    return false;
}
   void fact( int o) {
    System.out.println("Your given number is prime");
       long fac = 1;
       while (o >= 2) {
           for (int a = 2; a <= o; a++) {
               if (o%a == 0 ) {
                   if (a==o) {
                       System.out.println(a);
                       fac = fac * o;
                       break;
                   }else{break;}
               }
           }
           o -= 1;
       }
       System.out.print(fac+" ");

   }

     }






