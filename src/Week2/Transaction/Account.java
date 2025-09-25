import java.util.ArrayList;

/**
 * Lớp Account mô tả tài khoản ngân hàng đơn giản.
 * Cho phép nạp tiền, rút tiền, lưu lịch sử giao dịch và in ra danh sách giao dịch.
 */
public class Account {
    /**
     * Số dư hiện tại trong tài khoản.
     */
    private double balance;
    /**
     * Danh sách các giao dịch đã thực hiện.
     */
    private ArrayList<Transaction> transactionList;

    /**
     * Khởi tạo tài khoản mới với số dư = 0.
     */
    public Account() {
        this.balance = 0;
        this.transactionList = new ArrayList<>();
    }

    /**
     * Nạp tiền vào tài khoản.
     *
     * @param amount số tiền nạp
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
            transactionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
        }
    }

    /**
     * Rút tiền khỏi tài khoản.
     *
     * @param amount số tiền rút
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
            transactionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
        }
    }

    /**
     * Thêm một giao dịch (nạp hoặc rút tiền).
     *
     * @param amount    số tiền
     * @param operation loại giao dịch ("deposit" hoặc "withdraw")
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * In ra toàn bộ danh sách giao dịch theo định dạng chuẩn.
     */
    public void printTransaction() {
        int idx = 1;
        for (Transaction t : transactionList) {
            String op = t.getOperation().equals(Transaction.DEPOSIT) ? "Nap tien" : "Rut tien";
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.%n",
                    idx, op, t.getAmount(), t.getBalance());
            idx++;
        }
    }
}
