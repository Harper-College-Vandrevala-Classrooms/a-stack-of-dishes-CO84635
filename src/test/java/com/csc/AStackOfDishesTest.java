package com.csc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AStackOfDishesTest {

    AStackOfDishes Dishes;

    @BeforeEach
    void setup(){
        Dishes = new AStackOfDishes(5);
    }

    @Test
    void testZeroDishes() {
        assertTrue(Dishes.isEmpty());
        assertFalse(Dishes.isFull());
        assertNull(Dishes.pop());
        assertNull(Dishes.peek());
    }

    @Test
    void testOneDish() {
        AStackOfDishes.Dish oneDish = new AStackOfDishes.Dish("A dish with a big smiley face on it");
        Dishes.push(oneDish);

        assertFalse(Dishes.isEmpty());
        assertFalse(Dishes.isFull());
        assertEquals(1, Dishes.size());
        assertEquals(oneDish, Dishes.pop());
        assertTrue(Dishes.isEmpty());
    }

    @Test
    void testManyDishes() {
        AStackOfDishes.Dish oneDish = new AStackOfDishes.Dish("A dish with a big smiley face on it");
        AStackOfDishes.Dish twoDish = new AStackOfDishes.Dish("A dish with a big frowny face on it");
        AStackOfDishes.Dish threeDish = new AStackOfDishes.Dish("A dish with a no face on it");

        Dishes.push(oneDish);
        Dishes.push(twoDish);
        Dishes.push(threeDish);

        assertFalse(Dishes.isEmpty());
        assertFalse(Dishes.isFull());
        assertEquals(threeDish, Dishes.pop());
        assertEquals(2, Dishes.size());
        assertEquals(twoDish, Dishes.pop());
        assertEquals(1, Dishes.size());
        assertEquals(oneDish, Dishes.pop());
        assertTrue(Dishes.isEmpty());
    }

    @Test
    void testFullDishes() {
        AStackOfDishes.Dish oneDish = new AStackOfDishes.Dish("A dish with a big smiley face on it");
        AStackOfDishes.Dish twoDish = new AStackOfDishes.Dish("A dish with a big frowny face on it");
        AStackOfDishes.Dish threeDish = new AStackOfDishes.Dish("A dish with a no face on it");
        AStackOfDishes.Dish fourDish = new AStackOfDishes.Dish("A dish with a small angry on it");
        AStackOfDishes.Dish fiveDish = new AStackOfDishes.Dish("A dish with a medium smerk on it"); 
        
        Dishes.push(oneDish);
        Dishes.push(twoDish);
        Dishes.push(threeDish);
        Dishes.push(fourDish);
        Dishes.push(fiveDish);

        assertTrue(Dishes.isFull());
    }

    @Test
    void testTooManyDishes() {
        AStackOfDishes.Dish oneDish = new AStackOfDishes.Dish("A dish with a big smiley face on it");
        AStackOfDishes.Dish twoDish = new AStackOfDishes.Dish("A dish with a big frowny face on it");
        AStackOfDishes.Dish threeDish = new AStackOfDishes.Dish("A dish with a no face on it");
        AStackOfDishes.Dish fourDish = new AStackOfDishes.Dish("A dish with a small angry on it");
        AStackOfDishes.Dish fiveDish = new AStackOfDishes.Dish("A dish with a medium smerk on it"); 
        AStackOfDishes.Dish sixDish = new AStackOfDishes.Dish("A dish too big to fit");

        Dishes.push(oneDish);
        Dishes.push(twoDish);
        Dishes.push(threeDish);
        Dishes.push(fourDish);
        Dishes.push(fiveDish);
        
        assertTrue(Dishes.isFull());

        Dishes.push(sixDish);

        assertEquals(5, Dishes.size());
        assertEquals(fiveDish, Dishes.pop());
    }
}
