class Solution {
    public int[] productExceptSelf(int[] nums) {
        
     int[] output = new int[nums.length];
     int[] sufix = new int [nums.length];
     int[] prefix = new int [nums.length];
     int j=nums.length-1;
     for(int i =0; i<nums.length; i++){
         if(i==0){
            prefix[i] = 1;
         }
         else {
            prefix[i]=nums[i-1]*prefix[i-1];
         }
     }
     for(int i = nums.length-1; i>=0; i--){
         if(i==nums.length-1){
            sufix[i] = 1;
         }
         else {
            sufix[i]=nums[i+1]*sufix[i+1];
         }
     }

     for(int i=0; i<nums.length;i++){
        output[i]=prefix[i]*sufix[i];
     }

     return output;
    }
}