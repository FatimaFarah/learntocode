package src.main.cashregister;

public class CashRegister {

  int cash;
  int change;


  public CashRegister( int initialCash) {
    cash = initialCash;
  }


  public double buyItem(double cost, double payment) {

    cash += cost;


    return payment - cash;

  }

  public double returnItem(double costOfItem) {

   cash -= costOfItem;

   return costOfItem;

  }

  public void depositCash() {

    cash += cash;

  }

}


