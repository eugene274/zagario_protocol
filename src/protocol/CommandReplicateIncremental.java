package protocol;

import protocol.model.Cell;
import protocol.model.Move;
import protocol.model.Resize;

/**
 * Created by eugene on 12/3/16.
 */
public class CommandReplicateIncremental {
    private int[] removes;
    private Cell[] adds;
    private Move[] moves;
    private Resize[] resizes;

    public CommandReplicateIncremental(int[] removes, Cell[] adds, Move[] moves, Resize[] resizes) {
        this.removes = removes;
        this.adds = adds;
        this.moves = moves;
        this.resizes = resizes;
    }

    public int[] getRemoves() {
        return removes;
    }

    public Cell[] getAdds() {
        return adds;
    }

    public Move[] getMoves() {
        return moves;
    }

    public Resize[] getResizes() {
        return resizes;
    }
}
