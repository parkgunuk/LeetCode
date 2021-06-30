class Solution {
    public String longestPalindrome(String s) {
        
        if(isPalindrome(s)) return s;

        for(int i = s.length() ; i >= 1 ; i--){
            for(int j = 0 ; j < s.length() - (i-1); ++j){
                String tmp = s.substring(j, j+i);
                if(isPalindrome(tmp)) return tmp;
            }
        }
        
        return "";
    }
    
    public boolean isPalindrome(String s){
        int len = s.length();
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i) != s.charAt(len - i - 1)){
                return false;
            }
        }
        return true;
    }
}