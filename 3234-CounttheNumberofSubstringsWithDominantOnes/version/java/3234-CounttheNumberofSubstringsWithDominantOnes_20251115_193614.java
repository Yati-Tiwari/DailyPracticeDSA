// Last updated: 11/15/2025, 7:36:14 PM
class Solution {
    public int minOperations(int[] nums) {
        int optn=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && stack.peek()> nums[i]){
                stack.pop();
            }
            if(stack.isEmpty() || stack.peek() < nums[i]){
                stack.push(nums[i]);
                optn++;
            }
        }
        return optn;
    }
}