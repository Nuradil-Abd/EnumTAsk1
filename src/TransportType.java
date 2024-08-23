public enum  TransportType {


    CAR {
        @Override
        public double calculateTravelCost(double distance) {
            return distance * 0.1;
        }
    },
    BUS {
        @Override
        public double calculateTravelCost(double distance) {
            return distance * 0.05;
        }
    },
    TRUCK {
        @Override
        public double calculateTravelCost(double distance) {
            return distance * 0.2;
        }
    };



    public abstract double calculateTravelCost(double distance);
}
