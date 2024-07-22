package Model.Entities.BoardLayer;

public class Position {
    private int rows;
    private int columns;
    public Position(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }
    
    
    @Override
    public String toString() {
        return "\nPosition\n[Rows: " + rows + " | Columns: " + columns + "]\n";
    }




    public int getRows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }
    public int getColumns() {
        return columns;
    }
    public void setColumns(int columns) {
        this.columns = columns;
    }
}
