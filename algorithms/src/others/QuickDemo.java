package others;

public class QuickDemo {
    public static void main(String[] args) {
        int[] arr = {1, -2, 1, 0, 5};
        int target = 0;

        boolean check = Methods.twoSum(arr, target);
        System.out.println(check);
    }
}
