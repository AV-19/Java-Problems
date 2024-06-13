class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int arr[] = new int[2];
        int add=0;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                int total=nums[i]+nums[j];
                if(total==target){
                   arr[add]=i;
                   add++;
                   arr[add]=j;
            }
            }
            
        }
        return arr;
       
    }
}
