public class FinalTest {
    public final int a;//uninitialized final variable
    public static final int b; //uninitialized static final variable

    static {
        b = 2;  /*static variable initalized in static block*/
    }


    FinalTest( int a) {
        this.a = a;  // final variable value assigned only in constructor
//        this.b = a; // final static variable value assigned only in static block and direct initialized final variable
    }

    public static void main(String[] args) {

        FinalTest tester = new FinalTest(1);
        System.out.println("a = " + tester.a + ", b = " + b);
    }
}
