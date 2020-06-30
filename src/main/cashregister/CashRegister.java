package src.main.cashregister;

public class CashRegister {

  int cash;
  int change;

  public CashRegister(int initialCash) {
    cash = initialCash;
  }


  public double buyItem(double cost, double payment) {
    cash += cost;

    if (cash > cost) {
      System.out.println("You have enough to buy this item!");
    }
    else {
      System.out.println("You do not have the sufficient funds");
    }
    return payment - cash;
  }

    public double returnItem (double costOfItem) {
    cash -= costOfItem;
      // TODO: 30/06/2020 add code here

    return costOfItem;

    }

    public void depositCash () {
      // TODO: 30/06/2020 add code here
      cash += cash;

    }

  }


