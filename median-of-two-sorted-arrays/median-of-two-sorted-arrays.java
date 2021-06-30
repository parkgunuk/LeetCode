class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0 ; i < nums1.length ; ++i){
            if(maxHeap.size() > minHeap.size()) minHeap.add(nums1[i]);
            else maxHeap.add(-1 * nums1[i]);
            
            //maxHeap의 top은 minHeap의 top보다 항상 작거나 같다.
            if(!maxHeap.isEmpty() && !minHeap.isEmpty() && (maxHeap.peek() * -1) > minHeap.peek() ){
                int max = (maxHeap.poll() *-1);
                int min = minHeap.poll();

                maxHeap.add(min*-1);
                minHeap.add(max);
            }
        }
        
        
        for(int i = 0 ; i < nums2.length ; ++i){
            if(maxHeap.size() > minHeap.size()) minHeap.add(nums2[i]);
            else maxHeap.add(-1 * nums2[i]);
            
            //maxHeap의 top은 minHeap의 top보다 항상 작거나 같다.
            if(!maxHeap.isEmpty() && !minHeap.isEmpty() && (maxHeap.peek() * -1) > minHeap.peek() ){
                int max = (maxHeap.poll() *-1);
                int min = minHeap.poll();

                maxHeap.add(min*-1);
                minHeap.add(max);
            }
        }
        
        System.out.println(maxHeap.toString());
        System.out.println(minHeap.toString());
        
        if(minHeap.size() > maxHeap.size()) return (double) minHeap.peek();
        else if(minHeap.size() == maxHeap.size()) return (double) (minHeap.peek() + (-1 * maxHeap.peek())) / (double) 2;
        else return (double) -1 * maxHeap.peek();
    }
}