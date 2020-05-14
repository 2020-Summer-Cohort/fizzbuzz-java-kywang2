package org.wecancodeit.fizzbuzz;


public class FizzBuzz {

    public String say(int numberToTranslate) {

        if(numberToTranslate%3 == 0) {
            return "Fizz";
        }
        if(numberToTranslate%5 == 0) {
            return "Buzz";
        }
        if((numberToTranslate%5 == 0)&&(numberToTranslate%3 == 0)) {
            return "FizzBuzz";
        }

        return "" + numberToTranslate;
    }

}
