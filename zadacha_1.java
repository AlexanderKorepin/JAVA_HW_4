/**
 * Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном
 * порядке и каждый из их узлов содержит одну цифру.
 * 1) Умножьте два числа и верните произведение в виде связанного списка.
 * 2) Сложите два числа и верните сумму в виде связанного списка.
 * Одно или два числа могут быть отрицательными.
 * Даны два Deque, цифры в обратном порядке.
 * [3,2,1,-] - пример Deque
 * [5,4,3]- пример второго Deque
 * 1) -123 * 345 = -42 435
 * Ответ всегда - связный список, в обычном порядке
 * [-,4,2,4,3,5] - пример ответа
 */
import java.util.Deque;
import java.util.LinkedList;
public class zadacha_1 {
    public static void main(String[] args) {
        Deque<Integer> dq1 = new LinkedList<Integer>();
        Deque<Integer> dq2 = new LinkedList<Integer>();
        dq1.add(1);
        dq1.add(2);
        dq1.add(3);
        dq2.add(4);
        dq2.add(5);
        dq2.add(6);
        int number1 = getDigits(dq1);
        int number2 = getDigits(dq2);
        int result1 = number1 * number2;
        int result2 = number1 + number2;
        System.out.printf(number1 + " * " + number2 + " = " + result1);
        System.out.println();
        System.out.println(convertToLinkedList(result1));
        System.out.printf(number1 + " + " + number2 + " = " + result2);
        System.out.println();
        System.out.println(convertToLinkedList(result2));
    }
    public static int getDigits(Deque<Integer> num) {
        int result = 0;
        while (!num.isEmpty()) {
            result = result * 10 + num.removeLast();
        }
        return result;
    }
    public static LinkedList<Integer> convertToLinkedList(int num) {
        LinkedList<Integer> ll = new LinkedList<>();
        if (num > 0) {
            while (num > 0) {
                ll.addFirst(num % 10);
                num /= 10;
            }
            return ll;
        } else {
            while (num < 0) {
                ll.addFirst(num % 10);
                num /= 10;
            }
        }
        return ll;
    }
}