import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

abstract class Assets {
    protected double revenue;
    protected double cost;
    protected int quantity;

    abstract public void findRevenue(double rateUSD);

    public double getFinalRevenue() {
        return this.revenue - this.cost;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }


    Assets() {
        this.quantity = 0;
    }

    public int getQuantity() {
        return this.quantity;
    }
}

class Product extends Assets {
    Product() {
        super();
    }

    public void findRevenue(double rateUSD) {
        this.cost = this.quantity * rateUSD;
        this.revenue = this.cost * 1.2;
    }
}

class Stock extends Assets {
    private int productQuantity;

    Stock() {
        super();
        this.productQuantity = 0;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void findRevenue(double rateUSD) {
        this.cost = this.quantity * rateUSD;
        this.revenue = (this.productQuantity * rateUSD * this.quantity) / 2.0;
    }
}

class Futures extends Assets {
    Futures() {
        super();
    }

    public void findRevenue(double rateUSD) {
        this.cost = this.quantity * rateUSD;
        this.revenue = this.cost * 1.5;
    }
}

public class Exchange {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        int next;
        final int rateQuantity = 3;

        Product product = new Product();
        Stock stock = new Stock();
        Futures futures = new Futures();
        int rateUSD;

        for (int i = 0; i < rateQuantity; i++) {
            while (true) {
                next = inputStream.nextInt();

                if (next == -1) {
                    next = inputStream.nextInt();
                    rateUSD = next;
                    if (i != 2) {
                        int drop = inputStream.nextInt();
                    }
                    break;
                }

                switch (next) {
                    case 1:
                        next = inputStream.nextInt();
                        product.addQuantity(next);
                        stock.setProductQuantity(product.getQuantity());
                        break;
                    case 2:
                        next = inputStream.nextInt();
                        stock.addQuantity(next);
                        break;
                    case 3:
                        next = inputStream.nextInt();
                        futures.addQuantity(next);
                        break;
                }
            }

            double totalRevenue = 0;

            List<Assets> assets = new LinkedList<Assets>() {
                {
                    add(product);
                    add(stock);
                    add(futures);
                }
            };

            for (Assets a : assets) {
                a.findRevenue(rateUSD);
                totalRevenue += a.getFinalRevenue();
            }

            System.out.print(totalRevenue);
            if (i != 2) {
                System.out.print(" ");
            }
        }

    }
}