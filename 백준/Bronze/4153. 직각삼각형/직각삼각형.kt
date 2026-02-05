fun main() {
    val sb = StringBuilder()
    while (true) {
        val input = readln().split(" ").map { it.toInt() }
        
        // 1. 오름차순으로 정렬 (작은 순서대로)
        val sortedList = input.sorted()
        val a = sortedList[0]
        val b = sortedList[1]
        val c = sortedList[2]

        if (a == 0 && b == 0 && c == 0) break

        // 2. 이제 c가 무조건 가장 큰 값이므로 피타고라스 정리 적용
        if ((a * a) + (b * b) == (c * c)) {
            sb.appendLine("right")
        } else {
            sb.appendLine("wrong")
        }
    }
    print(sb)
}