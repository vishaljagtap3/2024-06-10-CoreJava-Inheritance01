public class Base {
    private int b = 10;

    /*public Base() {
        System.out.println("Base()");
        b = 10;
    }*/

    public Base(int b) {
        System.out.println("Base(int)");
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void displayB() {
        System.out.println("b = " + b);
    }

    public void display() {
        System.out.println("b = " + b);
    }
}
