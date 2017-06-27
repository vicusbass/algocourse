package org.school.divide;

public class HanoiDivideConquer {
    static int counter = 0;

    public static void write(String from, String to) {
        System.out.println("Moving from " + from + " to " + to);
    }

    public static void move(int n, String from, String to, String through) {
        counter++;
        if (n == 1) {
            write(from, to);
        } else {
            move(n - 1, from, through, to);
            write(from, to);
            move(n - 1, through, to, from);
        }
    }

    public static void main(String[] args) {
        HanoiDivideConquer.move(10, "Left", "Middle", "Right");
        System.out.println(HanoiDivideConquer.counter);
    }
}
