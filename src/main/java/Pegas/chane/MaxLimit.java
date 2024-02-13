package Pegas.chane;

public class MaxLimit extends ValidateTransaction{
    @Override
    public void check(MoneyTransaction moneyTransaction) {
        if(moneyTransaction.amount()>10000){
            System.out.println("Your limit is over");
        }
    }
}
