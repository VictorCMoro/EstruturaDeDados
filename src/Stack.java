import java.util.Arrays;

public class Stack<T>
{
    private int top;
    private T[] stack;
    private final int size;
    public boolean isEmpty;
    public boolean isFull;

    public Stack(int size){
        stack = (T[]) new Object[size];
        this.size = size;
        top = -1;
        isEmpty = true;
        isFull = false;
    }

    public void push(T data) {
        top++;
        stack[top] = data;

        isEmpty = false;
    }

    public T pop(){
        if (isEmpty){
            System.out.println("LISTA ESTÁ VAZIA");
        } else {
           stack[top] = null;
           top--;

        } return stack[top];
    }

    public void clear(){
        for (int i = 0; i < stack.length; i++){
            stack[i] = null;
            top--;
        }
    }

    public boolean isFull(){
        return size == top + 1;
   }

    public boolean isEmpty(){
        return size == -1;
    }

    @Override
    public String toString() {

        return Arrays.toString(stack);
    }
}
