package protocol.model;

/**
 * Created by eugene on 12/17/16.
 */
public class CellsName {
    private String name;
    private int cellId;

    public CellsName(String name, int cellId) {
        this.name = name;
        this.cellId = cellId;
    }

    public String getName() {
        return name;
    }

    public int getCellId() {
        return cellId;
    }
}
