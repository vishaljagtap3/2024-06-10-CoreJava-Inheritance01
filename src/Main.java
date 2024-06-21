public class Main {
    public static void main(String[] args) {

        Derived d2 = new Derived();
        d2.setB(100);
        d2.setD(200);
        d2.displayB();
        d2.displayD();
        System.out.println();

        d2.display();




        //b is separate for base class and derived class and so to objects
        /*Derived d1 = new Derived();
        d1.setB(11);
        d1.displayB();

        Base b1 = new Base();
        b1.setB(22);
        System.out.println(d1.getB());*/


    }
}
