package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    // TODO: zmiana nazwy tego pola na jakąś bardziej znaczącą
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        final int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
