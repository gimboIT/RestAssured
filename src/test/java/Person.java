import java.util.Objects;

public class Person {
    int id;
    String email;
    String first_name;
    String last_name;
    String avatar;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(first_name, person.first_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", mail='" + email + '\'' +
                ", name='" + first_name + '\'' +
                ", lastName='" + last_name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
