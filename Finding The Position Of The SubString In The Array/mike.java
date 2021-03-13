import java.util.*;
import java.util.Scanner;

public class mike {
    public static void main(String[] args) {
        System.out.print("Please Enter your Name.");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Welcome " + name + "\n");
        List<Integer> ll = new ArrayList<>();
        int data = 0;
        // int nn = 0;
        System.out.print("Please enter the number. if you have finished entering the number press -1" + "\n");

        while (data != -1) {

            data = sc.nextInt();
            ll.add(data);
        }
        Collections.sort(ll);

        // Code for entering the sum whose substring we have to find
        System.out.println("Please enter the number whose substring you have find from the list ");
        int find = 0;
        find = sc.nextInt();

        int n = ll.size();
        int sum = find;

        // now substring finding
        for (int i = 0; i < n; i++) {
            int curr_sum = ll.get(i);
            for (int j = i + 1; j <= n; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.print("The Substring lies between " + i + " and " + p);
                    return;
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + ll.get(j);
            }
        }
        System.out.println("Substring not found");

    }

}
