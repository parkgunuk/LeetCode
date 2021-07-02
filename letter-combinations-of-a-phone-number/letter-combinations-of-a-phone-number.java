class Solution {
    List<String> res = new ArrayList<>(); 
    public List<String> letterCombinations(String digits) {
                
        String[] hash = new String[10];
        hash[2] = "a,b,c";
        hash[3] = "d,e,f";
        hash[4] = "g,h,i";
        hash[5] = "j,k,l";
        hash[6] = "m,n,o";
        hash[7] = "p,q,r,s";
        hash[8] = "t,u,v";
        hash[9] = "w,x,y,z";

        if(digits.equals("")) return res;
        
        if(digits.length() == 1){
            for(String s : hash[Integer.parseInt(digits)].split(",")) res.add(s);
            
            return res;
        }
        
        StringBuilder sb = new StringBuilder();
        
        rec(hash, digits, digits.length(), 0, sb);
        
        return res;
    }
    
    public void rec(String[] hash, String s, int len,  int idx, StringBuilder sb){
        if(len == idx){
            res.add(sb.toString());
            return;
        }
        String[] tmp = hash[s.charAt(idx)-'0'].split(",");
        for(int i = 0 ; i < tmp.length ; ++i){
            sb.append(tmp[i]);
            rec(hash, s, len, idx + 1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}