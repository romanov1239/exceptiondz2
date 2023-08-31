
import java.util.Scanner;

public class Zadanie4 {
/*Разработайте программу, которая выбросит Exception, когда пользователь
вводит пустую строку. Пользователю должно показаться сообщение,
что пустые строки вводить нельзя.*/
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку:");
            String input = scanner.nextLine();

            try {
                if (input.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя.");
                }

                // продолжение работы программы, если строка не пустая

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

