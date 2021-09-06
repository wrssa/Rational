class Rational { 
    long numerator,denominator; 

    class Illegal extends Exception { 
        String reason; 
        Illegal (String reason) { 
            this.reason = reason; 
        } 
    } 

    Rational () { 
        // to be completed
    }

    Rational(long numerator, long denominator) throws Illegal { 
        // to be completed
    } 

    // find the reduce form 
    private void simplestForm() { 
        long computeGCD; 
        computeGCD = GCD(Math.abs(numerator), denominator); 
        numerator /= computeGCD; 
        denominator /= computeGCD; 
    } 

    // find the greatest common denominator 
    private long GCD(long a, long b) { 
        if (a%b ==0) return b; 
        else return GCD(b,a%b); 
    } 

    public void add(Rational x) { 
        numerator = (numerator * x.denominator) + (x.numerator * denominator);
        denominator = (denominator * x.denominator); 
        simplestForm(); 
    }

    public void subtract(Rational x) {
        // to be completed
    }

    public void multiply(Rational x) { 
        // to be completed
    }

    public void divide(Rational x) {
        // to be completed
    }

    public boolean equals(Object x) {
        // to be completed
    }

    public long compareTo(Object x) {
        // to be completed
    }

    public String toString() { 
        // to be completed
    }

    public static void main(String[] args) {
        System.out.println("This is Rational class.");
    }
}