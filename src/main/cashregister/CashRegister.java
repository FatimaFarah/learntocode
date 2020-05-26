package src.main.cashregister;

public class CashRegister {

  private double cash = 1000;



  //take in cost of item and payment
  //return amount of change
  //update total cash

  public double buyItem(double cost, double payment) {

    cost = 60;

    payment = cash / cost;



    return payment;
  }

  public double returnItem(double costOfItem) {

    costOfItem = 30;



    return cash + costOfItem;
  }

  //increase total cash

  public void depositCash() {

    cash++;

  }

}
