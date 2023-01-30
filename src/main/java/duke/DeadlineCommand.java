package duke;

import duke.Command;

public class DeadlineCommand implements Command {
    private Task newDeadline;

    DeadlineCommand(Task t) {
        newDeadline = t;
    }
    @Override
    public void execute(TaskList taskList) {
        taskList.add(newDeadline);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
