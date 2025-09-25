/**
 * Lớp Transaction mô tả một giao dịch trong tài khoản ngân hàng.
 * Mỗi giao dịch bao gồm loại giao dịch (nạp/rút), số tiền và số dư sau giao dịch.
 */
public class Transaction {
    /**
     * Loại giao dịch: nạp tiền.
     */
    public static final String DEPOSIT = "deposit";
    /**
     * Loại giao dịch: rút tiền.
     */
    public static final String WITHDRAW = "withdraw";

    /**
     * Loại giao dịch.
     */
    private String operation;
    /**
     * Số tiền giao dịch.
     */
    private double amount;
    /**
     * Số dư sau giao dịch.
     */
    private double balance;

    /**
     * Khởi tạo một giao dịch mới.
     *
     * @param operation loại giao dịch (deposit hoặc withdraw)
     * @param amount    số tiền giao dịch
     * @param balance   số dư sau giao dịch
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Lấy loại giao dịch.
     *
     * @return loại giao dịch
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Gán loại giao dịch.
     *
     * @param operation loại giao dịch cần thiết lập
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Lấy số tiền giao dịch.
     *
     * @return số tiền giao dịch
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Gán số tiền giao dịch.
     *
     * @param amount số tiền cần thiết lập
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Lấy số dư sau giao dịch.
     *
     * @return số dư sau giao dịch
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gán số dư giao dịch.
     *
     * @param balance số dư cần thiết lập
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
