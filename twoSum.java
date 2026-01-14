import java.util.*;
class twoSum {
    public boolean twoSum(int[] nums, int target) {
        int n = nums.length;
        Set<Integer> mp = new HashSet<>();
        for(int num: nums) {
            int req = target - num;
            if(mp.contains(req)) return true;
            mp.add(num);
        }

        return false;
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 6;
        System.out.println(twoSum(arr,4));
    }
}