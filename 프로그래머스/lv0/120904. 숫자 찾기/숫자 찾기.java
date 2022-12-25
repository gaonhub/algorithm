class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numbers = String.valueOf(num);
        String kString = String.valueOf(k);
        
        if(numbers.indexOf(kString) == -1) {
            answer = -1;
        } else {
            answer = numbers.indexOf(kString) + 1;
        }
        return answer;
    }
}