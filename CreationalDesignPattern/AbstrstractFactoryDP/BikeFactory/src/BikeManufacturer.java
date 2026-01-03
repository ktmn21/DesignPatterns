public class BikeManufacturer {


    public static void main(String[] args) {
        Bike roadBike = buildBike("ROAD");
        Bike mountainBike = buildBike("MOUNTAIN");

        System.out.println(roadBike);
        System.out.println(mountainBike);

    }
    private static Bike buildBike(String bikeType) {
        if (bikeType.equalsIgnoreCase("ROAD")) {
            var roadBikeFactory = new RoudBikeFactory();
            var handleBars = roadBikeFactory.createHandlebars();
            var pedals = roadBikeFactory.createPedals();
            var frontTIre = roadBikeFactory.createTire();
            var backTire = roadBikeFactory.createTire();

            return new Bike(handleBars, pedals, frontTIre, backTire);
        } else if (bikeType.equalsIgnoreCase("MOUNTAIN")) {
            var mountainBikeFactory = new MountainBikeFactory();
            var handleBars = mountainBikeFactory.createHandlebars();
            var pedals = mountainBikeFactory.createPedals();
            var frontTIre = mountainBikeFactory.createTire();
            var backTire = mountainBikeFactory.createTire();

            return new Bike(handleBars, pedals, frontTIre, backTire);
        } else {
            throw new IllegalArgumentException("Bike type not supported");
        }

    }
}

