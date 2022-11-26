import java.util.*;
public class PR4C_1 {
    public static class Product {
        //private int Number = 0;
        private String nameProd;
        private double costR;

        public String GroupProd;

        public Product(String name, double cost, String GR) {
            this.nameProd = name;
            this.costR = cost;
            this.GroupProd = GR;
            //this.Number = ++num;
        }

        public String getNameProd() {
            return nameProd;
        }

        public double getCostR() {
            return costR;
        }



        //public int getNumber() {return Number;}
    }
    public enum Group {
        Food(1),
        NotFood(2);
        int Num;

        Group(int I) {
            this.Num = I;
        }
    }

    public static class Shop {
        public Vector<PR4C_1.Group> Groups = new Vector<>();
        public Vector<PR4C_1.Product> Products = new Vector<>(5);

        public Vector<String> Bucket = new Vector<>();

        public Shop() {
            //int FF = (int) (Math.random() * 1);
            Groups.addElement(PR4C_1.Group.Food);
            Groups.addElement(PR4C_1.Group.NotFood);
            for (int i = 0; i < 5; i++) {
                PR4C_1.Product XX = new Product(generateRandomWord(), (50 + (int) (Math.random() * 100)), Groups.get(0).toString());
                Products.addElement(XX);
            }
            for (int j = 0; j < 5; j++) {
                PR4C_1.Product XX = new Product(generateRandomWord(), (50 + (int) (Math.random() * 100)), Groups.get(1).toString());
                Products.addElement(XX);
            }
        }

        public static String generateRandomWord() {
            Random random = new Random();
            String outS;
            char[] word = new char[random.nextInt(4) + 3];
            for (int j = 0; j < word.length; j++) {
                word[j] = (char) ('a' + random.nextInt(26));
            }
            outS = new String(word);
            return outS;
        } // Случайное слово


        public void outProd(String groupNeed) {
            System.out.print("\n===============================\n");
            int GR = 0;
            for (int i = 0; i < Groups.size(); i++) {
                if (groupNeed.equals(Groups.get(i).toString())) {
                    GR = i;
                }
            }
            System.out.printf("%s", Groups.get(GR).toString());
            System.out.print("\n-------------------------------\n");
            String heading1 = "Name";
            String heading2 = "Cos";
            System.out.printf("%-15s %15s", heading1, heading2);
            System.out.print("\n-------------------------------");
            for (int i = 0; i < Products.size(); i++) {
                if (Products.get(i).GroupProd.equals(groupNeed)) {
                    System.out.printf("\n%-15s %15.2f", Products.get(i).getNameProd(), Products.get(i).getCostR());
                }
            }
            System.out.println("\n===============================\n");
        }

        public boolean outGroups() {
            System.out.print("\n================\n");
            String heading0 = "№";
            String heading1 = "Name";
            System.out.printf("%-5s %-15s", heading0, heading1);
            System.out.print("\n----------------");
            for (int i = 0; i < this.Groups.size(); i++) {
                System.out.printf("\n%-5d %-15s", this.Groups.get(i).Num,
                        this.Groups.get(i).toString());
            }
            System.out.print("\n================\n");
            return false;
        }

        public void addBus(String BuyProd) {
            Bucket.addElement(BuyProd);
        }

        public void Buy() {
            for (int i = 0; i < Products.size(); i++) {
                for (int j = 0; j < Bucket.size(); j++) {
                    if (Bucket.get(j).equals(Products.get(i).getNameProd())) {
                        Products.remove(i);
                    }
                }
            }
            Bucket.removeAllElements();
        }
    }

    public static class Person {
        private String login = "qq";
        private String password = "qq";

        public boolean chekPers(String log, String passw) {
            if (this.login.equals(log) && this.password.equals(passw)) {
                return true;
            } else {
                return false;
            }
        }
    }
}