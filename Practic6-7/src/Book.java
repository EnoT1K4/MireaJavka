public class Book implements Printable{
    private String auth = "Ab";

    public Book(String A) {
        this.auth = A;
    }
    public void print() {
        String head0 = "Book", head1 = "Autor:";
        System.out.printf("\n===================\n");
        System.out.printf("%-7s\n", head0);
        System.out.printf("%-7s %10s", head1, auth);
        System.out.printf("\n===================\n");
    }
}
