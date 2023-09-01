public class maxSubArray {
    public static void maxSum(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = 0;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currSum = 0;

                for (int k = start; k <= end; k++) {

                    currSum += nums[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("Maximum sum :" + maxSum);
    }

    public static void kadanes(int[] nums){

        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];

            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum, maxSum);
        }
        System.out.println("Maxsum is: "+maxSum);
        
    }

    public static void main(String[] args) {
        // int[] nums = { 1, -2, 6, -1, 3 };
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        // maxSum(nums);
        kadanes(nums);
    }

}
