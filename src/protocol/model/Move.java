package protocol.model;

/**
 * Created by eugene on 12/3/16.
 */
public class Move {
    private int cellId;
    private int x;
    private int y;

    public Move(int cellId, int x, int y) {
        this.cellId = cellId;
        this.x = x;
        this.y = y;
    }

    public int getCellId() {
        return cellId;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
