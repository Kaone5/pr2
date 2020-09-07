package ru.mirea.ivashchenko.pr2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(150,150);
        System.out.println(b1);

        b1.move(45,54);
        System.out.println(b1);
    }
}