package protocol;

import org.jetbrains.annotations.NotNull;
import protocol.model.CellsName;

/**
 * Created by eugene on 12/17/16.
 */
public class CommandCellNames extends Command {
    public static final String NAME = "cell_names";
    private CellsName[] cellsNames;

    protected CommandCellNames(CellsName[] cellsNames) {
        super(NAME);
        this.cellsNames = cellsNames;
    }

    public CellsName[] getCellsNames() {
        return cellsNames;
    }
}
