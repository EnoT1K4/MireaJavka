public class VremenaGoda {
    public static void main(String[] args) {
        Vremena season = Vremena.Winter;
        System.out.println(season.perem() + '\n' + season.getDesription() + '\n');
        Vremena season1 = Vremena.Summer;
        System.out.println(season1.perem() + '\n' + season1.getDesription() + '\n');
        Vremena season2 = Vremena.Autumn;
        System.out.println(season2.perem() + '\n' + season2.getDesription() + '\n');
        Vremena season3 = Vremena.Spring;
        System.out.println(season3.perem() + '\n' + season3.getDesription() + '\n');
    }
}