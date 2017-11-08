package tutorial;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

    private @Id @GeneratedValue Long id;
    private String name;
    private int age;
    private int years;

    private Employee() {
    }

    public Employee(String name, int age, int years) {
        this.name = name;
        this.age = age;
        this.years = years;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYears() {
        return this.years;
    }

    public void setYears(int years) {
        this.years = years;
    }

}
