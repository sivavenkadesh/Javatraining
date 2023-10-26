package javalearning;
import java.util.Scanner;
public class Solution {
    void range (){
        int i, a;
        int o = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a range to calculate prime number :");
        i = scan.nextInt();
        if (i > 1) {
            while (o <= i) {
                for (a = 2; a <= i; a++) {
                    if (o % a == 0) {
                        if (o == a) {
                            System.out.println("prime " + a);
                        }
                        break;
                    }
                }
                o += 1;
            }
        } else {
            System.out.println("there is no prime between " + i);
        }

    }
}


