package Model;

import java.io.Serializable;

public class Coordinates implements Serializable {
    private Integer row, col;

    public Coordinates(Integer row, Integer col) {
        this.row = row;
        this.col = col;
    }

    public Coordinates(Coordinates coordinates) {
        if (coordinates == null ) return;

        this.row = coordinates.getRow();
        this.col = coordinates.getCol();
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }
}