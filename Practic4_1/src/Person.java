public class Person {
    String FullName = "Aboba";
    int Age = 123;

    public Person(String FullName, int Age){
        this.Age = Age;
        this.FullName = FullName;
    }

    public Person() {

    }

    public int talk(){
        System.out.println("Такой-то " + FullName + " говорит");
        return 0;
    }
    public int move(){
        System.out.println("Такой-то " + FullName + " не говорит");
        return 1;
    }


}
