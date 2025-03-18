import java.util.*;

public class Lesson3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите операцию: ");
        // if (!op.equals("-")) {
        //     System.out.println("error ------");
        //     in.close();
        // } 
        String op = in.nextLine(); //Будеть храниться операция
        System.out.println("Введите a ");
        int a = in.nextInt();
        System.out.println("Введите b ");
        int b = in.nextInt();
        // Метод equals сравнивают переменные по значению
        if (op == "+") {
            System.out.println(a+b);
        } else if (op.equals("-")) {
            System.out.println(a-b);
        } else if (op.equals("*")) {
            System.out.println(a*b);
        } else if (op.equals("/")) {
            System.out.println(a/b);
        } else if (op.equals("%")) {
            System.out.println(a%b);
        } else { 
            System.out.println("Error");
        }
        
        in.close(); // Закрытие потока данных 

    }
}
