// Birthday for my girlfriend ideapad

import java.util.Scanner;

public class TicTacToe {

    static int count = 0;

    static int emptyCells(char[][] Array) {
        int n = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                if(Array[i][j] == '~') {n++;}
            }
        }
        return n;
    }

    static void displayBoard(char[][] Array) {
        // Visual improvement on the board
        System.out.println(" ______________");
        System.out.println("|  Game Board  |");
        System.out.println("|______________|");
        System.out.println();
        System.out.print("-------------");
        System.out.println();

        for(int i = 0; i < 3; i++) {
            System.out.print("| ");
            for(int j = 0; j < 3; j++) {
                System.out.print(Array[i][j]+" | ");
            }
            System.out.println();
            System.out.print("-------------");
            System.out.println();
        }
    }
    static void checkWin(char[][] Array) {
        // minimise the body length. hint- multiple conditionals have common print statements, then
        // 1. use output formatters and store these strings there. 
        // 2. can make a flag and if flag is true, then print a certain output else ... 
        // For primary diagonal
        if(emptyCells(Array)>=0) { // this is the place of error when task move makes one winner[earlier !=0]
            if(Array[0][0] == 'X' &&
               Array[1][1] == 'X' && 
               Array[2][2] == 'X') {
                System.out.println("\nPlayer 1 won\nPlayer 2 lost");
                System.exit(0);
            }
            if(Array[0][0] == 'O' && 
               Array[1][1] == 'O' && 
               Array[2][2] == 'O') {
                System.out.println("\nPlayer 2 won\nPlayer 2 lost");
                System.exit(0);
            }

            // For secondary diagonal
            if(Array[2][0] == 'X' &&  
               Array[1][1] == 'X' && 
               Array[0][2] == 'X') {
                System.out.println("\nPlayer 1 won\nPlayer 2 lost");
                System.exit(0);
            }
            if(Array[2][0] == 'O' &&
               Array[1][1] == 'O' &&
               Array[0][2] == 'O'){
                System.out.println("\nPlayer 1 won\nPlayer 2 lost");
                System.exit(0);
            }

            // Horizontal Rows check condition
            for(int i = 0; i < 3; i++) {
                if(Array[i][0] == 'X' &&
                   Array[i][1] == 'X' &&
                   Array[i][2] == 'X') {
                    System.out.println("\nPlayer 1 won\nPlayer 2 lost");
                    System.exit(0);   
                }
                if(Array[i][0] == 'O' &&
                   Array[i][1] == 'O' && Array[i][2] == 'O') {
                    System.out.println("\nPlayer 2 won\nPlayer 2 lost");
                    System.exit(0);   
                }
            }

            // Vertical columns check conditions
            for(int i = 0; i < 3; i++) {
                if(Array[0][i] == 'X' && Array[1][i] == 'X' && Array[2][i] == 'X') {
                    System.out.println("\nPlayer 1 won\nPlayer 2 lost");
                    System.exit(0);
                }
                if(Array[0][i] == 'O' && Array[1][i] == 'O' && Array[2][i] == 'O') {
                    System.out.println("\nPlayer 2 won\nPlayer 2 lost");
                    System.exit(0);
                }
            }
        }
        else {System.out.println("Oops!\nMatch drawn");}
    }
    public static void main(String args[]) {

        char[][] board = new char[3][3]; 

        // Setting default values 
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '~'; 
            }
        }

        System.out.println(" _______________________________________________________");
        System.out.println("|----------------------Tic Tac Toe----------------------|");
        System.out.println("|_______________________________________________________|");
        System.out.println();
        displayBoard(board);

        Scanner s = new Scanner(System.in); 
        int m, n; // for locating the cell to insert value
        do{
            if((9-emptyCells(board))%2==0) {
                System.out.print("\nPlayer 1\nEnter position: ");
                m = s.nextInt(); n = s.nextInt(); 
            }
            else {
                System.out.print("\nPlayer 2\nEnter position: ");
                m = s.nextInt(); n = s.nextInt(); 
            }
            
            if((9-emptyCells(board))%2==0) {
                if(board[m][n]=='~') {
                    board[m][n] = 'X';
                    displayBoard(board);
                    checkWin(board);
                }
                else {System.out.println("\nOhh!\nCell already filled \nRetry"); continue;}

            }
            else {
                if(board[m][n]=='~') {
                    board[m][n] = 'O';
                    displayBoard(board);
                    checkWin(board);
                }
                else {System.out.println("\nOhh!\nCell already filled \nRetry"); continue;}
            }
        }while(emptyCells(board)>=0); 
        System.out.println("Still hopeful");// No execution stops before it's execution
        s.close();
    }
}