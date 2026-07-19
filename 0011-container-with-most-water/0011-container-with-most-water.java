class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;

        int maxi = 0;

        while(left<right){
        int bigBar = Math.min(height[left],height[right]);
        maxi = Math.max(maxi,bigBar*(right-left));
        
        if(height[left]>height[right]){
            right--;
        }else{
            left++;
        }
            
        }

       return maxi;
    }
}