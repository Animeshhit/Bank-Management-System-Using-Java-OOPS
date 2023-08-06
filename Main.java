
class Bank{
    //balance is Private
    private int money;
    //opening an accoutn with some money
    Bank(int money){
        this.money = money;
    }
    //opening an account with zero balance
    Bank(){

    }
    //addmoney
    public int addMoney(int money){
        return this.money = this.money + money;

    }
    //getbalance
    public int GetBal(){
        System.out.println(this.money);
        return this.money;
    }
    //withdraw money
    public int withdraw(int money){
        return this.money = this.money - money;
    }

}

public class Main{
    public static void main(String[] args){
        Bank b1 = new Bank(200);
        b1.addMoney(400);
        b1.GetBal();
        b1.withdraw(200);
        b1.GetBal();
    }
}

