/*
 * Calculates the distance between two coordinates on Earth using the Haversine formula.
 *
 * Name:              Apostolia Delikosta
 * Last modified:     June 30, 2023
 * 
 */

public class Haversine {
    public static void main(String[] args) {

        double latitude1 = Double.parseDouble(args[0]);
        double longitude1 = Double.parseDouble(args[1]);
        double latitude2 = Double.parseDouble(args[2]);
        double longitude2 = Double.parseDouble(args[3]);

        double earthRadius = 6371; // Earth's radius in kilometers

        // Calculate the great-circle distance using the Haversine formula

        double latitudeDiff = Math.toRadians((latitude2 - latitude1) / 2); // first fraction
        double longitudeDiff = Math.toRadians((longitude2 - longitude1) / 2); // second fraction

        double latitudeSin = Math.pow(Math.sin(latitudeDiff), 2); // first sin calculation
        double longitudeSin = Math.pow(Math.sin(longitudeDiff), 2); // second sin calculation

        double haversineCalc = (latitudeSin +
                        (Math.cos(Math.toRadians(latitude1))) *
                        (Math.cos(Math.toRadians(latitude2))) *
                        longitudeSin); // calculation of the parenthesis

        double haversineSqrt = Math.asin(Math.sqrt(haversineCalc)); // calculation of the Square Root
        double distance = 2 * earthRadius  * haversineSqrt; // calculation of the distance

        System.out.println("The distance between the two coordinates is \n" + distance + " kilometers.");

    }
}
