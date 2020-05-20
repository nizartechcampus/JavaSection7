public class Case {
    private String model;
    private String powerSupply;
    private String manufacturing;
    private Dimensions dimensions;

    public Case(String model, String powerSupply, String manufacturing, Dimensions dimensions) {
        this.model = model;
        this.powerSupply = powerSupply;
        this.manufacturing = manufacturing;
        this.dimensions = dimensions;
    }
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
    public void theCaseSize(){
        System.out.println("the Case Dimension is :- "+ " the Height is "+ dimensions.getHeight()+ " the Width is "+ dimensions.getWidth() +
                " the Depth is "+ dimensions.getDepth());
    }

    public String getModel() {
        return model;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getManufacturing() {
        return manufacturing;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
