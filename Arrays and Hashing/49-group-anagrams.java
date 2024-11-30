class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups= new HashMap<>(); //hashmap to store groups of anagrams 

        String sorted= "";
        for(int i = 0; i < strs.length; i++){
            char[] schars= strs[i].toCharArray(); //store the characters of each string in strs in a char array
            Arrays.sort(schars); //sort the char array
            sorted= new String(schars); //store the sorted char array as a string

            if(!groups.containsKey(sorted)){ //if the sorted char string does not exist in the groups map
                groups.put(sorted, new ArrayList<>()); //add the sorted char string as a key with an ArrayList as its value pair
            }
            groups.get(sorted).add(strs[i]); //get the key of the sorted char string and add the original string from strs into the map as a value in its ArrayList value
        }
        return new ArrayList<>(groups.values()); //return a new ArrayList with only the values stored in groups
    }
}
