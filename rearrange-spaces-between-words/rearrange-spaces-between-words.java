class Solution {
    public String reorderSpaces(String text) {
        String s = text.trim();
        String[] input = s.split(" ");

        int gap = 0;
        
        for(int i = 0 ; i < text.length() ; ++i){
            if(text.charAt(i) == ' ') gap++;
        }
        
        if(input.length == 1) {
            if(gap == 0) return text;
            else {
                StringBuilder sb = new StringBuilder();
                for(int i = 0 ; i < input.length ; ++i){
                    if(input[i].equals(""))continue;
                    sb.append(input[i]);
                    for(int j = 0 ; j < gap ; ++j) sb.append(" ");
                }
                
                return sb.toString();
            }
        }
        
        int cnt = 0;
        for(int i = 0 ; i < input.length ; ++i){
            if(!input[i].equals("")) cnt++;
        }
        
        int div = gap/(cnt-1);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < input.length-1 ; ++i){
            if(input[i].equals(""))continue;
            sb.append(input[i]);
            for(int j = 0 ; j < div ; ++j) sb.append(" ");
        }
        
        sb.append(input[input.length-1]);
        
        int left = gap%(cnt-1);
        if(left > 0){
            for(int i = 0 ; i < left ; ++i) sb.append(" ");
        }
        
        return sb.toString();
    }
}