package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 0;

        while(counter < 5){
            System.out.println("I love Java!");
            counter++;

            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                // Standard practice is to restore the interrupted status
                Thread.currentThread().interrupt();
            }


        }
    }
}




