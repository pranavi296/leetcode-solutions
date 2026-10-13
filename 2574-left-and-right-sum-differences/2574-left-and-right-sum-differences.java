class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] larr=new int[nums.length];
        int[] rarr=new int[nums.length];
        larr[0]=0;
        rarr[nums.length-1]=0;
        for(int i=1;i<nums.length;i++){
            larr[i]=nums[i-1]+larr[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            rarr[i]=nums[i+1]+rarr[i+1];
        }
        for(int i=0;i<nums.length;i++)
        nums[i]=Math.abs(larr[i]-rarr[i]);
        return nums;
    }
}