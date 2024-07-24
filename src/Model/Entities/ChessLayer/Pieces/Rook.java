package Model.Entities.ChessLayer.Pieces;

import Model.Entities.BoardLayer.Board;
import Model.Entities.ChessLayer.ChessPiece;
import Model.Entities.ChessLayer.Color;

public class Rook extends ChessPiece{

    public Rook(Board board, Color color) {
        super(board, color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "R";
    }
    
}
