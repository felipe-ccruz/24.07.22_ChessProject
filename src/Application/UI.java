package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

import Model.Entities.ChessLayer.ChessPiece;
import Model.Entities.ChessLayer.ChessPosition;
import Model.Entities.ChessLayer.Color;

public class UI {

    // https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    // https://stackoverflow.com/questions/2979383/java-clear-the-console 
    
    public static void clearScreen() {   
        System.out.print("\033[H\033[2J");   
        System.out.flush();   
    }  

    public static ChessPosition readChessPosition(Scanner sc){
        try {
            String s = sc.nextLine();
            char column = s.charAt(0);
            int row = Integer.parseInt(s.substring(1));
            return new ChessPosition(column, row);
        } catch (RuntimeException e) {
            throw new InputMismatchException("Error reading ChessPosition. Valid values are from a1 to h8");
        }
    }

    public static void printBoard(ChessPiece[][] pieces){
        System.out.println();
        for (int i = 0; i < pieces.length; i++) {
            System.out.print(ANSI_CYAN + (8 - i) + " " + ANSI_RESET);
            for (int j = 0; j < pieces[i].length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  " + ANSI_CYAN + "a b c d e f g h" + ANSI_RESET);
    }

    private static void printPiece(ChessPiece piece) {
    	if (piece == null) {
            System.out.print("-");
        }
        else {
            if (piece.getColor() == Color.WHITE) {
                System.out.print(ANSI_WHITE + piece + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_BLUE + piece + ANSI_RESET);
            }
        }
        System.out.print(" ");
	}

    // private static void printCapturedPiece(List<ChessPiece> captured){
    //     List<ChessPiece> white = captured.stream().filter(x -> x.getColor() == Color.WHITE).collect(Collectors.toList());
    //     List<ChessPiece> black = captured.stream().filter(x -> x.getColor() == Color.BLACK).collect(Collectors.toList());
    //     System.out.println("Captured pieces: ");
    //     System.out.println("WHITE");
    //     System.out.println(Arrays.toString(white.toArray()));
    //     System.out.println();
    //     System.out.println("BLACK");
    //     System.out.println(Arrays.toString(black.toArray()));
    //     System.out.println();
    // }
}
