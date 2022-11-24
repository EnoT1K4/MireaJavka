import java.util.Vector;

public class InetMag {

    public static class Product {
        private int Number = 0;
        private String nameProd;
        private double costR;
        public Product (String name, double cost, int num) {
            this.nameProd = name;
            this.costR = cost;
            this.Number = num;
        }

        public String getNameProd() {
            return nameProd;
        }

        public double getCostR() {
            return costR;
        }

        public int getNumber() {
            return Number;
        }
    }

    public static class Store {
        private static Vector<Product> Products = new Vector<>();

        public Store () {
            for (int i = 0; i < 8; i++) {
                String buff = "smth";
                double Cost = 1 + (double) (Math.random()*250);
                Products.addElement(new Product(buff, Cost, i+1));
            }
        } // Создание товаров

        public static void generateProducts() {
            System.out.print("\n=====================================\n");
            String heading0 ="№";
            String heading1 ="Name";
            String heading2 = "Cos(Rub)";
            System.out.printf("%-5s %-15s %15s", heading0, heading1, heading2);
            System.out.print("\n-------------------------------------");
            for (Product product : Products) {
                System.out.printf("\n%-5d %-15s %15.2f", product.getNumber(), product.getNameProd(), product.getCostR());
            }
            System.out.println("\n=====================================\n");
        } // Вывод товаров

        public double inVal(String whatVal, int Num) {
            Convert Buff = new Convert(Products.get(Num-1).getCostR());
            if (whatVal.equals("RUB")) {return Buff.CostR;}
            else if (whatVal.equals("USD")) {return Buff.RUBinUSD();}
            else if (whatVal.equals("EUR")) {return Buff.RUBinEUR();}
            return -1;
        }

        public void Buy(int N) {
            Products.remove(N-1);
        }
    }

    public static class Convert {
        public double CostR;
        Convert(double B) {this.CostR = B;}

        public double RUBinUSD() {
            return CostR/58;
        }


        public double RUBinEUR() {return CostR/56;}
    }



}
