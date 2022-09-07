public class Add implements Command {
    private int value;
    private Calculator calculator;
    public Add(Calculator calc, int value){
        this.calculator = calc;
        this.value = value;
    }
    public void execute(){
        this.calculator.value += this.value;
    }

    public void undo(){
        this.calculator.value -= this.value;
    }
}
