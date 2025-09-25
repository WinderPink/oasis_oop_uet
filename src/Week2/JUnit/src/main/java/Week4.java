/**
 * Lớp Week4 cung cấp các phương thức tính toán đơn giản:
 * tìm max của 2 số, min trong mảng, và tính chỉ số BMI.
 */
public class Week4 {
    /**
     * Return max of 2 int.
     *
     * @param a first int
     * @param b second int
     * @return max of 2 int
     */
    public static int max2Int(int a, int b) {
        return (Math.max(a, b));
    }

    /**
     * Return min of array.
     *
     * @param array array
     * @return min of array
     */
    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Calculate BMI and assess health.
     *
     * @param weight weight
     * @param height height
     * @return health assessment
     */
    public static String calculateBMI(double weight, double height){
        double BMI = weight / (height * height);
        BMI = Math.round(BMI * 10.0) / 10.0; // làm tròn 1 chữ số thập phân
        if (BMI < 18.5) {
            return ("Thiếu cân");
        } else if (BMI <= 22.9) {
            return ("Bình thường");
        } else if (BMI <= 24.9) {
            return ("Thừa cân");
        } else {
            return ("Béo phì");
        }
    }
}


