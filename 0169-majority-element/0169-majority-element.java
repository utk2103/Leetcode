class Solution {
    public int majorityElement(int[] nums) {
        int count=0, ans = 0;
        for (int num: nums) {
            if (count==0){
                ans = num;
                count++;
            }
            else if (num!=ans)
                count--;
            else
                count++;
        }
        return ans;
    }
}