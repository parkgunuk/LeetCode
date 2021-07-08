class Solution {
    func strStr(_ haystack: String, _ needle: String) -> Int {
        guard needle.count != 0 else { return 0 }
        guard needle.count <= haystack.count else { return -1 }
        
        var idx = 0
        var startIdx = haystack.startIndex
        var endIdx = haystack.index(startIdx, offsetBy: needle.count - 1)

        while endIdx < haystack.endIndex {
            var substring = haystack[startIdx...endIdx]
            if substring == needle {
                return idx
            }
            startIdx = haystack.index(after: startIdx)
            endIdx = haystack.index(after: endIdx)
            idx += 1
        }
        return -1
    }
}