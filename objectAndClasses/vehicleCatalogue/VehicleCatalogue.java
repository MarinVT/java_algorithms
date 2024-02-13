package objectAndClasses.vehicleCatalogue;

public class VehicleCatalogue {
    private String typeOfVehicle;
    private String modelOfVehicle;
    private String colorOfVehicle;
    private int horsepowerOfVehicle;

    public VehicleCatalogue(String typeOfVehicle, String modelOfVehicle, String colorOfVehicle, int horsepowerOfVehicle) {
        this.setTypeOfVehicle(typeOfVehicle);
        this.modelOfVehicle = modelOfVehicle;
        this.colorOfVehicle = colorOfVehicle;
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }

    private void setTypeOfVehicle(String typeOfVehicle){
        typeOfVehicle = typeOfVehicle.replace(typeOfVehicle.charAt(0), Character.toUpperCase(typeOfVehicle.charAt(0)));
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getTypeOfVehicle() {
        return this.typeOfVehicle;
    }

    public String getModelOfVehicle(){
        return this.modelOfVehicle;
    }

    public String getColorOfVehicle() {
        return this.colorOfVehicle;
    }

    public int getHorsepowerOfVehicle() {
        return  this.horsepowerOfVehicle;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%n" + "Model: %s%n" + "Color: %s%n" + "Horsepower: %d",
                                this.getTypeOfVehicle(),
                                this.getModelOfVehicle(),
                                this.getColorOfVehicle(),
                                this.getHorsepowerOfVehicle()
        );
    }
}
