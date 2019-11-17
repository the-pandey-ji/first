package first;

import java.util.Scanner;

public class CollatzExeecution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        CollatzConjecture c = new CollatzConjecture(number); //parameterised constructor
        System.out.println(c.getCollatzString());
    }
}
