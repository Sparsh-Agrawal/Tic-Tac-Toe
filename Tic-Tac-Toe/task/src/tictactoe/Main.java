package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Printing the fields
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

        //Printing the state
        int[] arr = { 0,1,2, 3,4,5, 6,7,8, 0,3,6, 1,4,7, 2,5,8, 0,4,8, 2,4,6 };
        String G1 = "Game not finished";
        String D2 = "Draw";
        String X3 = "X wins";
        String O4 = "O wins";
        String I5 = "Impossible";
        int t = 0;
        int y = 0;

        //for win and impossible
        if(t==0) {
            for (int i = 0; i < arr.length / 3; i++) {
                int p = i * 3;
                if (s.charAt(arr[p]) == s.charAt(arr[p + 1]) && s.charAt(arr[p]) == s.charAt(arr[p + 2])) {
                    if (s.charAt(arr[p]) == 'X') {
                        t = 3;
                       // y = 4;
                        //break;
                    } else {
                       // t = 4;
                        y = 3;
                        //break;
                    }
                }
            }
        }

        // for impossible
        if(t==0 && y==0) {
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i)=='X')
                    t++;
                else if(s.charAt(i)=='O')
                    y++;
            }
            if(t-y>1 || y-t>1)
            {
                t=3;
                y=3;
            }
            else
            {
                t=0;
                y=0;
            }
        }

        if(t==0 && y==0)
        {
            for(int i=0;i<s.length();i++) {
                if (s.charAt(i) == '_') {
                    t = 1;
                    break;
                }
            }
            if(t!=1)
                t=2;
        }

        if(t==1)
            System.out.println(G1);
        else if(t==2)
            System.out.println(D2);
        else if (t==3 && y!=3)
            System.out.println(X3);
        else if (t!=3 && y==3)
            System.out.println(O4);
        else if (t==3 && y==3)
            System.out.println(I5);
    }
}
