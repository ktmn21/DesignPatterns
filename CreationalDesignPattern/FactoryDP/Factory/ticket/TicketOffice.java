package ticket;

public class TicketOffice {

    public static TicketMachine ticketMachine = new TicketMachine();

    public static void main(String[] args) {
        buyBusTicket();
        buyTrainTicket();
        butPlainTicket();
    }

    public static void buyBusTicket(){
        Ticket ticket = ticketMachine.createTicket("bus");
        System.out.println("Bought a new bus ticket with the price of $" + ticket.getPrice());
    }

    public static void buyTrainTicket(){
        Ticket ticket = ticketMachine.createTicket("train");
        System.out.println("Bought a new train ticket with the price of $" + ticket.getPrice());
    }

    private static void butPlainTicket(){
        System.out.println("Bought a new plain ticket with the price of $" + ticketMachine.createTicket("plain").getPrice());
    }

}
