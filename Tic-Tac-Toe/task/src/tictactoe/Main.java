package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int c = 0;
        System.out.println("---------");
        for(int i=0;i<3;i++)
        {
            System.out.print("| ");
            for(int j=0;j<3;j++)
            {
                System.out.print(s.charAt(c)+" ");
                c++;
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }
}
