package fraction;

public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction() {

    }

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public boolean isFraction(double numerator, double denominator) {
        return denominator != 0;
    }

    public void showFraction(double numerator, double denominator) {
        if (isFraction(numerator, denominator)) {
            System.out.println("Fraction is: " + numerator + "/" + denominator);
        } else
            System.out.println("This is not valid fraction");


    }

    public static double getUCLN(double numberA, double numberB) {
        if (numberB == 0) {
            return numberA;
        }
        return getUCLN(numberB, numberA % numberB);

    }

    public static String reduceFractions(double numerator, double denominator) {
        String fraction;
        if (denominator != 0) {
            double ucln = getUCLN(numerator, denominator);

            numerator = numerator / ucln;
            denominator = denominator / ucln;
            fraction = numerator + "/" + denominator;

            return fraction;
        }
        return null;

    }

//    public double doReverseFraction(double numerator, double denominator) {
//        double fraction = numerator / denominator;
//        double reverseFraction =
//
//    }

    public String addFraction(Fraction fraction) {
        if (isFraction(this.getNumerator(), this.getDenominator())) {
            if (fraction.getDenominator() != 0) {
                double numerator = this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator();
                double denominator = this.getDenominator() * fraction.getDenominator();
                String result = reduceFractions(numerator, denominator);
                return result;
            }

        }
        return null;

    }

    public String subFraction(Fraction fraction) {
        if (isFraction(this.getNumerator(), this.getDenominator())) {
            if (fraction.getDenominator() != 0) {
                double numerator = this.getNumerator() * fraction.getDenominator() - fraction.getNumerator() * this.getDenominator();
                double denominator = this.getDenominator() * fraction.getDenominator();
                String result = reduceFractions(numerator, denominator);
                return result;
            }

        }
        return null;

    }

}

