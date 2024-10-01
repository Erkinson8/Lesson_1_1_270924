import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myLife;
        final int NUM = 10;
        String word = "forest";
        myLife = NUM + word;
        System.out.println(myLife);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
       } else {
            System.out.println("Вы сохранили ноль");}
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.next();
        System.out.println("Привет " + name);
     }
    }