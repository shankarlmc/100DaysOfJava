public class CalculateGCD {
    public static void main(String[] args) {
        int a, b;
        a = 16;
        b = 32;
        System.out.println("The gcd of " + a + " and " + b + " is " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        int min_result = Math.min(a, b);
        while (min_result > 0) {
            if (a % min_result == 0 && b % min_result == 0) {
                break;
            }
            min_result--;
        }
        return min_result;
    }
}
