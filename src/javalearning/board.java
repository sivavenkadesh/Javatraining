package javalearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class board {

    public static void main(String args[]) {
        Scanner scan =new Scanner(System.in);
         String cal="123";
        int anschr= strtonum(cal)+2;
      System.out.println(  numtostr(anschr));

 }
 static int strtonum(String str){
        int num=1;
        int treturn=0;
        char[]once={'0','1','2','3','4','5','6','7','8','9'};
            for (int j=str.length()-1;j>=0;j--){
                for(int i=0;i<once.length;i++){
                if (str.charAt(j)==once[i]){
                    treturn+=i*num;
                    num*=10;
                }
            }
        }
            return treturn;
 }
 static String numtostr(int num){
        int no=10;
        String toreturn="";
        int[]tense={0,1,2,3,4,5,6,7,8,9};
        while (num>0){
            int rev=num%10;
        for (int i=0;i< tense.length;i++){
            if (rev- tense[i]==0){
                toreturn=i+toreturn;
            }
        }num=num/10;
        }
        return toreturn;
 }
static void cal(String no){
        char [] sym={'(','*','/','+','-',')'};
        int len=0;
        for (int j=0;j<sym.length;j++){
            String dup="";
        for (int i=0;i<no.length();i++){
            if (sym[0]==no.charAt(i)){
                String rec="";
                int srt=i+1;
                while(no.charAt(srt)!=')'){
                 rec+=no.charAt(srt);}
                cal(rec);
            }
            else  if (sym[j]==no.charAt(i)){
                 String [] eng={strcol(no,i,'-',sym),strcol(no,i,'+',sym)};
                  len=(eng[0]+eng[1]).length()-1;
                 int []con={strtonum(eng[0]),strtonum(eng[1])};
                switch(sym[j]) {
                    case '+':
                        dup=numtostr(con[0]+con[1]);
                        break;
                    case '-':
                        dup=numtostr(con[0]-con[1]);
                        break;
                    case  '*':
                        dup=numtostr(con[0]*con[1]);
                        break;
                    case '/':
                        dup=numtostr(con[0]/con[1]);
                        break;
                }

            }
        }
}}
    static String strcol(String str,int no,char Rorl,char[] lst){
        String st="";
        if(Rorl=='+'){
            for (int i=no-1;i>=0;i--) {
                for (int i1 = 0; i1 < lst.length; i1++) {
                    if (str.charAt(i) == lst[i1]) {
                      return  st;
                    }
                }
                st += str.charAt(i);
            }
        }
        else {
            for (int i=no+1;i<str.length();i++){
                for (int i1 = 0; i1 < lst.length; i1++) {
                    if (str.charAt(i) == lst[i1]) {
                      return   st;
                    }
                }
            }
        }
        return st;
    }


}