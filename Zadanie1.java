
    import java.util.Scanner;

    public class Zadanie1 {
/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа
 (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно
  приводить к падению приложения, вместо этого, необходимо повторно запросить
  у пользователя ввод данных.*/
        public static void main(String[] args) {
            float number = getFloatNumber();
            System.out.println("Введенное число: " + number);
        }

        private static float getFloatNumber() {
            Scanner scanner = new Scanner(System.in);
            float number = 0;

            while (true) {
                try {
                    System.out.print("Введите дробное число: ");
                    String input = scanner.nextLine();
                    number = Float.parseFloat(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод. Повторите попытку.");
                }
            }

            return number;
        }
    }