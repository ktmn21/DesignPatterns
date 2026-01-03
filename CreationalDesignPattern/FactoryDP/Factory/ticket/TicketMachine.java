package ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TicketMachine {

    private static Map<String, Supplier<Ticket>> ticketMap = new HashMap<>();

    static{
        ticketMap.put("bus", () -> new BusTicket());
        ticketMap.put("train", TrainTicket::new);
        ticketMap.put("plain", PlainTicket::new);
    }

    public Ticket createTicket(String ticketType){
        if(ticketMap.get(ticketType) != null){
            return ticketMap.get(ticketType).get();
        }else{
            throw new IllegalArgumentException("there is no such type of ticket");
        }
    }

}
