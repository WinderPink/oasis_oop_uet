// Import your library
// Do not change the name of the Solution class
public class Solution {

    /**
     * Kiểm tra một số nguyên có phải là số nguyên tố hay không.
     *
     * @param n số cần kiểm tra
     * @return true nếu n là số nguyên tố, ngược lại false
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // 0, 1 và số âm không phải số nguyên tố
        }
        if (n == 2 || n == 3) {
            return true; // 2 và 3 là số nguyên tố
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; // loại bỏ bội số của 2 và 3
        }

        // Kiểm tra các ước có dạng 6k ± 1
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
