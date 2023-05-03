package org.example.sem4.hw1;
// Вывести список на экран в перевернутом виде (без массивов и ArrayList)
// Пример:
// 1 -> 2 -> 3 -> 4
// Вывод:
// 4 -> 3 -> 2 -> 1
public class Hw1 {
    public static void main(String[] args) {
        Rn n1 = new Rn(1);
        Rn n2 = new Rn(2);
        Rn n3 = new Rn(3);
        Rn n4 = new Rn(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        printReverse(n1);
    }

    public static void printReverse(Rn n) {
        if (n == null) {
            return;
        }
        printReverse(n.next);
        System.out.print(n.value + "->");
    }
}

