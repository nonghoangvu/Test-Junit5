public class Cal {
    private int numberA;
    private int numberB;

    public Cal() {
    }

    public Cal(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public int getNumberA() {
        return numberA;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    public int plus() {
        return this.numberA + this.numberB;
    }
}
