class Solution {
    public String customSortString(String order, String str) {
        HashMap<Character, Integer> orders = new HashMap<>();
        HashMap<Integer, Character> tmp = new HashMap<>();
        
        int n = order.length();
        for(int i = 0 ; i < n ; ++i) {
            orders.put(order.charAt(i), i);
            tmp.put(i, order.charAt(i));
        }
        
        for(int i = 0 ; i < 26 ; ++i){
            if(orders.get((char)(i+'a')) == null) {
                orders.put((char)(i+'a'), n+i);
                tmp.put(n+i, (char)(i+'a'));
            }
        }
        
        //System.out.println(orders.toString());
        //System.out.println(tmp.toString());
        
        int len = str.length();
        int[] res = new int[len];
        
        for(int i = 0 ; i < len ; ++i) res[i] = orders.get(str.charAt(i));
        //System.out.println(Arrays.toString(res));
        Arrays.sort(res);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < len ; ++i) sb.append(tmp.get(res[i]));
        
        return sb.toString();
    }
}