package StackMinimum;

public class StackMin {
    private Node top;
    private Node min;

    public StackMin() {
        top = null; min = null;
    }

    public int min() {
        if (min == null) return -1;
        return min.value;
    }

    public void push(int value) {
        if(min == null) {
            min = new Node(value, min);
        } else if (min.value < value) {
            min = new Node(min.value, min);
        } else {
            min = new Node(value, min);
        }
        top = new Node(value, top);
    }

    public int pop() {
        if (min == null) return -1;
        min = min.next;
        int result = top.value;
        top = top.next;
        return result;
    }
}
