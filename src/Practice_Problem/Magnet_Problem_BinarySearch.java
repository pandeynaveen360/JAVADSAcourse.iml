package Practice_Problem;

import static java.lang.Math.abs;

public class Magnet_Problem_BinarySearch {

    public static void main(String[] args) {
        double[] magnets = {0, 10, 20, 30};
        int n = magnets.length;
        double[] getAnswer = new double[n - 1];

        nullPoints(n, magnets, getAnswer);

        for (double val : getAnswer) {
            System.out.printf("%.2f ", val);
        }
    }

    public static void nullPoints(int n, double[] magnets, double[] getAnswer) {
        for (int i = 0; i < n - 1; i++) {
            getAnswer[i] = neutral_point(magnets[i], magnets[i + 1], magnets, n);
        }
    }

    public static double neutral_point(double low, double high, double[] magnets, int n) {
        while (high - low > 1e-12) { // Precision check
            double mid = (low + high) / 2;
            double totalforce = 0;

            for (int i = 0; i < n; i++) {
                totalforce += 1 / (mid - magnets[i]);
            }

            if (abs(totalforce) < 1e-7) {
                return mid;
            } else if (totalforce < 0) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return low; // or return high; both are approx the same at precision
    }
}