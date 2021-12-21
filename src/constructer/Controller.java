package constructer;

//@RestController
public class Controller {

    public static void main(String[] args) {
        Controller ctrl = new Controller();
        ctrl.getSpeaker();
    }

    //@PostMapping(value = "/add")
    public LaptopDto addLapTop(
            //@RequestBody
            LaptopForm laptopForm
     ) {
        // static Factory Method 사용
        Laptop laptop = Laptop.from(laptopForm);

        return LaptopDto.from(laptop);
    }

    public NutritionFacts getNutritionFacts(){
        return new NutritionFacts.Builder(1,2)
                .calories(100)
                .fat(100)
                .build();
    }

    public void getSpeaker(){
        Speaker speaker1 = Speaker.INSTANCE.getInstance();
        speaker1.setMessage("안내 방송 중입니다.");

        Speaker speaker2 = Speaker.INSTANCE;
        System.out.println(speaker1.getMessage());
        System.out.println(speaker2.getMessage());
    }
}
