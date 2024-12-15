
class Queue {
    private int rear;
    private int front;
    private int[] array;

    public Queue() {
        rear = -1;
        front = -1;
        array = new int[4]; // Fixed size queue with 4 elements
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return (rear == 3); // Array size fixed at 4
    }

    public int count() {
        if (isEmpty()) return 0;
        return (rear - front + 1);
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("The queue is full");
        } else if (isEmpty()) {
            rear = 0;
            front = 0;
            array[rear] = value;
        } else {
            rear++;
            array[rear] = value;
        }
    }

    public int dequeue() {
        int x = 0;
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else if (front == rear) {
            x = array[front];
            front = -1;
            rear = -1;
        } else {
            x = array[front];
            front++;
        }
        return x;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("**** Items are ****");
            for (int i = front; i <= rear; i++) {
                System.out.println(array[i]);
            }
            System.out.println("******************");
        }
    }
}
