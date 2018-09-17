package you;

public interface Todo {

    static void showToDo(String text) {
        throw new DoThis(text + "\nDon't forget to delete the showToDo() statement");
    }
}
