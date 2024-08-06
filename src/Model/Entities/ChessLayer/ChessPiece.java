package Model.Entities.ChessLayer;

import Model.Entities.BoardLayer.Board;
import Model.Entities.BoardLayer.Piece;

public abstract class ChessPiece extends Piece {
    private Color color;
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
}
