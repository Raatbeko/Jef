import AirPort.*;
import AirporManagemet.AirportManagement;
import AirporManagemet.Cashiers;
import AirporManagemet.Flight;
import AirporManagemet.Ticket;

import java.io.File;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        cashiers();
    }

    public static void cashiers() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num;
        int numberOfChoose = -1;
        Cashiers[] cashiers = new Cashiers[]{new Cashiers("Katy"), new Cashiers("Victoria"), new Cashiers("Margo")};
        boolean check1 = true;
        while (check1) {
            try {
                System.out.println("if you're cashier type-> 0\nif you're admin type-> 1");
                System.out.print("> ");

                numberOfChoose = scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Please try again!!!");
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


        AbstractAircraft airbus320 = new Airbus320();
        AbstractAircraft concorde = new Concorde();
        AbstractAircraft heller = new Heller();
        AbstractAircraft hobbyboss = new Hobbyboss();

        AbstractAircraft[] aircrafts = {airbus320, concorde, heller, hobbyboss};

        AirportManagement airportManagement = new AirportManagement(new Flight[aircrafts.length], new Ticket[airbus320.getCountPlace()+concorde.getCountPlace()+heller.getCountPlace()+hobbyboss.getCountPlace()]);

        while (true) {
            System.out.println("\n- Добавление новых рейсов-> 1\n" +
                    "- Покупка билетов по номеру рейса-> 2\n- Просмотр всех рейсов-> 3\n" +
                    "- Сформировать отчет по каждому рейсу-> 4\n" +
                    "- Поиск рейса по номеру билета-> 5\n" +
                    "- Удаление билетов по номеру рейса-> 6\n" +
                    "- Рабочий день окончен-> 0");

            try {
                num = scanner.nextInt();
            } catch (InputMismatchException var10) {
                System.out.println("Error try again!");
            }

            switch (num) {
                case 1:
                    airportManagement.checkingForFull();
                    String whereDoesFly, departurePoint,data ,departureTime, arrivalTime, nameOfAirplane;
                    System.out.print("Where does fly-> ");
                    whereDoesFly = scanner.next();
                    System.out.print("\nDeparture point->");
                    departurePoint = scanner.next();
                    System.out.print("\nData-> ");
                    data = scanner.next();
                    System.out.print("Departure time-> ");
                    departureTime = scanner.next();
                    System.out.print("\nArrival time-> ");
                    arrivalTime = scanner.next();
                    System.out.print("\nName of airplane-> ");
                    nameOfAirplane = scanner.next();
                    try {
                        for (Flight flight : airportManagement.getFlights()) {
                            if (flight.getAircraft().getModel().equalsIgnoreCase(nameOfAirplane)) {
                                System.out.println("Such aircraft has already been added.");
                                System.out.print("\nName of airplane-> ");
                                nameOfAirplane = scanner.next();
                                break;
                            }
                        }
                    }catch (NullPointerException ex){
                        System.out.println("");
                    }
                    boolean check2 = true;
                    for (AbstractAircraft aircraft : aircrafts) {
                        if (nameOfAirplane.equalsIgnoreCase(aircraft.getModel())) {
                            airportManagement.addFlight(whereDoesFly, departurePoint, data,departureTime, arrivalTime, aircraft);
                            check2 = false;
                        }
                    }
                    if (check2) {
                        System.out.println("Can't found airplane.Please try again");
                    }
                    System.out.println(scanner.next());
                    break;
                case 2:

                    System.out.print("Type num of flight-> ");
                    int numberOfFlight = scanner.nextInt();

                    System.out.print("Type him place-> ");
                    int numOfPlace = scanner.nextInt();

                    airportManagement.fillOutATicket(airportManagement.buyTicketOfNumberFlight(numberOfFlight), numOfPlace);
                    break;
                case 3:
                    System.out.println();
                    airportManagement.showAllFlight();
                    break;
                case 4:
                    System.out.println(airportManagement.report());
                    System.out.println("\nDo you want to add-> 0");
                    System.out.println("Or it something->1");
                    int number = scanner.nextInt();
                    switch (number) {
                        case 0:
                            System.out.print("Type name file->");
                            String nameFile = scanner.next();
                            File file = new File(nameFile + ".txt");
                            FileWriter fileWriter = new FileWriter(file);
                            fileWriter.write(airportManagement.report());
                            fileWriter.close();
                            System.out.println("File added");
                            break;
                        case 1:
                            int num1 = 0;
                            num++;
                            File file1 = new File("C:\\Users\\Dell\\Downloads\\file"+num1);
                            FileWriter fileWriter1 = new FileWriter(file1);
                            fileWriter1.write(airportManagement.report());
                            fileWriter1.close();
                            System.out.println("File added");
                            break;
                    }

                    break;
                case 5:
                    System.out.print("Type ticket number-> ");
                    int numOfTicket = scanner.nextInt();
                    airportManagement.searchFlightByTicketNumber(numOfTicket);
                    break;
                case 6:
                    System.out.println("Type flight number-> ");
                    int numOfFlight = scanner.nextInt();
                    airportManagement.removeTicket(numOfFlight);
                    break;
                default:
                    if (0 == num) {
                        return;
                    }

            }
        }
    }
}
