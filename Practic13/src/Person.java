
public class Person {
    private String name;
    private final String surname;
    private String otchs;

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String name, String surname, String otchs) {
        this.name = name;
        this.surname = surname;
        this.otchs = otchs;
    }

    public String getFio(){
        StringBuilder fio = new StringBuilder(surname);
        if(name != null && ! name.equals(""))
            fio.append(" ").append(name);
        if(otchs != null && ! otchs.equals(""))
            fio.append(" ").append(otchs);
        return fio.toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("A");
        Person p2 = new Person("A", "B", "");
        Person p3 = new Person("A", "B", "C");
        System.out.println(p1.getFio());
        System.out.println(p2.getFio());
        System.out.println(p3.getFio());
    }
}