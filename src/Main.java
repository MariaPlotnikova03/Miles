import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int costoftheticketinkopecks = 1500000;
        int coefficient = 2000;
        int miles =  costoftheticketinkopecks / coefficient;
        System.out.println("При покупке билета стоимостью " + costoftheticketinkopecks / 100 + " руб., Ваш бонус составит " + miles + " бонусных миль.");

    }
}
