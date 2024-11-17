package src.main.java.com.csc;

public class AStackOfDishes {
    private Dish[] arrDish;
    private int top;
    private int capacity;

    AStackOfDishes(int size){
        arrDish = new Dish[size];
        capacity = size;
        top = -1;
    } 

    public void push(Dish Dish){
        if (!isFull()) {
            arrDish[++top] = Dish;
        } else {
            System.out.println("Overflow! Stack is full! Not pushing!");
        }
    }

    public Dish pop() {
        if (!isEmpty()) {
            return arrDish[top--];
        } else {
            System.out.println("Stack is empty! Not popping!");
            return null;
        }
    }

    public Dish peek() {
        if (!isEmpty()) {
            return arrDish[top];
        } else {
            System.out.println("Stack is empty! Not peeking!");
            return null;
        }
    }

    public int size() {
        return top + 1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }
    
    public static class Dish {
        public String description;

        Dish(String description) {
            this.description = description;
        }
    }

    public static void main(String[] args) {
        AStackOfDishes stack = new AStackOfDishes(4);

        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        int stackSize = stack.size();

        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);

        int sizeAfterPushes = stack.size();

        Dish peekedDish = stack.peek();

        Dish poppedDish = stack.pop();

        Dish anotherPoppedDish = stack.pop();
        
        int finalSize = stack.size();
    }
}