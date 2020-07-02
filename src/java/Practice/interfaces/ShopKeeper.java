package Practice.interfaces;

public class ShopKeeper extends Person implements Seller {

  ShopKeeper(String name) {
    super(name);
  }

  @Override
  public String chat() {
    return "Hi, I'm a shop keeper!";
  }
@Override
  public void sellGoods(){

  }
}
