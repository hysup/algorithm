class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var num = n.toString().toCharArray()
        num.sortDescending()
        val sortedNum = String(num).toLong()
        
        return sortedNum
    }
}