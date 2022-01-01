package constructer;

import java.util.Objects;

//@EqualsAndHashCode
//@ToString
public class LaptopDto {
    //@ToString.Exclude
    private String modelName;
    private String companyName;

    public static LaptopDto from(Laptop laptop) {
        LaptopDto laptopDto = new LaptopDto();
        laptopDto.companyName = laptop.getCompany();
        laptopDto.modelName = laptop.getModel();

        return laptopDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LaptopDto laptopDto = (LaptopDto) o;
        return Objects.equals(modelName, laptopDto.modelName) &&
                Objects.equals(companyName, laptopDto.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, companyName);
    }

}
