package NestedClass;

public class User {
    private int age;
    private Address address;

    public String printBarCode(){
        return address.fullAddress + address.zipcode;
    }

    private static class Address{
        private String fullAddress;
        private String zipcode;
    }
}
