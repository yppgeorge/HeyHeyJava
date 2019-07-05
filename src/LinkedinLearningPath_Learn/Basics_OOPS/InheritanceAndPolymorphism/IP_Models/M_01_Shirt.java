package LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models;

import LinkedinLearningPath_Learn.Basics.Basics_05_StringManipulation;

public class M_01_Shirt extends M_01_ClothingItem {

    private String pattern = "Not set";

    public M_01_Shirt(String size, double price) {
        super("Shirt", size, price);
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }


}
