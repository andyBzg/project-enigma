package earthquake;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String resultAnalysis;

        if (scanner.nextInt() == -97) {
            resultAnalysis = DataAnalysis.startAnalysis();
        }
        else {
            resultAnalysis = "";
        }

        System.out.println(resultAnalysis);
    }

}
