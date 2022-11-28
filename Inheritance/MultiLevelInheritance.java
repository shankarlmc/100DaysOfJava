class getData {
    double principle;
    double rate;
    double time;

    void Data(double d, double r, double t) {
        principle = d;
        rate = r;
        time = t;
    }

    void display() {
        System.out.println("Principle: " + principle);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
    }
}

class SimpleInterest extends getData {
    double result;

    void calculate() {
        result = (principle * rate * time) / 100;
    }

    void display() {
        super.display();
        System.out.println("Simple Interest: " + result);
    }
}

public class MultiLevelInheritance extends SimpleInterest {
    public static void main(String args[]) {
        MultiLevelInheritance obj = new MultiLevelInheritance();
        obj.Data(1000, 10, 2);
        obj.calculate();
        obj.display();
    }
}
