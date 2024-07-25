package Model.Entities.ChessLayer;

import Model.Entities.BoardLayer.Position;

public class ChessPosition {
    private char column;
    private int row;
    public ChessPosition(char column, int row) {
        if ( column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Error instantiating position ChessPosition. Valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
            return new ChessPosition((char)('a' - position.getColumns()), 8 - position.getRows());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }

    public char getColumn() {
        return column;
    }
    public int getRow() {
        return row;
    }   
    
}