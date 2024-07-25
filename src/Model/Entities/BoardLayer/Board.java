package Model.Entities.BoardLayer;

public class Board{
    private int rows;
    private int columns;
    private Piece[][] pieces;
    public Board(int rows, int columns){
        if (rows < 1 || columns < 1){
            throw new BoardExceptions("Erro creating board: there must be at least 1 row and 1 column");
        } 
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Piece piece(int row, int column){
        if (!positionExists(row, column)) {
            throw new BoardExceptions("Position does not exist");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position){
        if (!positionExists(position)) {
            throw new BoardExceptions("Position does not exist");
        }
        return piece(position.getRows(), position.getColumns());
    }
    public void placePiece(Piece piece, Position position){
        if(thereIsAPiece(position)){
            throw new BoardExceptions("There is already a piece at position " + position);
        }
        pieces[position.getRows()][position.getColumns()] = piece;
        piece.position = position;
    }  

    public Piece removePiece(Position position){
        if(!positionExists(position)){
            throw new BoardExceptions("Position not on the board");
        }
        if(piece(position) == null){
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRows()][position.getColumns()] = null;
        return aux;
    }
    
    private boolean positionExists(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRows(), position.getColumns()); 
    }

    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)) {
            throw new BoardExceptions("Position does not exist");
        }
        return piece(position) != null;
    }
    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }

}