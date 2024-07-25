package Model.Entities.ChessLayer;

import Model.Entities.BoardLayer.BoardExceptions;

public class ChessException extends BoardExceptions{
    public ChessException(String message){
        super(message);
    }
}
