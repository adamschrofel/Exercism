import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Grains {
    private final List<BigInteger> squares = new ArrayList<>(64);

    public Grains() {
        squares.add(BigInteger.ONE);
        for (int i = 1; i < 64; i++) {
            BigInteger prev = squares.get(i - 1);
            squares.add(prev.multiply(BigInteger.TWO));
        }
    }

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return squares.get(square - 1);
    }

    BigInteger grainsOnBoard() {
        BigInteger total = BigInteger.ZERO;
        for (BigInteger grains : squares) {
            total = total.add(grains);
        }
        return total;
    }

}
