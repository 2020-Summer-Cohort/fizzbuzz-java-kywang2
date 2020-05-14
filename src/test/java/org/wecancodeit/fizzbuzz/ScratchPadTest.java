package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScratchPadTest {

    @Test
    public void oneToEqualToOne() {
        //arrange, stuff you need to do for assertion test



        //action



        //assertion, takes two values and asserts they're equal
        assertEquals(1,1);


    }
    @Test
    public void additionAdds1And1TogetherToMake2() {
        //action, compilation error because addition doesn't exist yet

        int result = addition(1,1);

        //assertion
        assertEquals(2,result);
    }

    @Test
    public void additionAdds10And32TogetherToMake42() {
        //action, compilation error because addition doesn't exist yet

        int result = addition  (10,32);

        //assertion
        assertEquals(42,result);

    }

    private int addition(int baseNumber, int numberToAdd) {
        return baseNumber+numberToAdd;
    }
}
