// 3. Реализовать простой калькулятор
// ====================================


package Seminars.Seminar1;
import java.util.Scanner;

public class hw1_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Введите первое число:");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();
        
        System.out.println("Введите второе число:");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();

        System.out.println("Введите операцию:");
        char operation = scanner.next().charAt(0);

        int result = 0;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            }
    System.out.println("Результат операции: " + result);
    n1.close();
    n2.close();
    }
}
 
 