class Solution {
    public int solution(String my_string) {
        String[] num = my_string.replaceAll("[^0-9]", " ").split(" ");

        int sum = 0;
        for(int i=0; i<num.length; i++) {
            if(num[i].equals("")) {
                continue;
            } else {
                sum += Integer.parseInt(num[i].trim());            
            }
        }        
        return sum;
    }
}