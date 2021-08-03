import java.util.ArrayList;

public class Basics {
    public void counter(){
        for (int i = 0; i < 256; i++) {
            System.out.println(i);
        }
    }

    public void counterOdd(){
        for (int i = 0; i < 256; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public int sigma() {
        int sum = 0;
        for (int i = 0; i <256; i++) {
            sum += i;
        }
        return sum;
    }

    public void iterateArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public ArrayList<Integer> negativeArr() {
        ArrayList<Integer> y = new ArrayList<Integer>();

        for (int i = 0; i < 256; i++) {
            if(i % 2 == 1) {
                y.add(i);
            }
        }
        return y;
    }
}