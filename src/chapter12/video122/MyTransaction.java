package chapter12.video122;

public class MyTransaction<S,U,V> {
    private S transactionId;
    private U amount;
    private  V status;


    public MyTransaction( S transactionId , U amount, V status) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.status = status;
    }

    public S getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(S transactionId) {
        this.transactionId = transactionId;
    }

    public U getAmount() {
        return amount;
    }

    public void setAmount(U amount) {
        this.amount = amount;
    }

    public V getStatus() {
        return status;
    }

    public void setStatus(V status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MyTransaction{" +
                "transactionId=" + transactionId +
                ", amount=" + amount +
                ", status=" + status +
                '}';
    }
}
