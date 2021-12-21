package constructer;

public class LaptopDto {
    private String modelName;
    private String companyName;

    public static LaptopDto from(Laptop laptop) {
        LaptopDto laptopDto = new LaptopDto();
        laptopDto.companyName = laptop.getCompany();
        laptopDto.modelName = laptop.getModel();

        return laptopDto;
    }
}
