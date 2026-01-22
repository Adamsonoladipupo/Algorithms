package others;

public class Methods {
    public static boolean twoSum(int[] arr, int target) {
        for (int check = 0; check < arr.length; check++) {
            for (int checker = 0; checker < arr.length; checker++ ) {
                if (arr[checker] == arr[check]) continue;
                if (arr[checker] + arr[check] == target) return true;
            }
        }
        return false;
    }
}
