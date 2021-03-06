package LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models;

public  abstract class M_03_ClothingItem_Abstract implements M_03_Product_Interface {

    // VARIABLES
    private String type;
    private String size;
    private double price;

    // TO STRING METHODS
    // CODE CAn BE IMPROVED FOR THE CASTING
    // IMPROVEMENT - TO pull the class
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    // CONSTRUCTOR
    public M_03_ClothingItem_Abstract(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    // GETTER SETTER METHODS
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract double getPrice();
//
//    GETTING RID OF IT AS ITS GOING TO BE ABSTRACT
//    public void setPrice(double price) {
//        this.price = price;
//    }


}
