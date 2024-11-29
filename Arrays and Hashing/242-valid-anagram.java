class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sarr= s.toCharArray(); //put all characters in s into an array
        char[] tarr= t.toCharArray(); //put all character in t into an array

        Arrays.sort(sarr); //sort array with characters from string s
        Arrays.sort(tarr);//sort array with characters from string t

        return Arrays.equals(sarr, tarr); //returns true if both arrays are equal else false
    }
}
