import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        int pMax = numbers[0] * numbers[1];
        int nMax = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        if (pMax < nMax) {
            return nMax;
        } else {
            return pMax;
        }
    }
}