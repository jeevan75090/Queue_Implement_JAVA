
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    Node front;
    Node rear;
    int size = 0;

    //IsEmpty();
    public boolean isEmpty() {
        return front == null;
    }

    //add element
    public void offer(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        size++;
    }

    //remove and return value
    public int poll() {
        if(isEmpty()) {
            return -1;
        }
        int top = front.data;
        front = front.next;
        size--;
        return top;
    }
    
    //peek element
    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return front.data;
    }

    //size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Main queue = new Main();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue.size());

        while(!queue.isEmpty()) {
            System.out.print(queue.peek()+" ");
            queue.poll();
        }
    }
}