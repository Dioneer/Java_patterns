package Pegas.chane;

public class MinLimit extends ValidateTransaction{
    @Override
    public void check(MoneyTransaction moneyTransaction) {
        if(moneyTransaction.amount()>1000){
            System.out.println("Please enter password");
        }
        checkNext(moneyTransaction);
    }
}
