class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s= new HashSet<>(); //can only contain unique values
        for(int i= 0; i < nums.length; i++){ //for each value in nums
            if(s.add(nums[i])==false){ //if the attempt to add the value to the set returns false
                return true; //return true as that value already exists in the set
            }
        }
        return false;  //otherwise false because every value in nums is unique and in the set s
    }
}
