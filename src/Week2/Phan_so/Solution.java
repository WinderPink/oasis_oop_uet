/**
 * Lớp Solution biểu diễn một phân số (tử số / mẫu số).
 * Hỗ trợ các phép toán: cộng, trừ, nhân, chia, rút gọn và so sánh bằng.
 */
public class Solution {
    private int numerator;
    private int denominator;

    /**
     * Hàm khởi tạo phân số.
     *
     * @param numerator tử số
     * @param denominator mẫu số (không được bằng 0, nếu bằng 0 sẽ gán thành 1)
     */
    public Solution(int numerator, int denominator) {
        if (denominator != 0) {
            setNumerator(numerator);
            setDenominator(denominator);
        } else {
            setNumerator(numerator);
            setDenominator(1);
        }
    }

    /**
     * Tính ước số chung lớn nhất (GCD).
     *
     * @param a số thứ nhất
     * @param b số thứ hai
     * @return ước số chung lớn nhất của a và b
     */
    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0 || a == b) {
            return a;
        }
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return Math.abs(b);
    }

    /**
     * Lấy tử số.
     *
     * @return giá trị tử số
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Gán tử số.
     *
     * @param numerator tử số cần gán
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Lấy mẫu số.
     *
     * @return giá trị mẫu số
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Gán mẫu số (mẫu số = 0 sẽ bị bỏ qua).
     *
     * @param denominator mẫu số cần gán
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * Rút gọn phân số hiện tại.
     *
     * @return một phân số mới đã được rút gọn
     */
    public Solution reduce() {
        int gcd = gcd(numerator, denominator);
        if (gcd != 0) {
            return new Solution(numerator / gcd, denominator / gcd);
        } else {
            return new Solution(numerator, denominator);
        }
    }

    /**
     * Cộng với một phân số khác.
     *
     * @param fraction phân số khác
     * @return phân số mới sau khi cộng
     */
    public Solution add(Solution fraction) {
        if (fraction.getDenominator() != 0) {
            this.numerator = (this.numerator * fraction.getDenominator())
                    + (fraction.getNumerator() * this.denominator);
            this.denominator = this.denominator * fraction.getDenominator();
        }
        return this.reduce();
    }

    /**
     * Trừ đi một phân số khác.
     *
     * @param fraction phân số khác
     * @return phân số mới sau khi trừ
     */
    public Solution subtract(Solution fraction) {
        if (fraction.getDenominator() != 0) {
            this.numerator = (this.numerator * fraction.getDenominator())
                    - (fraction.getNumerator() * this.denominator);
            this.denominator = this.denominator * fraction.getDenominator();
        }
        return this.reduce();
    }

    /**
     * Nhân với một phân số khác.
     *
     * @param fraction phân số khác
     * @return phân số mới sau khi nhân
     */
    public Solution multiply(Solution fraction) {
        if (fraction.getDenominator() != 0) {
            this.numerator = this.numerator * fraction.getNumerator();
            this.denominator = this.denominator * fraction.getDenominator();
        }
        return this.reduce();
    }

    /**
     * Chia cho một phân số khác.
     *
     * @param fraction phân số khác
     * @return phân số mới sau khi chia
     */
    public Solution divide(Solution fraction) {
        if (fraction.getDenominator() != 0) {
            this.numerator = this.numerator * fraction.getDenominator();
            this.denominator = this.denominator * fraction.getNumerator();
        }
        return this.reduce();
    }

    /**
     * So sánh phân số: trả về true nếu bằng nhau, false nếu khác nhau.
     *
     * @param obj đối tượng cần so sánh (có thể là phân số)
     * @return true nếu bằng nhau, false nếu khác
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;

            other = other.reduce();
            return other.getNumerator() == this.reduce().getNumerator()
                    && other.getDenominator() == this.reduce().getDenominator();
        }
        return false;
    }
}
