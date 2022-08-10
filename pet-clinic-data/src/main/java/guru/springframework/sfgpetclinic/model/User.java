package guru.springframework.sfgpetclinic.model;

public class User {
    private String name;
    private Integer age;
    private String city;

    public String getName() {
        return name;
    }

    public User(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
