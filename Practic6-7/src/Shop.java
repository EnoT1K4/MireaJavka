public class Shop implements Printable{
    private String name;

    public Shop(String N) {
        this.name = N;
    }
    public void print() {
        String head0 = "Shop", head1 = "Name:";
        System.out.printf("\n==========================\n");
        System.out.printf("%-7s\n", head0);
        System.out.printf("%-7s %15s", head1, name);
        System.out.printf("\n==========================\n");
    }
}
