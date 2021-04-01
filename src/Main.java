import javax.management.OperationsException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws OperationsException {
        Scanner sc = new Scanner(System.in);
        int choise = 0;
        do {
            System.out.println("1 - сумма двух чисел");
            System.out.println("2 - разница двух чисел");
            System.out.println("3 - умножение двух чисел");
            System.out.println("4 - деление двух чисел");
            System.out.println("5 - выйти из программы");
            try {
                choise = Integer.parseInt(sc.nextLine());
                System.out.println("Введите первое число: ");
                double firstNumber = Double.parseDouble(sc.nextLine());
                System.out.println("Введите второе число: ");
                double SecondNumber = Double.parseDouble(sc.nextLine());
                switch (choise) {
                    //сумма двух чисел
                    case 1:

                        SumFloat sum = (a, b) -> a + b;
                        double num = sum.sum(firstNumber, SecondNumber);
                        System.out.println(num);

                        break;
                    //разница двух дробных чисел
                    case 2:
                        DifferenceFloat dif = (a, b) -> {
                            if (a < b) {
                                System.out.println("ошибка! Значение первого числа не может быть меньше чем второе число!");
                                return 0;
                            } else {
                                return a - b;
                            }
                        };
                        double num2 = dif.diff(firstNumber, SecondNumber);
                        System.out.println(num2);
                        break;
                    case 3:
                        //умножение двух дробей;
                        Multiplication multi = (a, b) -> a * b;
                        double num3 = multi.multiply(firstNumber, SecondNumber);
                        System.out.println(num3);
                        break;
                    case 4:
                        Divide div = (a, b) -> {
                            try {
                                if (b == 0) {
                                    throw new OperationsException();
                                }
                            } catch (OperationsException ex) {
                                System.out.println("второй операнд не может быть 0");
                            }
                            return a / b;
                        };
                        double d = div.multiply(firstNumber, SecondNumber);
                        System.out.println(d);
                        break;
                }
            } catch (Exception ex) {
                ex.getMessage();
            }
        }while(choise != 5);


    }
}
