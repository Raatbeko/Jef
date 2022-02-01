import AirporManagemet.Cashiers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cashiers();
    }

    public static void cashiers() {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        int numberOfChoose = -1;
        Cashiers[] cashiers = new Cashiers[]{new Cashiers("Katy"), new Cashiers("Victoria"), new Cashiers("Margo")};
        boolean check = true;
        while (check) {
            System.out.println("if you're cashier type-> 0\nif you're admin type-> 1");
            System.out.print("> ");

            try {
                numberOfChoose = scanner.nextInt();
            } catch (InputMismatchException var11) {
                System.out.println("Error try again!!!");
            }

            if (numberOfChoose == 0 || numberOfChoose == 1) {
                check = false;
            }
        }

        num = -1;

        String nameOfCashier;
        do {
            System.out.print("Type your name-> ");
            nameOfCashier = scanner.next();
            boolean checkName = false;

            for (int i = 0; i < cashiers.length; ++i) {
                if (nameOfCashier.equalsIgnoreCase(cashiers[i].getFullName())) {
                    System.out.println("Hi " + cashiers[i].getFullName() + "! Have a good working day!!!");
                    checkName = true;
                    num = 0;
                }
            }

            if (!checkName) {
                System.out.println("We didn't find you.Please try again!");
            }
        } while (0 != num);

        nameOfCashier = scanner.next();

        while (true) {
            System.out.println("- Добавление новых рейсов-> 1\n- Покупка билетов по номеру рейса-> 2\n- Просмотр всех рейсов-> 3\n- Сформировать отчет по каждому рейсу-> 4\n- Поиск рейса по номеру билета-> 5\n- Рабочий день окончен-> 0");

            try {
                num = scanner.nextInt();
            } catch (InputMismatchException var10) {
                System.out.println("Error try again!");
            }

            switch (num) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    if (0 == num) {
                        return;
                    }
            }
        }
    }
}
