package com.csc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.csc.AStackOfDishes.ComputerPart;
import com.csc.AStackOfDishes.StrawHat;

class AStackOfDishesTest {

    AStackOfDishes Dishes;
    AStackOfDishes<StrawHat> strawHatStack;
    AStackOfDishes<ComputerPart> computerPartStack;
    
    @BeforeEach
    void setup(){
        Dishes = new AStackOfDishes(5);
        strawHatStack = new AStackOfDishes<>(5);
        computerPartStack = new AStackOfDishes<>(5);
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

    @Test
    void testZeroStrawHats() {
        assertTrue(strawHatStack.isEmpty());
        assertFalse(strawHatStack.isFull());
        assertNull(strawHatStack.pop());
        assertNull(strawHatStack.peek());
    }

    @Test
    void testOneStrawHat() {
        AStackOfDishes.StrawHat luffy = new AStackOfDishes.StrawHat("Monkey D. Luffy");
        strawHatStack.push(luffy);

        assertFalse(strawHatStack.isEmpty());
        assertFalse(strawHatStack.isFull());
        assertEquals(1, strawHatStack.size());
        assertEquals(luffy, strawHatStack.pop());
        assertTrue(strawHatStack.isEmpty());
    }

    @Test
    void testManyStrawHats() {
        AStackOfDishes.StrawHat luffy = new AStackOfDishes.StrawHat("Monkey D. Luffy");
        AStackOfDishes.StrawHat zoro = new AStackOfDishes.StrawHat("Roronoa Zoro");
        AStackOfDishes.StrawHat nami = new AStackOfDishes.StrawHat("Nami");

        strawHatStack.push(luffy);
        strawHatStack.push(zoro);
        strawHatStack.push(nami);

        assertFalse(strawHatStack.isEmpty());
        assertFalse(strawHatStack.isFull());
        assertEquals(nami, strawHatStack.pop());
        assertEquals(2, strawHatStack.size());
        assertEquals(zoro, strawHatStack.pop());
        assertEquals(1, strawHatStack.size());
        assertEquals(luffy, strawHatStack.pop());
        assertTrue(strawHatStack.isEmpty());
    }

    @Test
    void testFullStrawHats() {
        AStackOfDishes.StrawHat luffy = new AStackOfDishes.StrawHat("Monkey D. Luffy");
        AStackOfDishes.StrawHat zoro = new AStackOfDishes.StrawHat("Roronoa Zoro");
        AStackOfDishes.StrawHat nami = new AStackOfDishes.StrawHat("Nami");
        AStackOfDishes.StrawHat usopp = new AStackOfDishes.StrawHat("Usopp");
        AStackOfDishes.StrawHat brook = new AStackOfDishes.StrawHat("Brook");

        strawHatStack.push(luffy);
        strawHatStack.push(zoro);
        strawHatStack.push(nami);
        strawHatStack.push(usopp);
        strawHatStack.push(brook);

        assertTrue(strawHatStack.isFull());
    }

    @Test
    void testTooManyStrawHats() {
        AStackOfDishes.StrawHat luffy = new AStackOfDishes.StrawHat("Monkey D. Luffy");
        AStackOfDishes.StrawHat zoro = new AStackOfDishes.StrawHat("Roronoa Zoro");
        AStackOfDishes.StrawHat nami = new AStackOfDishes.StrawHat("Nami");
        AStackOfDishes.StrawHat usopp = new AStackOfDishes.StrawHat("Usopp");
        AStackOfDishes.StrawHat brook = new AStackOfDishes.StrawHat("Brook");

        strawHatStack.push(luffy);
        strawHatStack.push(zoro);
        strawHatStack.push(nami);
        strawHatStack.push(usopp);
        strawHatStack.push(brook);

        assertTrue(strawHatStack.isFull());

        strawHatStack.push(new AStackOfDishes.StrawHat("Chopper"));

        assertEquals(5, strawHatStack.size());
        assertEquals(brook, strawHatStack.pop());
    }

    @Test
    void testZeroComputerParts() {
        assertTrue(computerPartStack.isEmpty());
        assertFalse(computerPartStack.isFull());
        assertNull(computerPartStack.pop());
        assertNull(computerPartStack.peek());
    }

    @Test
    void testOneComputerPart() {
        AStackOfDishes.ComputerPart cpu = new AStackOfDishes.ComputerPart("Intel i7 Processor");
        computerPartStack.push(cpu);

        assertFalse(computerPartStack.isEmpty());
        assertFalse(computerPartStack.isFull());
        assertEquals(1, computerPartStack.size());
        assertEquals(cpu, computerPartStack.pop());
        assertTrue(computerPartStack.isEmpty());
    }

    @Test
    void testManyComputerParts() {
        AStackOfDishes.ComputerPart cpu = new AStackOfDishes.ComputerPart("Intel i7 Processor");
        AStackOfDishes.ComputerPart gpu = new AStackOfDishes.ComputerPart("NVIDIA RTX 4070 ti");
        AStackOfDishes.ComputerPart ram = new AStackOfDishes.ComputerPart("32GB DDR5 RAM");

        computerPartStack.push(cpu);
        computerPartStack.push(gpu);
        computerPartStack.push(ram);

        assertFalse(computerPartStack.isEmpty());
        assertFalse(computerPartStack.isFull());
        assertEquals(ram, computerPartStack.pop());
        assertEquals(2, computerPartStack.size());
        assertEquals(gpu, computerPartStack.pop());
        assertEquals(1, computerPartStack.size());
        assertEquals(cpu, computerPartStack.pop());
        assertTrue(computerPartStack.isEmpty());
    }

    @Test
    void testFullComputerParts() {
        AStackOfDishes.ComputerPart cpu = new AStackOfDishes.ComputerPart("Intel i7 Processor");
        AStackOfDishes.ComputerPart gpu = new AStackOfDishes.ComputerPart("NVIDIA RTX 4070 ti");
        AStackOfDishes.ComputerPart ram = new AStackOfDishes.ComputerPart("32GB DDR5 RAM");
        AStackOfDishes.ComputerPart ssd = new AStackOfDishes.ComputerPart("1TB SSD");
        AStackOfDishes.ComputerPart cooler = new AStackOfDishes.ComputerPart("NVME AIO Cooler");
        computerPartStack.push(cpu);
        computerPartStack.push(gpu);
        computerPartStack.push(ram);
        computerPartStack.push(ssd);
        computerPartStack.push(cooler);


        assertTrue(computerPartStack.isFull());
    }

    @Test
    void testTooManyComputerParts() {
        AStackOfDishes.ComputerPart cpu = new AStackOfDishes.ComputerPart("Intel i7 Processor");
        AStackOfDishes.ComputerPart gpu = new AStackOfDishes.ComputerPart("NVIDIA RTX 4070 ti");
        AStackOfDishes.ComputerPart ram = new AStackOfDishes.ComputerPart("32GB DDR5 RAM");
        AStackOfDishes.ComputerPart ssd = new AStackOfDishes.ComputerPart("1TB SSD");
        AStackOfDishes.ComputerPart cooler = new AStackOfDishes.ComputerPart("NVME AIO Cooler");
        AStackOfDishes.ComputerPart computerCase = new AStackOfDishes.ComputerPart("NVME ATX CASE");

        computerPartStack.push(cpu);
        computerPartStack.push(gpu);
        computerPartStack.push(ram);
        computerPartStack.push(ssd);
        computerPartStack.push(cooler);

        assertTrue(computerPartStack.isFull());

        computerPartStack.push(computerCase);

        assertEquals(5, computerPartStack.size());
        assertEquals(cooler, computerPartStack.pop());
    }
}
