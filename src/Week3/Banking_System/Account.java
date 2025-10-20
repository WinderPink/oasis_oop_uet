import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList;

    /**
     * Account constructor 1.
     */
    public Account() {
        this(0, 0);
    }

    /**
     * Account constructor 2.
     * @param accountNumber account number
     * @param balance       balance
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }

    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    /**
     * Checking if deposit amount is valid.
     * @param amount deposit amount
     */
    public void doDepositing(double amount)
            throws InvalidFundingAmountException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        } else {
            this.balance += amount;
        }
    }

    /**
     * Checking if withdraw amount is valid.
     * @param amount withdraw amount
     */
    public void doWithdrawing(double amount)
            throws InsufficientFundsException,
            InvalidFundingAmountException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > this.balance) {
            throw new InsufficientFundsException(amount);
        } else {
            this.balance -= amount;
        }
    }

    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    /**
     * Get transaction history string.
     * @return transaction history string
     */
    public String getTransactionHistory() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(
                "Lịch sử giao dịch của tài khoản %d:",
                this.accountNumber)
        );
        for (Transaction t : transactionList) {
            sb.append("\n");
            sb.append(t.getTransactionSummary());
        }
        return sb.toString();
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Checking if 2 accounts are the same based on account number.
     * @param obj object
     * @return boolean if 2 accounts are the same
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account other = (Account) obj;
        return this.accountNumber == other.accountNumber;
    }
}