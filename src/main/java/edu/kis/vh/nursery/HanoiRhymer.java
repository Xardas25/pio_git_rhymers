package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int TOTAL_REJECTED =0;
    private int totalRejected = TOTAL_REJECTED;

    protected int reportRejected() {
        return totalRejected;
    }

    @Override
    protected void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }


}
