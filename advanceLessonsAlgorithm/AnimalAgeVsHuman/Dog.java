package advanceLessonsAlgorithm.AnimalAgeVsHuman;

public class Dog {
    private String _name;
    private int _age;

    public Dog(String name, int age) {
        _name = name;
        _age = age;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getAge() {
        return _age;
    }

    public int getHumanYears() {
        return getAge() * 7;
    }

    public String toString() {
        return "The name of dog is: " + getName() + "\n The dog's age in person years is: " + getHumanYears();
    }

    public void set_age(int _age) {
        this._age = _age;
    }
}
