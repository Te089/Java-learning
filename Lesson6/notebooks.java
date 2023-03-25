public class notebooks {
    private String brand;
    private String ram;
    private String hdd;
    private String os;
    private String colour;

    public notebooks(String brand, String ram, String hdd, String os, String colour){
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
    }

    public String printInfo() {
        System.out.printf("Brand: %s, ram: %s ГБ, hdd: %s ГБ, os: %s, colour: %s", brand, ram, hdd, os, colour);
        return ".";
    }

    public String getRam() {
        return ram;
    }

    public String getBrand() {
        return brand;
    }

    public String gethdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColour() {
        return colour;
    }
}