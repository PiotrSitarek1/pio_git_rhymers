package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    //5 12 14 15
    // alt + > zmienia okno na nastepny otwarty plik w kompilatorze
    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
