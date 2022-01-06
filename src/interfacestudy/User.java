package interfacestudy;

//Tag사용 금지 추상화 클래스 사용

public abstract class User {
    abstract boolean order(String info);
}

class Customer extends User{
    @Override
    boolean order(String info){
        return false;
    }
}

class DeliveryPerson extends User{
    @Override
    boolean order(String info){
        return false;
    }
}
