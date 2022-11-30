class Outer {
    int x = 10;

    class Inner {
        int y = 5;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.y + outer.x);
    }
}
