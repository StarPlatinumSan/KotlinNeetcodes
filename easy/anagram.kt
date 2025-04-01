/* Given an integer array nums, return true if any value appears more than once in the array, otherwise return false. */
/* Time Complexity : O(nlogn) */
class duplicate {
    fun hasDuplicate(nums: IntArray): Boolean {
        nums.sort()
        for(i in 1 until nums.size) {
            if(nums[i] == nums[i-1]) return true
        }
        return false
    }
}

/* Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
An anagram is a string that contains the exact same characters as another string, 
but the order of the characters can be different. */

/* Time Complexity: O(n + m) */
class anagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val countS = mutableMapOf<Char, Int>()
        val countT = mutableMapOf<Char, Int>()

        for (i in s.indices) {
            countS[s[i]] = countS.getOrDefault(s[i], 0) + 1
            countT[t[i]] = countT.getOrDefault(t[i], 0) + 1
        }

        return countS == countT
    }
}