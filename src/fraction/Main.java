package fraction;

public class Main {
    public static Fraction fraction = new Fraction(1, 0);
    public static Fraction fraction2 = new Fraction(3, 2);

    static double numerator = fraction.getNumerator();
    static double denominator = fraction.getDenominator();

    public static void main(String[] args) {
        fraction.showFraction(numerator, denominator);
        showFactionAfterReduce();
        showAddFractionResult();
        showSubFractionResult();
    }

    public static void showFactionAfterReduce() {
        String reduceFraction = fraction.reduceFractions(numerator, denominator);
        System.out.println("Fraction after reduce is: " + reduceFraction);
    }

    public static void showAddFractionResult() {

        String result = fraction.addFraction(fraction2);
        System.out.println("Add result is: " + result);
    }

    public static void showSubFractionResult() {

        String result = fraction.subFraction(fraction2);
        System.out.println("Sub result is: " + result);
    }

}
