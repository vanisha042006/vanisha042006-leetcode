class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int resultarray[]=new int[n];
        int posindex=0,negindex=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                resultarray[posindex]=nums[i];
                posindex=posindex+2;

            }
            else{ 
                resultarray[negindex]=nums[i];
                negindex=negindex+2;
            }



        }
        return resultarray;
        
    }
}