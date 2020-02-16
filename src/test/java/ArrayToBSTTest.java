import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayToBSTTest {
    private ArrayToBST arrayToBST = new ArrayToBST();

    @Test
    public void test() {
        ArrayToBST.Node root = arrayToBST.convertToBST(new int[]{56, 45, 12, 3, 26, 68});

        arrayToBST.printTreeByLevel(root);
        System.out.println();
        arrayToBST.printTreeInOrder(root);

        assertEquals(26, root.getData());
        assertEquals(3, root.getLeft().getData());
        assertEquals(56, root.getRight().getData());

        assertEquals(12, root.getLeft().getRight().getData());
        assertEquals(45, root.getRight().getLeft().getData());
        assertEquals(68, root.getRight().getRight().getData());
    }
}
