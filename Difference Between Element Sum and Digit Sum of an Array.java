class Solution {
    public int differenceOfSum(int[] nums) {
     int elementSum=0;
        int digitSum=0;
        for(int num:nums){
            elementSum=elementSum+num;
            while(num>0){
                digitSum=digitSum+num%10;
                num=num/10;
            }
        }
        return Math.abs(elementSum-digitSum);
        
    }
}
