package DSA.PrefixSumLC;

public class LeetCode1732 {
    public static void main(String[] args) {
    int[] num={-5,1,5,0,-7};
        System.out.println(findPairs(num));
    }
    public static int findPairs(int[] nums) {
        int currentAltitude=0;
        int maxAltitude=0;

        for (int num:nums){
            currentAltitude+=num;
            maxAltitude=Math.max(currentAltitude,maxAltitude);
        }
        return maxAltitude;
    }
}
