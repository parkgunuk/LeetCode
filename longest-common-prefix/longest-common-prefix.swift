class Solution {
    func longestCommonPrefix(_ strs: [String]) -> String {
        guard strs.count > 0 else { return "" }
        
        var res = strs[0]
        
        for s in strs[1..<strs.count] {
            while !s.hasPrefix(res) {
                res = String(res.dropLast())
            }
        }

        return res
    }
}