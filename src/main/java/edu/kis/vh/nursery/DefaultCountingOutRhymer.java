package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int START_SIZE_VALUE = -1;
    private static int CAPACITY = 12;
    private static final int MAX_SIZE = 11;
    private final int[] numbers = new int[getCAPACITY()];

    public static int getStartSizeValue() {
        return START_SIZE_VALUE;
    }

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public int getTotal() {
        return total;
    }

    private int total = getStartSizeValue();

    /**
     * Jezeli tablica numbers nie jest pelna, dodawana jest do niej zmienna in
     * @param in zmienna dodawana do tablicy numbers
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == getStartSizeValue();
    }

    public boolean isFull() {
        return total == getMaxSize();
    }

    protected int peekaboo() {
        if (callCheck())
            return getStartSizeValue();
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return getStartSizeValue();
        return numbers[total--];
    }

}
