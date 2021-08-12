class Solution {
    public boolean canReorderDoubled(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < arr.length ; ++i){
            if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
            else map.put(arr[i], 1);
        }
        
        Arrays.sort(arr);
        System.out.println(map.toString());
        for(int i = 0 ; i < arr.length ; ++i){
            if(arr[i] < 0){
                if(map.get(arr[i]) > 0) {
                    System.out.println(arr[i]/2);
                    if(arr[i] % 2 == 0 && map.containsKey(arr[i]/2) && map.get(arr[i]/2) > 0) {
                        map.put(arr[i], map.get(arr[i]) - 1);
                        map.put(arr[i]/2, map.get(arr[i]/2) - 1);
                    } else return false;
                }
            } else {
                if(map.get(arr[i]) > 0) {
                    if(map.containsKey(arr[i] << 1) && map.get(arr[i] << 1) > 0) {
                        map.put(arr[i], map.get(arr[i]) - 1 );
                        map.put(arr[i] << 1, map.get(arr[i] << 1) - 1);
                    } else return false;
                }
            }
        }
        
        return true;
    }
}