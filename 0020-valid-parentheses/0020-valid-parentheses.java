class Solution {
    public boolean isValid(String s) {
         Stack<Character> st = new Stack<>();

        char[] arr = s.toCharArray();

        for(int i =0; i<s.length();i++){
            
            
            if(arr[i]=='(' || arr[i] =='{' || arr[i]=='['){
              st.push(arr[i]);
            }else{
                if(!st.isEmpty()&& (arr[i]==')' && st.peek()=='(' || arr[i]=='}' && st.peek()=='{' || arr[i]==']' && st.peek()=='[')){
                   st.pop();
                }else return false;
            }
        }

        return st.isEmpty();
    }
}