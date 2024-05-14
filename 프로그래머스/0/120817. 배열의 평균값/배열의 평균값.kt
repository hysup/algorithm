class Solution {
    fun solution(numbers: IntArray): Double {
        var sum = 0 
        for (i in numbers) {
            sum += i 
        }
        
        return sum.toDouble() / numbers.size 
    }
}