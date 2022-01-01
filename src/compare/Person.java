package compare;

import java.util.Comparator;

public class Person {
    private int age;
    private double height;
    private String name;

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }


    private static final Comparator<Person> COMPARATOR =
            Comparator.comparingInt(Person::getAge)
                    .thenComparingDouble(Person::getHeight)
                    .thenComparing(person -> person.getName());

    public int compareTo(Person p){
        // 첫번째 방법
//        int result = Integer.compare(age, p.age);
//        if(result == 0){
//            result = Double.compare(height, p.height);
//        }
//        if(result == 0){
//            result = name.compareTo(p.name);
//        }
//        return result;
        // 두번째 방법
        return COMPARATOR.compare(this, p);
    }

}
