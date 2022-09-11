import java.util.UUID;

public class MyEntity {

    private UUID id;
    private final String name;

    public MyEntity(String name) {
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyEntity{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}