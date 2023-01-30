package duke;

import duke.Command;

public class EventCommand implements Command {
    private Task newEvent;
    EventCommand(Task t) {
        newEvent = t;
    }
    @Override
    public void execute(TaskList taskList) {
        taskList.add(newEvent);
    }
    @Override
    public boolean isExit() {
        return false;
    }
}
