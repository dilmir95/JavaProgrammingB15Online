package replit;

public class Task188 {

    public static void main(String[] args) {

        int[] nums = {12, 12, 43, 56, 65, 21};
        System.out.println(findMax(nums));



    }

    public static int findMax(int[] x) {
        int max = x[0];
        for (int i : x) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static double findMax(double[] x) {
        double max = x[0];
        for (double v : x) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }
}
