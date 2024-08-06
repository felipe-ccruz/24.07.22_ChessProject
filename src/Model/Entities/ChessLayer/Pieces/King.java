package Model.Entities.ChessLayer.Pieces;

import Model.Entities.BoardLayer.Board;
import Model.Entities.ChessLayer.ChessPiece;
import Model.Entities.ChessLayer.Color;

public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
    
}
