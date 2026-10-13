import java.util.*;


class outofstockexception
        extends Exception {

    public outofstockexception(String message) {
        super(message);
    }
}

class Product {
    private int qut;

    Product(int qut) {
        this.qut = qut;
    }

    void orderitem(int rqut) throws outofstockexception {
        if (rqut > qut) {
            throw new outofstockexception("can not order " +  rqut  + "  we have left only " + qut+"items");

        }
        qut -= rqut;
        System.out.println("order placed for " + rqut + "items");

    }
}

public class cons {
    public static void main(String[] args) {
        Product item = new Product(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the quantity to order");
        int num= sc.nextInt();
        
        try {
            item.orderitem(num);
        } catch (outofstockexception e) {
            System.out.println(e.getMessage());
        }

        // try {
        //     item.orderitem(5);
        // } catch (outofstockexception e) {
        //     System.out.println("order placed " + e.getMessage());
        // }

    }
}
