import AirPort.*;
import AirporManagemet.AirportManagement;
import AirporManagemet.Cashiers;
import AirporManagemet.Flight;
import AirporManagemet.Ticket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cashiers();
    }

    public static void cashiers() {
        Scanner scanner = new Scanner(System.in);
        int num;
        int numberOfChoose = -1;
        Cashiers[] cashiers = new Cashiers[]{new Cashiers("Katy"), new Cashiers("Victoria"), new Cashiers("Margo")};
        boolean check1 = true;
        while (check1) {
            System.out.println("if you're cashier type-> 0\nif you're admin type-> 1");
            System.out.print("> ");

            try {
                numberOfChoose = scanner.nextInt();
            } catch (InputMismatchException var11) {
                System.out.println("Error try again!!!");
            }

            if (numberOfChoose == 0 || numberOfChoose == 1) {
                check1 = false;
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

        AirportManagement airportManagement = new AirportManagement(new Flight[]{new Flight(), new Flight()}, new Ticket[150]);
        Flight flight = new Flight();

        AbstractAircraft airbus320 = new Airbus320();
        AbstractAircraft concorde = new Concorde();
        AbstractAircraft heller = new Heller();
        AbstractAircraft hobbyboss = new Hobbyboss();
        AbstractAircraft[] aircrafts = {airbus320, concorde, heller, hobbyboss};

        while (true) {
            System.out.println("- Добавление новых рейсов-> 1\n" +
                    "- Покупка билетов по номеру рейса-> 2\n- Просмотр всех рейсов-> 3\n" +
                    "- Сформировать отчет по каждому рейсу-> 4\n" +
                    "- Поиск рейса по номеру билета-> 5\n" +
                    "- Рабочий день окончен-> 0");

            try {
                num = scanner.nextInt();
            } catch (InputMismatchException var10) {
                System.out.println("Error try again!");
            }

            switch (num) {
                case 1:
                    airportManagement.checkingForFull();
                    String departureTime, arrivalTime, nameOfAirplane;
                    System.out.print("Departure time-> ");
                    departureTime = scanner.next();
                    System.out.print("\nArrival time-> ");
                    arrivalTime = scanner.next();
                    System.out.print("\nName of airplane-> ");
                    nameOfAirplane = scanner.next();
                    boolean check2 = true;
                    for (AbstractAircraft aircraft : aircrafts) {
                        if (nameOfAirplane.equalsIgnoreCase(aircraft.getModel())) {
                            airportManagement.addFlight(departureTime, arrivalTime, aircraft);
                            check2 = false;
                        }
                    }
                    if (check2) {
                        System.out.println("Can't found airplane.Please try again");
                    }
                    System.out.println(scanner.next());
                    break;
                case 2:
                    String whereDoesFly, departurePoint;
                    int numberOfFlight = scanner.nextInt();

                    System.out.println("Type where does fly-> ");
                    whereDoesFly = scanner.next();

                    System.out.println("Type departure point-> ");
                    departurePoint = scanner.next();

                    airportManagement.fillOutATicket(airportManagement.buyTicketOfNumberFlight(numberOfFlight), whereDoesFly, departurePoint);
                    break;
                case 3:
                    airportManagement.showAllFlight();
                    break;
                case 4:
                    airportManagement.report();
                    String enter = scanner.next();
                    break;
                case 5:
                    airportManagement.searchFlightByTicketNumber(1);
                    break;
                case 6:
                    airportManagement.removeTicket(1);
                    break;
                default:
                    if (0 == num) {
                        return;
                    }

            }
        }
    }
}
