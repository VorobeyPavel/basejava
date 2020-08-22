package HomeWork7.Person_and_Animal;

public class Person {

    public Person(String nick, int password) {
        this.nick = nick;
        this.password = password;
    }

    private String nick;
    private int password;


    public String getNick() {
        return nick;
    }

    public int getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
