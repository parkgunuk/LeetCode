class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        
        String s1 = reverseStr(num1);
        String s2 = reverseStr(num2);
                
        int len = Math.min(s1.length(), s2.length());
        
        int over = 0;
        for(int i = 0 ; i < len ; ++i){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            
            int val = (c1 - '0') + (c2 - '0') + over;
            
            
            if(val >= 10) over = val/10;
            else over = 0;
            
            res.append(val%10);
        }
        


        if(s1.length() > s2.length()){
            for(int i = len ; i < s1.length() ; ++i){
                char c = s1.charAt(i);
                int val = (c - '0') + over;
                
                res.append(val%10);
                
                if(val >= 10) over = val/10;
                else {
                    res.append(s1.substring(i + 1, s1.length()));
                    break;
                }
            }
        } else if(s1.length() < s2.length()){
            for(int i = len ; i < s2.length() ; ++i){
                char c = s2.charAt(i);
                int val = (c - '0') + over;
                res.append(val%10);
                
                if(val >= 10) over = val/10;
                else {
                    res.append(s2.substring(i + 1, s2.length()));
                    break;
                }
            }
        } else if(s1.length() == s2.length() && over > 0) res.append(over);
       
        if(res.toString().charAt(res.length() - 1) == '0' && over > 0) res.append(over);
        
        
        return res.reverse().toString();
    }
    
    public static String reverseStr(String s) {
        return (new StringBuffer(s)).reverse().toString();
    }
}