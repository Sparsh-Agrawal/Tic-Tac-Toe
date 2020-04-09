package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static String s;
    private static int user;

    public static void main(String[] args) {

        user=0;

        //Printing the fields
        Scanner scan = new Scanner(System.in);
        //System.out.print("Enter cells: ");
        //String s = scan.nextLine();
        s = "         ";
//        System.out.println("---------");
//        for(int i=0;i<3;i++) {
//            System.out.print("| ");
//            for(int j=0;j<3;j++) {
//                System.out.print(s.charAt(c)+" ");
//                c++;
//            }
//            System.out.print("|");
//            System.out.println();
//        }
//        System.out.println("---------");
        printFields(s);



        //user coordinates
        while(true) {
            try {
                if(checkWin(s))
                    break;
                System.out.print("Enter the coordinates: ");
                String co = scan.nextLine();
                check(co);
                printFields(s);
//                if (Integer.parseInt(String.valueOf(co.charAt(0))) > 3 || Integer.parseInt(String.valueOf(co.charAt(0))) < 0 || Integer.parseInt(String.valueOf(co.charAt(2))) > 3 || Integer.parseInt(String.valueOf(co.charAt(2))) < 0) {
//                    //System.out.println("This cell is occupied! Choose another one!");
//                    throw new InputMismatchException();
//                }
//                if (co.equals("1 3"))
//                    c = 0;
//                else if (co.equals("2 3"))
//                    c = 1;
//                else if (co.equals("3 3"))
//                    c = 2;
//                else if (co.equals("1 2"))
//                    c = 3;
//                else if (co.equals("2 2"))
//                    c = 4;
//                else if (co.equals("3 2"))
//                    c = 5;
//                else if (co.equals("1 1"))
//                    c = 6;
//                else if (co.equals("2 1"))
//                    c = 7;
//                else if (co.equals("3 1"))
//                    c = 8;
//
//                if (s.charAt(c) == '_') {
//                    char[] ch = s.toCharArray();
//                    ch[c] = 'X';
//                    s = String.valueOf(ch);
//                    break;
//                } else {
//                    System.out.println("This cell is occupied! Choose another one!");
//                }
            }catch (InputMismatchException e){
                System.out.println("Coordinates should be from 1 to 3!");
            }
            catch (NumberFormatException | ClassCastException e){
                System.out.println("You should enter numbers!");
            }
            catch (NotEmptyException e){
                System.out.println("This cell is occupied! Choose another one!");
            }
        }
//        c=0;
//        System.out.println("---------");
//        for(int i=0;i<3;i++) {
//            System.out.print("| ");
//            for(int j=0;j<3;j++) {
//                System.out.print(s.charAt(c)+" ");
//                c++;
//            }
//            System.out.print("|");
//            System.out.println();
//        }
//        System.out.println("---------");
//        printFields(s);

//        //Printing the state
//        int[] arr = { 0,1,2, 3,4,5, 6,7,8, 0,3,6, 1,4,7, 2,5,8, 0,4,8, 2,4,6 };
//        String G1 = "Game not finished";
//        String D2 = "Draw";
//        String X3 = "X wins";
//        String O4 = "O wins";
//        String I5 = "Impossible";
//        int t = 0;
//        int y = 0;
//
//        //for win and impossible
//        if(t==0) {
//            for (int i = 0; i < arr.length / 3; i++) {
//                int p = i * 3;
//                if (s.charAt(arr[p]) == s.charAt(arr[p + 1]) && s.charAt(arr[p]) == s.charAt(arr[p + 2])) {
//                    if (s.charAt(arr[p]) == 'X') {
//                        t = 3;
//                       // y = 4;
//                        //break;
//                    } else {
//                       // t = 4;
//                        y = 3;
//                        //break;
//                    }
//                }
//            }
//        }
//
//        // for impossible
//        if(t==0 && y==0) {
//            for(int i=0;i<s.length();i++) {
//                if(s.charAt(i)=='X')
//                    t++;
//                else if(s.charAt(i)=='O')
//                    y++;
//            }
//            if(t-y>1 || y-t>1)
//            {
//                t=3;
//                y=3;
//            }
//            else
//            {
//                t=0;
//                y=0;
//            }
//        }
//
//        if(t==0 && y==0)
//        {
//            for(int i=0;i<s.length();i++) {
//                if (s.charAt(i) == '_') {
//                    t = 1;
//                    break;
//                }
//            }
//            if(t!=1)
//                t=2;
//        }
//
//        if(t==1)
//            System.out.println(G1);
//        else if(t==2)
//            System.out.println(D2);
//        else if (t==3 && y!=3)
//            System.out.println(X3);
//        else if (t!=3 && y==3)
//            System.out.println(O4);
//        else if (t==3 && y==3)
//            System.out.println(I5);
    }


    static void printFields(String s) {
        int c=0;
        System.out.println("---------");
        for(int i=0;i<3;i++) {
            System.out.print("| ");
            for(int j=0;j<3;j++) {
                System.out.print(s.charAt(c)+" ");
                c++;
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }


    static void check(String co) throws NotEmptyException {
        int c=0;
        if (toInt(co.charAt(0)) > 3 || toInt(co.charAt(0)) < 0 || toInt(co.charAt(2)) > 3 || toInt(co.charAt(2)) < 0) {
            //System.out.println("This cell is occupied! Choose another one!");
            throw new InputMismatchException();
        }
        if (co.equals("1 3"))
            c = 0;
        else if (co.equals("2 3"))
            c = 1;
        else if (co.equals("3 3"))
            c = 2;
        else if (co.equals("1 2"))
            c = 3;
        else if (co.equals("2 2"))
            c = 4;
        else if (co.equals("3 2"))
            c = 5;
        else if (co.equals("1 1"))
            c = 6;
        else if (co.equals("2 1"))
            c = 7;
        else if (co.equals("3 1"))
            c = 8;

        if (s.charAt(c) == ' ') {
            char[] ch = s.toCharArray();
            if(user==0) {
                ch[c] = 'X';
                user = 1;
            } else {
              ch[c] = 'O';
              user = 0;
            }
            s = String.valueOf(ch);
        } else {
            throw new NotEmptyException("This cell is occupied! Choose another one!");
        }
    }


    static boolean checkWin(String s){
        int[] arr = { 0,1,2, 3,4,5, 6,7,8, 0,3,6, 1,4,7, 2,5,8, 0,4,8, 2,4,6 };
//        String G1 = "Game not finished";
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
                    } else if(s.charAt(arr[p]) == 'O'){
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

//        if(t==0 && y==0)
//        {
//            for(int i=0;i<s.length();i++) {
//                if (s.charAt(i) == ' ') {
//                    t = 1;
//                    break;
//                }
//            }
//            if(t!=1)
//                t=2;
//        }

//        if(t==1)
//            System.out.println(G1);
        if(t==2)
            System.out.println(D2);
        else if (t==3 && y!=3) {
            System.out.println(X3);
            return true;
        }
        else if (t!=3 && y==3) {
            System.out.println(O4);
            return true;
        }
        else if (t==3 && y==3)
            System.out.println(I5);

        return false;
    }

    static int toInt(char c){
        return Integer.parseInt(String.valueOf(c));
    }
}
