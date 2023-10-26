package JavaArray;
import java.util.ArrayList;

public class FindOddorEven {
    public static void find(int[] array) {
        ArrayList<Integer> lst = new <Integer>ArrayList<Integer>();
        int i = 0;
        int odd = 0;
        int even = 0;
        int tense = array[i];

        while (tense >= 1) {
            int temp = tense % 10;
            lst.add(temp);
            tense = tense / 10;
        }
        for (int j : lst) {
            if (j % 2 == 0) {
                even++;
            }
            else {
            odd++;}
        }
        System.out.println("ODD :" + odd);
    System.out.println("EVEN :"+even);

}

    public static void main(String[] args) {
        int sort []={123467877};
        find(sort);

    }
        }


