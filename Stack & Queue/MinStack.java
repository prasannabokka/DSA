import java.util.*;
class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
    }
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty() || val <= minst.peek()) {
            minst.push(val);
        }
    }
    public void pop() {
        if(st.peek().equals(minst.peek())) {
            minst.pop();
        }
        st.pop();
    }
    public int top() {
        return st.peek();
    }
    public int getMin() {
        return minst.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack obj = new MinStack();
        while(true) {
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Top");
            System.out.println("4.Get Min");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    obj.push(val);
                    System.out.println(val + " pushed");
                    break;
                case 2:
                    if(obj.st.isEmpty()) {
                        System.out.println("Stack is empty");
                    }
                    else {
                        System.out.println("Popped: " + obj.top());
                        obj.pop();
                    }
                    break;
                case 3:
                    if(obj.st.isEmpty()) {
                        System.out.println("Stack is empty");
                    }
                    else {
                        System.out.println("Top: " + obj.top());
                    }
                    break;
                case 4:
                    if(obj.minst.isEmpty()) {
                        System.out.println("Stack is empty");
                    }
                    else {
                        System.out.println("Minimum: " + obj.getMin());
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}