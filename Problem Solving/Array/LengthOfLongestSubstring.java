class LengthOfLongestSubstring {
   public static void main(String[] args) {
      String s = "abcabcbb";
      //int length = lengthOfLongestSubstring(s);
      System.out.println(lengthOfLongestSubstring(s)) 
   }
   public static int lengthOfLongestSubstring(String s) {
        int l=0;
        int maxlength=0;
        HashSet<Character> set= new HashSet<>();
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            maxlength=Math.max(maxlength,r-l+1);
        }
        return maxlength;
    }
}