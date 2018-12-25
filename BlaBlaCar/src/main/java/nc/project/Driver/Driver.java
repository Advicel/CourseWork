package nc.project.Driver;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Driver1")
public class Driver {
    @Id
    private String id;
    private String name;
    private int age;
    private String car;

    public Driver(){}
    public Driver(String name,int age,String car){
        this.name=name;
        this.age=age;
        this.car=car;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}
