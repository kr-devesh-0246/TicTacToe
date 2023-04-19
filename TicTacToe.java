// import java.util.Scanner; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.*; // JTableheader
import java.util.Vector; // vector
import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe extends JFrame implements ActionListener{  
    // JLabel l1,l2; // not preferred to use at this stage 
    // JTextField t1, t2; // not preferred to use at this stage 
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton d0,d1,d2,d3,d4,d5,d6,d7,d8,d9;

    JSplitPane sp;
    GridLayout gridLay, gridLay2;
    static TicTacToe instance ;
    // String s1 = "X";

    private enum Actions {
        B1,
        B2,
        B3,
        B4,
        B5,
        B6,
        B7,
        B8,
        B9
    }

    // static int emptyCells(char[][] Array) {

    //     int n = 0;
    //     for(int i = 0; i < 3; i++){
    //         for(int j = 0; j < 3; j++) {
    //             if(Array[i][j] == '~') {n++;}
    //         }
    //     }
    //     return n;
    // }

    // static void displayBoard(char[][] Array) {
       
    //     System.out.println(" ______________");
    //     System.out.println("|  Game Board  |");
    //     System.out.println("|______________|");
    //     System.out.println();
    //     System.out.print("-------------");
    //     System.out.println();

    //     for(int i = 0; i < 3; i++) {
    //         System.out.print("| ");
    //         for(int j = 0; j < 3; j++) {
    //             System.out.print(Array[i][j]+" | ");
    //         }
    //         System.out.println();
    //         System.out.print("-------------");
    //         System.out.println();
    //     }
    // }
    // static void checkWin(String plyr1, String plyr2, char[][] Array) {

    //     if(emptyCells(Array)>=0) { 
    //         if(Array[0][0] == 'X' &&
    //            Array[1][1] == 'X' && 
    //            Array[2][2] == 'X') {
    //             System.out.printf("\n%s won\n%s lost", plyr1, plyr2);
    //             System.exit(0);
    //         }
    //         if(Array[0][0] == 'O' && 
    //            Array[1][1] == 'O' && 
    //            Array[2][2] == 'O') {
    //             System.out.println("\n%s won\n%s lost");
    //             System.exit(0);
    //         }

    //         // For secondary diagonal
    //         if(Array[2][0] == 'X' &&  
    //            Array[1][1] == 'X' && 
    //            Array[0][2] == 'X') {
    //             System.out.printf("\n%s won\n%s lost",plyr1,plyr2);
    //             System.exit(0);
    //         }
    //         if(Array[2][0] == 'O' &&
    //            Array[1][1] == 'O' &&
    //            Array[0][2] == 'O'){
    //             System.out.printf("\n%s won\n%s lost",plyr1,plyr2);
    //             System.exit(0);
    //         }

    //         // Horizontal Rows check condition
    //         for(int i = 0; i < 3; i++) {
    //             if(Array[i][0] == 'X' &&
    //                Array[i][1] == 'X' &&
    //                Array[i][2] == 'X') {
    //                 System.out.printf("\n%s won\n%s lost",plyr1,plyr2);
    //                 System.exit(0);   
    //             }
    //             if(Array[i][0] == 'O' &&
    //                Array[i][1] == 'O' && Array[i][2] == 'O') {
    //                 System.out.println("\n%s won\n%s lost");
    //                 System.exit(0);   
    //             }
    //         }

    //         // Vertical columns check conditions
    //         for(int i = 0; i < 3; i++) {
    //             if(Array[0][i] == 'X' && Array[1][i] == 'X' && Array[2][i] == 'X') {
    //                 System.out.printf("\n%s won\n%s lost",plyr1,plyr2);
    //                 System.exit(0);
    //             }
    //             if(Array[0][i] == 'O' && Array[1][i] == 'O' && Array[2][i] == 'O') {
    //                 System.out.println("\n%s won\n%s lost");
    //                 System.exit(0);
    //             }
    //         }
    //     }
    //     else {System.out.println("Oops!\nMatch drawn");}
    // }

    public TicTacToe() {
        super("TicTacToe");



        // d1 = new JButton("X");
        // d2 = new JButton("O");
        // d3 = new JButton("O");
        // d4 = new JButton("X");
        // d5 = new JButton("O");
        // d6 = new JButton("X");
        // d7 = new JButton("O");
        // d8 = new JButton("X");
        // d9 = new JButton("O");


        b1 = new JButton(); 
        b1.setActionCommand(Actions.B1.name());
        b1.addActionListener(instance);

        b2 = new JButton("2");
        b2.setActionCommand(Actions.B2.name());
        b2.addActionListener(instance);

        
        b3 = new JButton("3");
        b3.setActionCommand(Actions.B3.name());
        b3.addActionListener(instance);
        
        b4 = new JButton("4");
        b4.setActionCommand(Actions.B4.name());
        b4.addActionListener(instance);
        
        b5 = new JButton("5");
        b5.setActionCommand(Actions.B5.name());
        b5.addActionListener(instance);
        
        b6 = new JButton("6");
        b6.setActionCommand(Actions.B6.name());
        b6.addActionListener(instance);
        
        b7 = new JButton("7");
        b7.setActionCommand(Actions.B7.name());
        b7.addActionListener(instance);
        
        b8 = new JButton("8");
        b8.setActionCommand(Actions.B8.name());
        b8.addActionListener(instance);
        
        b9 = new JButton("9");
        b9.setActionCommand(Actions.B9.name());
        b9.addActionListener(instance);

        

        gridLay = new GridLayout(3,3,10,10); // issue with using this in split screen is that it's a layout manager not a component
        setLayout(gridLay);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);

        // gridLay2 = new GridLayout(3,3,10,10); // issue with using this in split screen is that it's a layout manager not a component
        // setLayout(gridLay2);

        // add(d1);
        // add(d2);
        // add(d3);
        // add(d4);
        // add(d5);
        // add(d6);
        // add(d7);
        // add(d8);
        // add(d9);

        setSize(1000,1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // /*JTable template for Graphic board with static template */
        // Vector<Vector> data = new Vector<Vector>();
        // Vector<String> row = new Vector<String>();

        // row.add("        X");
        // row.add("        O");
        // row.add("        X");

        // data.add(row);

        // row = new Vector<String>();

        // row.add("        X");
        // row.add("        O");
        // row.add("        X");


        // data.add(row);

        // row = new Vector<String>();

        // row.add("        X");
        // row.add("        O");
        // row.add("        X");

        // data.add(row);

        // Vector<String> cols = new Vector<String>();
        // cols.add(" ");
        // cols.add(" ");
        // cols.add(" ");

        // JTable tab = new JTable(data,cols);
        // tab.setBorder(BorderFactory.createLineBorder(Color.GRAY, 5));
        // tab.setFont(new Font("Arial", Font.BOLD, 40));
        // tab.setRowHeight(300);
        // tab.setGridColor(Color.MAGENTA);

        
        // JTableHeader head = new JTableHeader();

        // Container c = getContentPane();
        // c.setLayout(new BorderLayout());

        // c.add("North",head);
        // c.add("Center",tab);

        // sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, tab, gridLay); // Only components are allowed and Gridlay is group of components
    }

    
    public static void main(String args[]) {

        instance = new TicTacToe();  // declaration is necessary onlyhere

    }



    @Override
    public void actionPerformed(ActionEvent evt) {

        // Cell Position button b1,b2 wagairah se lo aur us corresponding Board[i=1,2,...9] pe alt 'O' 'X' bharo
        if(evt.getActionCommand() == Actions.B1.name()){
            // b1.setText("X");
            // b1.setText("X");
            // b1.setText("X");
            b1.equals(d1);
        }


        // char[][] board = new char[3][3]; 

        // Setting default values 
        // for(int i = 0; i < 3; i++) {
        //     for(int j = 0; j < 3; j++) {
        //         board[i][j] = '~'; 
        //     }
        // }

        // System.out.println(" _______________________________________________________");
        // System.out.println("|----------------------Tic Tac Toe----------------------|");
        // System.out.println("|_______________________________________________________|");
        // System.out.println();
        // displayBoard(board);

        // Scanner s = new Scanner(System.in); 

        // // Asking player names
        // System.out.print("Player 1: ");
        // String player1 = s.nextLine();
        // System.out.print("Player 2: ");
        // String player2 = s.nextLine(); 

        // int m, n; // for locating the cell to insert value
        // do{
        //     if((9-emptyCells(board))%2==0) {
        //         System.out.print("\nPlayer 1\nEnter position: ");
        //         m = s.nextInt(); n = s.nextInt(); 
        //     }
        //     else {
        //         System.out.print("\nPlayer 2\nEnter position: ");
        //         m = s.nextInt(); n = s.nextInt(); 
        //     }
            
        //     if((9-emptyCells(board))%2==0) {
        //         if(board[m][n]=='~') {
        //             board[m][n] = 'X';
        //             displayBoard(board);
        //             checkWin(player1,player2,board);
        //         }
        //         else {System.out.println("\nOhh!\nCell already filled \nRetry"); continue;}

        //     }
        //     else {
        //         if(board[m][n]=='~') {
        //             board[m][n] = 'O';
        //             displayBoard(board);
        //             checkWin(player1,player2,board);
        //         }
        //         else {System.out.println("\nOhh!\nCell already filled \nRetry"); continue;}
        //     }
        // }while(emptyCells(board)>=0); 
        // s.close();
    }
}