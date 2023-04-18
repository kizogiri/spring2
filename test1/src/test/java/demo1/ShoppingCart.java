package demo1;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(String Status) {
        System.out.println("Checkout method from shopping cart has been  called!!");
    }


   /* public int quantity(){
        return 2;
    }
    
    */
}
