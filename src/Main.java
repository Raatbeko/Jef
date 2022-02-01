import AirporManagemet.Cashiers;

import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       cashiers();
    }

    public static void cashiers(){
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        int numberOfChoose = -1;
        Cashiers[] cashiers = new Cashiers[]{new Cashiers("Katy"),new Cashiers("Victoria"),new Cashiers("Margo")};
        do {
            System.out.println("if you're cashier type-> 0\nif you're admin type-> 1");
            System.out.print("> ");
            try {
                 numberOfChoose = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Error try again!!!");
            }
            if (numberOfChoose == 0||numberOfChoose == 1){
                num = 0;
            }
        }while (0!=num);
        num = -1;
        do {
            System.out.print("Type your name-> ");
            String nameOfCashier = scanner.next();
            boolean checkName = false;
            for (Cashiers cashier : cashiers) {
                if (nameOfCashier.equalsIgnoreCase(cashier.getFullName())) {
                    System.out.println("Hi " + cashier.getFullName() + "! Have a good working day!!!");
                    checkName = true;
                    num = 0;
                }
            }
            if (checkName != true) {
                System.out.println("We didn't find you.Please try again!");
            }
        }while (0!=num);
        String clear = scanner.next();

        do {
            System.out.println("- Добавление новых рейсов-> 1\n" +
                    "- Покупка билетов по номеру рейса-> 2\n" +
                    "- Просмотр всех рейсов-> 3\n" +
                    "- Сформировать отчет по каждому рейсу-> 4\n" +
                    "- Поиск рейса по номеру билета-> 5\n"+
                    "- Рабочий день окончен-> 0");
            try{
            num = scanner.nextInt();
            }catch (InputMismatchException ex){
                System.out.println("Error try again!");
            }
            switch (num){
                case 1:break;
                case 2:break;
                case 3:break;
                case 4:break;
                case 5:break;
            }


        }while (0 != num);

    }
}

