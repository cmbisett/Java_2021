import java.util.ArrayList;

public class BasicsTest {
    public static void main(String[] args) {
        Basics algos = new Basics();

        algos.counter();

        System.out.println("==========================================");

        algos.counterOdd();

        System.out.println("==========================================");

        System.out.println(algos.sigma());

        System.out.println("==========================================");

        int[] arr = {1,3,5,7,9,13};
        algos.iterateArray(arr);

        System.out.println("==========================================");

        int[] newArr = {-3,-5,-7};
        System.out.println(algos.maxArray(newArr));

        System.out.println("==========================================");

        System.out.println(algos.negativeArr());
    }
}