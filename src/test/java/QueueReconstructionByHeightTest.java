import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QueueReconstructionByHeightTest {

    private QueueReconstructionByHeight queueReconstructionByHeight = new QueueReconstructionByHeight();

    @Test
    public void test() {
        assertArrayEquals(new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}},
                queueReconstructionByHeight.reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}}));
    }

}
