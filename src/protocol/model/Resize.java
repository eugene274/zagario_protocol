package protocol.model;

/**
 * Created by eugene on 12/3/16.
 */
public class Resize {
    private int cellId;
    private int size;

    public Resize(int cellId, int size) {
        this.cellId = cellId;
        this.size = size;
    }

    public int getCellId() {
        return cellId;
    }

    public int getSize() {
        return size;
    }
}
