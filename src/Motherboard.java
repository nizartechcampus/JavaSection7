public class Motherboard {
    private String model;
    private String manufacturer ;
    private int RamSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        RamSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return RamSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
