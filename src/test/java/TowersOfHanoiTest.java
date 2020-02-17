import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class TowersOfHanoiTest {

    @Test
    public void test() {
        TowersOfHanoi source = new TowersOfHanoi();
        TowersOfHanoi destination = new TowersOfHanoi();
        TowersOfHanoi buffer = new TowersOfHanoi();

        int numberOfDisks = 5;
        for (int disk = numberOfDisks; disk > 0; disk--) {
            source.add(disk);
        }

        Stack<Integer> disks = source.getDisks();
        assertEquals(5, disks.size());
        assertEquals(5, disks.get(0).intValue());
        assertEquals(4, disks.get(1).intValue());
        assertEquals(3, disks.get(2).intValue());
        assertEquals(2, disks.get(3).intValue());
        assertEquals(1, disks.get(4).intValue());

        source.moveDisks(numberOfDisks, buffer, destination);

        assertEquals(0, source.getDisks().size());
        assertEquals(0, buffer.getDisks().size());

        Stack<Integer> resultingDisks = destination.getDisks();
        assertEquals(5, resultingDisks.size());
        assertEquals(5, resultingDisks.get(0).intValue());
        assertEquals(4, resultingDisks.get(1).intValue());
        assertEquals(3, resultingDisks.get(2).intValue());
        assertEquals(2, resultingDisks.get(3).intValue());
        assertEquals(1, resultingDisks.get(4).intValue());
    }
}
