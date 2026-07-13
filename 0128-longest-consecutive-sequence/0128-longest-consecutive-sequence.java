class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        int longest = 0;

        for(int num : nums){
            set.add(num);
        }

        for(int num:set){

            if(!set.contains(num-1)){
               int length =1;
               int crr =num;

               while(set.contains(crr+1)){
                length++;
                crr++;
               }

               longest = Math.max(longest,length);

            }
            

        }

        return longest;
    }
}
