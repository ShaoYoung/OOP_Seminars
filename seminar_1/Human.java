package seminar_1;

import java.util.List;

public class Human {
    String gender;
    Human father;
    List<Human> children;

    public Human(String gender, Human father) {
        this.gender = gender;
        this.father = father;
        father.children.add(this);
    }
}
