class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map= new HashMap<>(); //create a hashmap to store the value and the index of i
        for(int i = 0; i < nums.length; i++){ //for each value in nums
            int complement= target- nums[i]; //find complement
            if(map.containsKey(complement)){ // if the complement exists as a key in the map, the target can be reached with the complement and the value at i
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i); // add the value and index of i to the hashmap
        }
        return new int[]{};// returns empty array if no complement exists as a key in the map
    }
}
