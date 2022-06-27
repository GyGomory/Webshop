package company;

import java.util.ArrayList;
import java.util.List;

public class Shoppingcart {

    List<Product> shoppingCartProductList = new ArrayList<>();

    public void addProduct(Product product){
        addProduct(product);
    }
    public void emptyCart(){
        shoppingCartProductList.clear();
    }

    public Shoppingcart(List<Product> shoppingCartProductList){
        this.shoppingCartProductList=shoppingCartProductList;
    }

}
