class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i = 0 ; i < strs.length ; ++i){
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            
            List<String> list = map.getOrDefault(sorted, new ArrayList<>());
            list.add(str);
            
            map.put(sorted, list);
        }
        
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        
        return res;
    }
}