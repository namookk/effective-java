package constructer;

//@RestController
public class LaptopController {

    //@PostMapping(value = "/add")
    public LaptopDto addLapTop(
            //@RequestBody
            LaptopForm laptopForm
     ) {
        // static Factory Method 사용
        Laptop laptop = Laptop.from(laptopForm);

        return LaptopDto.from(laptop);
    }
}
