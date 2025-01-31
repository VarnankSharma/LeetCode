class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int max_len=0;
        HashSet<Character> charSet=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(charSet.contains(s.charAt(i))){
                charSet.remove(s.charAt(l));
                l++;

            }
            charSet.add(s.charAt(i));
            max_len=Math.max(max_len,i-l+1);
        }
        return max_len;
    }
}