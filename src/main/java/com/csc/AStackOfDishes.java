package com.csc;

public class AStackOfDishes<T> {
    private T[] arrData;
    private int top;
    private int capacity;

    AStackOfDishes(int size) {
        arrData= (T[]) new Object[size];
        capacity = size;
        top = -1;
    }

    public void push(T data) {
        if (!isFull()) {
            arrData[++top] = data;
        } else {
            System.out.println("Overflow! Stack is full! Not pushing!");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            return arrData[top--];
        } else {
            System.out.println("Stack is empty! Not popping!");
            return null;
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return arrData[top];
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

    public static class StrawHat {
        public String name;

        StrawHat(String name) {
            this.name = name;
        }
    }

    public static class ComputerPart {
        public String part;

        ComputerPart(String part) {
            this.part = part;
        }
    }

    public static void main(String[] args) {
        AStackOfDishes<Dish> dishStack = new AStackOfDishes<>(4);
        AStackOfDishes<StrawHat> strawHatStack = new AStackOfDishes<>(4);
        AStackOfDishes<ComputerPart> computerPartStack = new AStackOfDishes<>(4);

        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        dishStack.push(oneDish);
        dishStack.push(twoDish);
        dishStack.push(redDish);
        dishStack.push(blueDish);

        System.out.println("Stack size after pushes: " + dishStack.size());

        Dish peekedDish = dishStack.peek();
        if (peekedDish != null) {
            System.out.println("Top of the stack (peek): " + peekedDish.description);
        }

        Dish poppedDish = dishStack.pop();
        if (poppedDish != null) {
            System.out.println("Popped dish: " + poppedDish.description);
        }

        Dish anotherPoppedDish = dishStack.pop();
        if (anotherPoppedDish != null) {
            System.out.println("Popped another dish: " + anotherPoppedDish.description);
        }

        System.out.println("Final stack size: " + dishStack.size());

        StrawHat luffy = new StrawHat("Monkey D. Luffy");
        StrawHat zoro = new StrawHat("Roronoa Zoro");
        StrawHat nami = new StrawHat("Nami");
        StrawHat usopp = new StrawHat("Usopp");

        strawHatStack.push(luffy);
        strawHatStack.push(zoro);
        strawHatStack.push(nami);
        strawHatStack.push(usopp);

        System.out.println("Straw Hat Stack size after pushes: " + strawHatStack.size());

        StrawHat peekedHat = strawHatStack.peek();
        if (peekedHat != null) {
            System.out.println("Top of the Straw Hat stack (peek): " + peekedHat.name);
        }

        StrawHat poppedHat = strawHatStack.pop();
        if (poppedHat != null) {
            System.out.println("Popped Straw Hat: " + poppedHat.name);
        }

        System.out.println("Straw Hat Stack final size: " + strawHatStack.size());

        ComputerPart cpu = new ComputerPart("Intel i7 Processor");
        ComputerPart gpu = new ComputerPart("NVIDIA RTX 4070 ti");
        ComputerPart ram = new ComputerPart("32GB DDR5 RAM");
        ComputerPart ssd = new ComputerPart("1TB SSD");

        computerPartStack.push(cpu);
        computerPartStack.push(gpu);
        computerPartStack.push(ram);
        computerPartStack.push(ssd);

        System.out.println("Computer Part Stack size after pushes: " + computerPartStack.size());

        ComputerPart peekedPart = computerPartStack.peek();
        if (peekedPart != null) {
            System.out.println("Top of the Computer Part stack (peek): " + peekedPart.part);
        }

        ComputerPart poppedPart = computerPartStack.pop();
        if (poppedPart != null) {
            System.out.println("Popped Computer Part: " + poppedPart.part);
        }

        System.out.println("Computer Part Stack final size: " + computerPartStack.size());

    }
}
