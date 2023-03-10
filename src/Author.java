import java.util.Objects;

public class Author {

    @Override
    public String toString() {
        return "Автор: " + name + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    private final String name;
    private final String lastName;



    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }


}





