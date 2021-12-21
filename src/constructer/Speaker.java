package constructer;

public enum Speaker {
    //public방식
//    public static final Speaker INSTANCE = new Speaker();
//    private Speaker(){}

    //private방식
//    private static final Speaker INSTANCE = new Speaker();
//    private Speaker(){}
//
//    public static Speaker getInstance() {
//        return INSTANCE;
//    }

    //lazy하게 생성하는 방법
//    private static Speaker instance;
//    private Speaker() {}
//
//    public static synchronized Speaker getInstance(){
//        if(instance == null){
//            instance = new Speaker();
//        }
//        return instance;
//    }

    //Enum Type으로 Singleton pattern사용

    INSTANCE;
    private String message;
    public Speaker getInstance() {
        return INSTANCE;
    }
    public void setMessage(String message){ this.message = message; }
    public String getMessage(){ return message; }
}
