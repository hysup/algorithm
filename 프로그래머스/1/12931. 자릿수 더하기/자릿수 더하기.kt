class Solution {
    fun solution(n: Int): Int {
       var answer = 0

        for (n in n.toString()) {
            answer += (n.toString()).toInt()
        }


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        println("Hello Kotlin")

        return answer
    }
}