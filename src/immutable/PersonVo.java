package immutable;

import compare.Person;

//불변객체 생성 Setter X , 생성자 private, 변수들 final
//Setter는 꼭 필요한 상황에만 쓰자
//Class는 꼭 필요한 경우가 아니면 불변
//@Getter
public class PersonVo {
    private final String name;
    private final double height;
    private PersonVo(String name, double height){
        this.name = name;
        this.height = height;
    }

    public static final PersonVo from(Person p){
        return new PersonVo(p.getName(), p.getHeight());
    }
}
