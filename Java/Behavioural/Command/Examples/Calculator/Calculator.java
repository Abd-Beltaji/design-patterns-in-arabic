import java.util.Stack;

public class Calculator {
    public int value = 0;
    private Stack<Command> commands = new Stack<>();

    public void execuetCommand(Command cmd) {
        this.commands.add(cmd);
        cmd.execute();
    }

    public void undoCommand() {
        Command cmd = this.commands.pop();
        if (cmd == null)
            return;
        cmd.undo();
    }
}
