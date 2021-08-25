class Solution {
    public int stoi(String s){return Integer.parseInt(s);}
    public String complexNumberMultiply(String num1, String num2) {
        String[] nums1 = num1.split("\\+");
        String[] nums2 = num2.split("\\+");

        nums1[1] = nums1[1].substring(0, nums1[1].length()-1);
        nums2[1] = nums2[1].substring(0, nums2[1].length()-1);

        // a1 * a2 - b1 * b2 +(a2 * b1 + a1 * b2)
        int v1 = stoi(nums1[0]) * stoi(nums2[0]) - stoi(nums1[1]) * stoi(nums2[1]);
        int v2 = stoi(nums1[1]) * stoi(nums2[0]) + stoi(nums1[0]) * stoi(nums2[1]);
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(v1);
        sb.append("+");
        sb.append(v2);
        sb.append("i");
        
        return sb.toString();
    }
}