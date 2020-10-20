package Homework1;

public class Task1 {
    public static void main(String[] args) {
        int x = 42;
        int y = 15;
        int z = x | y;
        System.out.println(z); //47 - 00101111
        int z2 = x & y;
        System.out.println(z2); //10 - 00001010
        int z3 = x ^ y;
        System.out.println(z3); //37 - 00100101
        int z4 = ~x;
        int z5 = ~y;
        System.out.println(z4 + "," + z5); //-43 - 10010101, -16 - 10010000
        int z6 = x >> 2;
        int z7 = y >> 2;
        System.out.println(z6 + "," + z7); //10 - 00001010,3 - 00000011
        int z8 = x << 1;
        int z9 = y << 1;
        System.out.println(z8 + "," + z9); //84 - 01010100,30 - 00011110

        int a = -42;
        int b = -15;
        a &= b;
        System.out.println(a); //-48 - 10110000
        a |= b;
        System.out.println(a); //-15 - 11110001
        a >>= 2;
        System.out.println(a); //-4 - 11111100
        a <<= 3;
        System.out.println(a); //-32 - 11100000
        a ^= b;
        System.out.println(a); //17 - 00010001
        a >>>= 1;
        System.out.println(a); //8 - 00001000
    }
}
