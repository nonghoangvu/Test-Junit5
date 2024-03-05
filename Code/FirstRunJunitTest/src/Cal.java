public class Cal<T extends Number>  {
    private T numA;
    private T numB;

    public Cal(T numA, T numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public T getNumA() {
        return numA;
    }

    public void setNumA(T numA) {
        this.numA = numA;
    }

    public T getNumB() {
        return numB;
    }

    public void setNumB(T numB) {
        this.numB = numB;
    }
}
