package interfacestudy;

public interface Packable {
    // java 8 에서 등장한 default 메소드
    default void packOrder(){
        System.out.println("포장 주문이 들어왔습니다.");
    }
}
