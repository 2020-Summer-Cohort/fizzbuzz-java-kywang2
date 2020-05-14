package org.wecancodeit.fizzbuzz;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
DONE- 1 should say "1"
2 should say "2"
3 should say "Fizz"
4 should say "4"
5 should say "Buzz"
6 should say "Fizz"
7 should say "7"
8 should say "8"
9 should say "Fizz"
10 should say "Buzz"
 */


public class FizzBuzzTest {
    @Test
    public void createFizzBuzzClass(){
        FizzBuzz underTest = new FizzBuzz();
    }


    @Test
    public void oneShouldSayOne() {
        //arrangement
        FizzBuzz underTest = new FizzBuzz();
        //action
        String result = underTest.say(1);
        //assertion
        assertEquals("1", result);

    }

    @Test
    public void twoShouldSayTwo() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(2);
        assertEquals("2", result);
    }

    @Test
    public void threeShouldSayFizz () {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(3);
        assertEquals("Fizz" , result);
}
    @Test
    public void fourShouldSayFour() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(4);
        assertEquals("4", result);
    }

    @Test
    public void fiveShouldSayFive() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(5);
        assertEquals("Buzz", result);
    }
    @Test
    public void sixShouldSayFizz(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(6);
        assertEquals("Fizz", result);
    }
    @Test
    public void sevenShouldSaySeven(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(7);
        assertEquals(7, result);
    }

    @Test
    public void eightShouldSayEight(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(8);
        assertEquals(8, result);
    }
    @Test
    public void nineShouldSayFizz(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.say(9);
        assertEquals("Fizz", result);
    }
}

