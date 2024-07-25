package Application;

import java.util.Scanner;

import Model.Entities.ChessLayer.ChessMatch;
import Model.Entities.ChessLayer.ChessPiece;
import Model.Entities.ChessLayer.ChessPosition;

public class App {
    public static void main(String[] args) throws Exception {
         
        ChessMatch chessMatch = new ChessMatch();

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.print("\nSource: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.print("\nTarget: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }

    }
}
