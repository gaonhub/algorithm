import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] dwarf = new int[9];
    int sum = 0;
    int fake1 = 0;
    int fake2 = 0;

    for (int i=0; i<dwarf.length; i++) {
      dwarf[i] = input.nextInt();
      sum += dwarf[i];
    }

    Arrays.sort(dwarf);

    for (int i = 0; i < dwarf.length - 1; i++) {
      for (int j = i + 1; j < dwarf.length; j++) {
        if (sum - dwarf[i] - dwarf[j] == 100) {
            fake1 = i;
            fake2 = j;
            break;
        }
      }
    }

    for (int i = 0; i < dwarf.length; i++) {
      if (i == fake1 || i == fake2) {
        continue;
      }
      System.out.println(dwarf[i]);
    }
  }
}
