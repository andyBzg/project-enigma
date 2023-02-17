package earthquake;

import java.util.Random;
import java.util.Stack;

public class DataAnalysis {

    public static String startAnalysis() {

        Stack<Integer> registeredEarthquakes = checkForEarthquakes();

        Stack<Integer> dangerousEarthquakes = new Stack<>();
        for (Integer earthquake : registeredEarthquakes) {
            if (earthquake > 3) {
                dangerousEarthquakes.push(earthquake);
            }
        }

        String result;
        if (dangerousEarthquakes.size() >= 5) {
            result = "Earthquake Detected!";
            System.out.println(dangerousEarthquakes);
        }
        else {
            result = "";
        }

        return result;
    }


    private static Stack<Integer> checkForEarthquakes() {
        Random random = new Random();

        int earthquakesPerDay = random.nextInt(0, 20);

        Stack<Integer> earthquakes = new Stack<>();
        for (int i = 0; i < earthquakesPerDay; i++) {
            earthquakes.push(random.nextInt(0, 7));
        }

        return earthquakes;
    }

}
