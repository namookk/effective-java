package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
순수 함수 사용해야함.
외부 변수를 수정해야할때 금지, return, break, continue를 사용해야할 경우 금지

스트림을 사용할 때, 항상 내부에서 모든일이 완결성 있게 끝나야 한다는 것을 명심하자.

항상 스트림이 정답은 아니고, 반복 방식이 좀 더 좋은 상황도 있다.

하지만 스트림을 먼저 시도해 보는 것이 좋다.

forEach는 결과 보고 할 때만 사용

toList, toMap, groupingBy, joining 등 알아야 함
 */
public class Example {

    //반복 방식
    public static List<Integer> minFive(List<Integer> integerList) {
        List<Integer> returnList = new ArrayList<>();
        List<Integer> copiedList = new ArrayList<>(integerList);
        Collections.sort(copiedList);
        int cnt = 0;
        for(int i = 0; i < copiedList.size(); i++){
            if(i == 5) break;
            returnList.add(copiedList.get(i));
        }
        return returnList;
    }

    //stream코드
    public static List<Integer> minFiveExtend(List<Integer> integerList){
        return integerList.stream()
                .sorted()
                .limit(5)
                .collect(Collectors.toList());
    }

    /**
     * id를 key로, 이름을 value로 가진 map
     * @param userList
     * @return
     */
    public static Map<Long, String> getHeightGroup(List<User> userList){
        return userList.stream().collect(Collectors.toMap(User::getId, User::getName));
    }

    /**
     * 5cm단위로 사람 수를 count한 map response
     *
     * @param userList
     * @return
     */
    public static Map<Integer, Long> getHeightGroup2(List<User> userList){
        return userList.stream().collect(Collectors.groupingBy(
                user -> ((int) user.getHeight()) / 5 * 5, Collectors.counting()
        ));
    }
}

class User{
    private Long id;
    private String name;
    private int age;
    private float height;

    public User(Long id, String name, int age, float height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }
}
