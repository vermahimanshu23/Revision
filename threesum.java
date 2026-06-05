import java.util.HashMap;

public class threesum {
    public static void findThreeNumbers(int[] arr, int target) {
        for (int i = 0; i < arr.length - 2; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int currentTarget = target - arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int complement = currentTarget - arr[j];
                if (map.containsKey(complement)) {
                    System.out.println("Three numbers are: " + arr[i] + ", " + arr[j] + ", " + complement);
                    return;
                }
                map.put(arr[j], j);
            }
        }
        System.out.println("No three numbers found.");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10, 45};
        int target = 22;
        findThreeNumbers(arr, target);
    }
}
