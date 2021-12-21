package constructer;

public class Laptop {

    private long id;
    private String model;
    private String company;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    //기본 생성자
    public Laptop(){};
    public Laptop(String model, String company) {
        this.model = model;
        this.company = company;
    }

    //Static Factory Method
    public static Laptop ofModelAndCompany(String model, String company) {
        Laptop laptop = new Laptop();
        laptop.company = company;
        laptop.model = model;
        return laptop;
    }

    public static Laptop from(LaptopForm laptopForm) {
        Laptop laptop = new Laptop();
        laptop.model = laptopForm.getModel();
        laptop.company = laptopForm.getCorp();

        return laptop;
    }

}
