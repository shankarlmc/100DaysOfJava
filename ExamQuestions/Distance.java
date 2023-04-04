/*
 * Create a class Distance with private variables feet of type 
 * integer and inches of type floating point. Use suitable constructor 
 * and methods for adding and comparing two distance objects. 
 * hint 1 feet = 12 inches.
 */

public class Distance {
    private int feet;
    private float inches;

    public Distance(int feet, float inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public Distance() {
        this(0, 0);
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(float inches) {
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public float getInches() {
        return inches;
    }

    public Distance add(Distance d) {
        int totalFeet = this.feet + d.feet;
        float totalInches = this.inches + d.inches;
        if (totalInches >= 12) {
            totalFeet++;
            totalInches -= 12;
        }
        return new Distance(totalFeet, totalInches);
    }

    public int compareTo(Distance d) {
        float thisTotalInches = this.feet * 12 + this.inches;
        float dTotalInches = d.feet * 12 + d.inches;
        if (thisTotalInches < dTotalInches) {
            return -1;
        } else if (thisTotalInches > dTotalInches) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        Distance d1 = new Distance(5, 11);
        Distance d2 = new Distance(4, 10);
        Distance d3 = d1.add(d2);
        System.out.println(d3.getFeet() + " feet " + d3.getInches() + " inches");
        System.out.println(d1.compareTo(d2));
    }
}
