package chapter10.Lap08;

public class BankAccount {
    private String username;
    private String password;
    private double blance;

    public BankAccount(String username,String password, double blance) {
         this.username= username;
        // mật khẩu yếu
       if ( password.length() < 6){
              throw new WeakPasswordException("mật khẩu không đủ kí tự ");
       }else {
           this.password = password;
       }
       this.blance = blance;
    }
    public void  withdraw(double amount) throws NegativeBalanceException {
        if ( amount > blance ){
            throw new NegativeBalanceException("Không đủ số dư để rút tiền.\n");
        }else {
            this.blance = blance - amount;
            System.out.println("Rút tiền thành công .Số dư còn lại "+ this.blance);
        }
    }
}
