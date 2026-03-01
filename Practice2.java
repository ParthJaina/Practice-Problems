// Create TravelComputation Class to compute Total Distance and Total Time

class TravelComputation {
    public static void main(String[] args) {

        // Name of the person travelling
        String name = "Eric";

        // Create city variables (from → via → to)
        String fromCity = "Chennai";
        String viaCity = "Vellore";
        String toCity = "Bangalore";

        // Distance from Chennai to Vellore
        double distanceFromToViaCity = 156.56;

        // Time from Chennai to Vellore in minutes (4 hours 4 minutes)
        int timeFromToViaCity = (4 * 60) + 4;

        // Distance from Vellore to Bangalore
        double distanceViaToToCity = 211.8;

        // Time from Vellore to Bangalore in minutes (4 hours 25 minutes)
        int timeViaToToCity = (4 * 60) + 25;

        // Compute total distance
        double totalDistance = distanceFromToViaCity + distanceViaToToCity;

        // Compute total time (in minutes)
        int totalTime = timeFromToViaCity + timeViaToToCity;

        // Print results
        System.out.println("Total Distance Travelled by " + name + " is " 
                + totalDistance + " Km.");
        System.out.println("Total Time Taken is " 
                + totalTime + " minutes.");
    }
}