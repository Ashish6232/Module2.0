package accessModifier;

public class Test {
    static public class B {
    }

    public class C {
    }

    public static void main(String[] args) {
        Test.B o =new Test.B();
    }
}
