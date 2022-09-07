public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.execuetCommand(new Add(calc, 5));
        calc.execuetCommand(new Multiply(calc, 3));
        calc.execuetCommand(new Subtract(calc, 5));

        System.out.println(calc.value);

        calc.undoCommand();
        System.out.println(calc.value);
        calc.undoCommand();
        System.out.println(calc.value);
        calc.undoCommand();
        System.out.println(calc.value);
    }
}
