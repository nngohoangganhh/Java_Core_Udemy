package chapter12.video121;

public class IventoryItem <T>{

    private T id;
    private String name;

    public IventoryItem(T id,String name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IventoryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
