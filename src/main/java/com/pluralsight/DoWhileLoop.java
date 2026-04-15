package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 0;

        do{
            System.out.println("I love Java");
            counter++;
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        } while(counter < 5);
    }
}



