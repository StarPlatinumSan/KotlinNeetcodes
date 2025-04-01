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

/* Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first. */

/* Time Complexity : O(n) */

class twoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val prevMap = HashMap<Int, Int>()

        for ((i, n) in nums.withIndex()) {
            val diff = target - n
            if (prevMap.containsKey(diff)) {
                return intArrayOf(prevMap[diff]!!, i)
            }
            prevMap[n] = i
        }
        return intArrayOf()
    }
}