import java.util.*;
//Online Shopping System using Abstraction
abstract class OnlineShopping {
    abstract void purchase();
}

class Amazon extends OnlineShopping {
    void purchase() {
        System.out.println("Purchase completed on Amazon.");
    }

    public static void main(String[] args) {
        Amazon order = new Amazon();
        order.purchase();
    }
}
