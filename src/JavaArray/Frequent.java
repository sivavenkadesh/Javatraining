package JavaArray;
import java.util.Arrays;
public class Frequent {
    public static void  returnFrequent(int array[]) {
        int len = array.length;
        for (int j = len - 1; j > 0; j--) {
            if (array[j] < array[j - 1]) {
                int temp = 0;
                temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }

    }

        public static void main (String[]args){
            int sort[] = {1, 1, 2, 3, 1, 2, 4

            };
            returnFrequent(sort);
        }
    }

