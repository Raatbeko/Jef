package AirporManagemet;


public class AirportManagement implements Management {

  private Flight[] flights;
  private Ticket[] tickets;

  public AirportManagement(Flight[] flights) {
      this.flights = flights;
  }


    @Override
    public void addFlight() {

    }

    @Override
    public void buyTicketOfNumberFlight() {

    }

    @Override
    public void showAllFlight() {  //просмотр всех рейсов

    }


    @Override
    public void report() {

    }

    @Override
    public void searchFlightByTicketNumber(Ticket[] tickets, int numberofFlight) {
      for(int i = 0; i < tickets.length; i++){
          if(tickets[i] == null){
              System.out.println("Your ticket is ");
          }
      }
    }


    public Flight[] getFlights() {                ///горят красными
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }


}
