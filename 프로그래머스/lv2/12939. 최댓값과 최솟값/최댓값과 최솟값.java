class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i=0; i<str.length; i++) {
            int num = Integer.parseInt(str[i]);
            
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        answer =  min + " " + max;
        return answer;
    }
}