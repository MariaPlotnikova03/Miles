import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int costOfTheTicketInKopecks = 15_000_00;
        int coefficient = 20_00;
        int miles =  costOfTheTicketInKopecks / coefficient;
        System.out.println("При покупке билета стоимостью " + costOfTheTicketInKopecks / 100 + " руб., Ваш бонус составит " + miles + " бонусных миль.");

    }
}
