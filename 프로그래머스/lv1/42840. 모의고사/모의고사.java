import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5}; 
        int[] grade = {0,0,0}; 
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == first[i%5]) grade[0]++;
            if(answers[i] == second[i%8]) grade[1]++;
            if(answers[i] == third[i%10]) grade[2]++;
        }
        
        int max = Math.max(grade[0], Math.max(grade[1], grade[2]));
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<grade.length; i++) if(max == grade[i]) list.add(i+1);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}