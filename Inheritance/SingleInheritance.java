class Parent {
    int a = 10;

    void display() {
        System.out.println("I am in parent class");
    }
}

public class SingleInheritance extends Parent {
    public static void main(String args[]) {
        SingleInheritance obj = new SingleInheritance();
        System.out.println(obj.a);
        obj.display();
    }
}
