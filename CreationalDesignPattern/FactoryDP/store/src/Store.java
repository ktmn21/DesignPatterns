public class Store {

    private static final VendingMachine VENDING_MACHINE = new VendingMachine();

    public static void main(String[] args) {
        buySnack("Chips");
        buySnack("ChocolateBar");
        buySnack("Drinks");
    }

    private static void buySnack(String snackName){
        Snack snack = VENDING_MACHINE.getSnack(snackName);
        System.out.printf("One %s purchased. The price is %d.\n", snackName, snack.getPrice());
    }

}
