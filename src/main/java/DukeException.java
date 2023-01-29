
public class DukeException extends Exception {
    DukeException(ExceptionType e) {
        switch (e) {
            default:
                System.out.println("Unknown error occured");
                break;
            case DESCRIPTION_EMPTY:
                System.out.println("OOPS!!! The description cannot be empty.");
                break;
            case TASK_FORMAT_ERROR:
                System.out.println("Sorry, the format of task is incorrect");
                break;
            case TASK_NOT_EXIST:
                System.out.println("Sorry, There is no such task for this command");
            case NO_NUMBER:
                System.out.println("Please key in number for this command");
        }

    }
}
