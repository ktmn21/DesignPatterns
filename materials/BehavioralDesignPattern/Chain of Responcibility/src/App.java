
public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        ATM atm = chain();
        atm.dispense(request);
    }

    private static ATM chain(){
        EuroATM euroATM = new EuroATM(null);
        UsDollarATM usDollarATM = new UsDollarATM(euroATM);
        return usDollarATM;
    }

}
