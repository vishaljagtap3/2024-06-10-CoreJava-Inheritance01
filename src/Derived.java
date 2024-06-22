public class Derived extends Base {
    private int d;

    public Derived() {
        super(10);
        System.out.println("Derived()");
        d = 20;
    }

    public Derived(int b, int d) {
        //we would like to ask the compiler to execute the parameterized constructor of Base
        super(b); //if super is used to trigger a different constructor of base class, then it should be the first statement in the derived class constructor
        System.out.println("Derived(int, int)");
        //setB(b);
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void displayD() {
        System.out.println("d = " + d);
    }

    public void display() {
        //System.out.println("b = " + getB());
        System.out.println("d = " + d);
        super.display();
    }
}
