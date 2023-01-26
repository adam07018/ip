public class ToDo extends Task{
    protected  String type = "[T]";
    public ToDo (String description){
        super(description);
    }

    public static ToDo createToDo(String input) {
        String description = input.substring(5);
        ToDo temp = new ToDo((description));
        return temp;
    }
    @Override
    public String toString() {
        return type + super.toString();
    }

}
