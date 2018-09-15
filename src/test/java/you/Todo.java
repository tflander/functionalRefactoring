package you;

public interface Todo {

    static void showToDo(String text) {
        throw new DoThis(text);
    }
}
