import java.util.*;
 
public class Main { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[][] arr = new String[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = input.next();
            }
        }
 
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
 
                if (Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])) {
                    if (Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])) {
                        if (Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])) {
 
                            return o1[0].compareTo(o2[0]);
                        }
                        return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
 
                    }
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }
 
                return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
 
            }
        });
 
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0]);
        }
    }
 
}
