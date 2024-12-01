class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>(); //hashmap to collect the frequency of each int in nums
        
        for (int i = 0; i < nums.length; i++) { 
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1); //iterate through nums and store the count of each int in the map
        }

        List<Map.Entry<Integer, Integer>> sortedFrequency = new ArrayList<>(frequency.entrySet());  //new list to store the map after it is sorted
        sortedFrequency.sort((a, b) -> b.getValue().compareTo(a.getValue())); //sort and store the map in descending order

        int[] result = new int[k]; //array of length k to return the most frequent elements
        for (int i = 0; i < k; i++) { 
            result[i] = sortedFrequency.get(i).getKey(); //store the key at index i of sortedFrequecy in result[i]
        }
        return result; //return the k most frequent values
    }
}
