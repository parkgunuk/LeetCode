class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int checkLen = s1.length();
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < checkLen ; ++i){
            if(map.containsKey(s1.charAt(i))) map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            else map.put(s1.charAt(i), 1);
        }
        
        for(int i = 0 ; i < s2.length() - checkLen + 1 ; ++i){
            String s = s2.substring(i, i+checkLen);
            
            HashMap<Character, Integer> newMap = new HashMap<>();
            for(char c : map.keySet()) newMap.put(c, map.get(c));
            
            if(check(s, newMap)) {
                return true;
            }
        }
        
        
        return false;
    }
    
    public boolean check(String s, HashMap<Character, Integer> map){
        for(int i = 0 ; i < s.length() ; ++i){
            if(!map.containsKey(s.charAt(i))) return false;
            if(map.get(s.charAt(i)) > 0) map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
            else return false;
        }
        
        int sum = 0;
        
        for(char c : map.keySet()){
            sum+=map.get(c);
        }
        
        return sum == 0 ? true : false;
        
        
    }
}