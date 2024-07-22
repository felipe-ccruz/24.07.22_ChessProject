package Application;

import Model.Entities.BoardLayer.Board;
import Model.Entities.BoardLayer.Position;
import Model.Entities.ChessLayer.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
