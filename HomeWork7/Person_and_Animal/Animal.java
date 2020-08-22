package HomeWork7.Person_and_Animal;

public class Animal {

    public Animal(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    private String nick;
    private int age;

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }
}
