import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] <= n) {
                continue;
            } else {
                int sub1 = n - array[i-1];
                int sub2 = array[i] - n;
                
                if(sub1 > sub2) {
                    answer = array[i];
                    return answer;
                } else if(sub1 < sub2) {
                    answer = array[i-1];
                    return answer;
                } else if(sub1 == sub2) {
                    answer = array[i-1];
                    return answer;
                }
            }
            
            
        }
        answer = array[array.length - 1];
        
        return answer;
    }
}