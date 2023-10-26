package javalearning;
import java.util.Scanner;

public class simplemaths {

     void  calculator(){
        Scanner san=new Scanner(System.in);
        System.out.println("Here your simple maths and perform it ");
        System.out.println("here you want to break the condition after performed calculation you have to press =");
         float c = san.nextFloat();
         char a = san.next().charAt(0);
         float d = san.nextFloat();
         float ans = 0;
          char v;
        for(int i=1;i<=100;i++) {
                if (i == 1) {
                    if (a == '*') {
                        ans = c * d;
                    } else if (a == '+') {
                        ans = c + d;
                    } else if (a == '-') {
                        ans = c - d;
                    } else if (a == '/') {
                        ans = c / d;
                    }
System.out.println(ans);
                }
                if (i % 2 == 0) {

                     v = san.next().charAt(0);

                 if(v!='='){   c=san.nextFloat();
                    if (v == '+') {
                        ans += c;
                        System.out.println(ans);

                    } else if (v == '-') {
                        ans -= c;
                        System.out.println(ans);
                    } else if (v == '*') {
                        ans *= c;
                        System.out.println(ans);

                    } else if(v=='/') {
                        ans /= c;
                        System.out.println(ans);

                    }

                }
                if (i % 2 != 0 ) {

                    a=san.next().charAt(0);
                if(a!='='){     d = san.nextFloat();
                    if (a == '+') {
                        ans += d;
                        System.out.println(ans);

                    } else if (a == '-') {
                        ans -= d;
                        System.out.println(ans);

                    } else if (a == '*') {
                        ans *= d;
                        System.out.println(ans);

                    } else if(a=='/') {
                        ans /= d;
                        System.out.println(ans);

                    }}

                }

                if ((v=='=')||(a=='=')){
                    System.out.println("your ans is "+ans);

                    break;
                }
            }}
        System.out.println("if you want to try again press (yes/no):");
            String s=san.next();
            if((s.equalsIgnoreCase("Yes"))){
                calculator();
            }


        }

}

