public class IntPair {
    private final Integer Left;
    private final Integer Right;

    public IntPair(int L, int R) {
        this.Left  = L;
        this.Right = R;
    }

    public int getLeft()  {return Left;}
    public int getRight() {return Right;}

    @Override
    public int hashCode() { return Left.hashCode() ^ Right.hashCode(); }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass())
            return false;

        IntPair rhs = (IntPair) o;
        return this.Left.equals(rhs.getLeft()) && this.Right.equals(rhs.getRight());
    }
}
