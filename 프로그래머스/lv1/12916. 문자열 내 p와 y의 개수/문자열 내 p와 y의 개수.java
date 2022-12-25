class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr = s.toLowerCase().split("");
        int pCount = 0;
        int yCount = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i].equals("p")) {
                pCount++;
            } else if (arr[i].equals("y")) {
                yCount++;
            }
        }
        if (pCount != yCount) {
			 answer = false;
		} else {
			answer = true;
        }
        return answer;
    }
}