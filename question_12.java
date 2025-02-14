// Base class (Renamed to question_12)
class question_1{
    protected double num1, num2;

    public question_1(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void displayNumbers() {
        System.out.println("Numbers: " + num1 + ", " + num2);
    }
}

// Addition class
class Addition extends question_1 {
    public Addition(double num1, double num2) {
        super(num1, num2);
    }

    public double add() {
        return num1 + num2;
    }
}

// Subtraction class
class Subtraction extends question_1 {
    public Subtraction(double num1, double num2) {
        super(num1, num2);
    }

    public double subtract() {
        return num1 - num2;
    }
}

// Multiplication class
class Multiplication extends question_1 {
    public Multiplication(double num1, double num2) {
        super(num1, num2);
    }

    public double multiply() {
        return num1 * num2;
    }
}

// Division class
class Division extends question_1{
    public Division(double num1, double num2) {
        super(num1, num2);
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
    }
}

// Main class
public class question_12 {
    public static void main(String[] args) {
        double num1 = 20, num2 = 5;

        Addition addObj = new Addition(num1, num2);
        System.out.println("Addition: " + addObj.add());

        Subtraction subObj = new Subtraction(num1, num2);
        System.out.println("Subtraction: " + subObj.subtract());

        Multiplication mulObj = new Multiplication(num1, num2);
        System.out.println("Multiplication: " + mulObj.multiply());

        Division divObj = new Division(num1, num2);
        System.out.println("Division: " + divObj.divide());
    }
}
