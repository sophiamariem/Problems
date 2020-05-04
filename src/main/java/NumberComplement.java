public class NumberComplement {

    public int findComplementOne(int num) {
        return (Integer.highestOneBit(num) << 1) - 1 - num;
    }

    public int findComplementTwo(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }

    public int findComplementThree(int num) {
        return ~num & (Integer.highestOneBit(num) - 1);
    }
}
