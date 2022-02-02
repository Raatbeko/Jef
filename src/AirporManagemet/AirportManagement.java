package AirporManagemet;

import java.io.FileWriter;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;


public class AirportManagement implements Management {

    ArrayList<Flight> flights;
    ArrayList<Ticket> tickets;

    public AirportManagement() {
        Ticket[] tickets;
        Flight[] flights;
    }

    //закомментил ибо выдает ошибку
//    public AirportManagement(Flight[] flights) {
////        this.flights = flights;
//    }

    @Override
    public void addFlight() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите дату вылета: ");
            AirCraft air = new AirCraft();
            air.setDate(LocalDate.parse(sc.nextLine()));
            System.out.println("Откуда вылет: ");
            air.setFrom(sc.nextLine());
            System.out.println("Куда перелет: ");
            air.setTo(sc.nextLine());
            System.out.println("Номер рейса: ");
            Flight fl = new Flight();
            fl.setNumber(sc.nextLine());
            System.out.print("Кол-во свободных мест: ");
            fl.setSize(Integer.parseInt(sc.nextLine()));
            System.out.println("Стоимость одного билета: ");
            fl.setPrice(Float.parseFloat(sc.nextLine()));
            fl.setInfo(air);
            flights.add(fl);
            System.out.println("Рейс был успешно добавлен");
        } catch (Exception ex) {
            System.out.println("Ошибка при вводе данных: ");
        }
    }

    @Override
    public void buyTicketOfNumberFlight() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Укажите номер рейса: ");
            String number = sc.nextLine();
            for (int i = 0; i < flights.size(); i++) {
                Flight f = flights.get(i);
                if (f.getNumber() == null ? number == null : f.getNumber().equals(number)) {
                    if (f.getSize() > 0) {
                        f.setSize(f.getSize() - 1);
                        Ticket t = new Ticket();
                        System.out.println("Введите имя пассажира: ");
                        t.setName(sc.nextLine());
                        t.setFlight(number);
                        tickets.add(t);
                        System.out.println("Билет был успешно куплен!");
                    } else {
                        System.out.println("Увы, но по данному рейсу все билеты уже распроданы");
                    }
                    return;
                }
            }
            System.out.println("Не удалось найти указанный номер рейса");
        } catch (Exception ex) {
            System.out.println("Ошибка при вводе данных");
        }
    }

    @Override
    public void showAllFlight() {  //просмотр всех рейсов
        if (flights.size() > 0) {
            for (int i = 0; i < flights.size(); i++) {
                flights.get(i).show();
            }
        } else {
            System.out.println("Список пуст");
        }
    }


    @Override
    public void report() {
        try {
            FileWriter fw = new FileWriter("report.txt");
            fw.write("Номер рейса      Билетов продано     Свободно\n");
            for (int i = 0; i < flights.size(); i++) {
                Flight f = flights.get(i);
                int size = 0;
                for (int j = 0; j < tickets.size(); j++) {
                    if (tickets.get(j).getFlight() == null ? f.getNumber() == null : tickets.get(j).getFlight().equals(f.getNumber())) {
                        size++;
                    }
                }
                fw.write(String.format("%6a%d%14d\n", f.getNumber(), size, f.getSize()));
            }
            fw.close();
            System.out.println("Данные были успешно добавлены в файл report.txt");
        } catch (Exception ex) {
            System.out.println("Ошибка записи данных в файл report.txt");
        }

    }

    @Override
    public Flight searchFlightByTicketNumber() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Укажите номер билета: ");
            int number = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < tickets.size(); i++) {
                Ticket t = tickets.get(i);
                if (t.getNumTicket() == number) {
                    for (int j = 0; j < flights.size(); j++) {
                        if (flights.get(j).getNumber() == null ? t.getFlight() == null : flights.get(j).getNumber().equals(t.getFlight())) {
                            return flights.get(j);
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Ошибка при вводе данных");
        }
        return null;
    }

//    public Flight[] getFlights() {                ///горят красными
//        return flights;
//    }
//
//    public void setFlights(Flight[] flights) {
//        this.flights = flights;
//    }


}
