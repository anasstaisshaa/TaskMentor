import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(9);
        int[] ans = findClosestIndexes(list);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }

    public static int[] findClosestIndexes(ArrayList<Integer> nums) {
        int[] result = new int[2];
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                int diff = Math.abs(nums.get(i) - nums.get(j));
                if (diff < minDiff) {
                    minDiff = diff;
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}