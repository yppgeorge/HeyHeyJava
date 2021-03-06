package LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism;

import LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models.M_03_ClothingItem_Abstract;
import LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models.M_03_Product_Interface;
import LinkedinLearningPath_Learn.Basics_OOPS.InheritanceAndPolymorphism.IP_Models.M_03_Shirt;



public class IP_03_Abstract_Class {

    public static void main(String[] Args) {

//        M_03_ClothingItem_Abstract Item = new M_03_ClothingItem_Abstract("Shirt", "L", 19.99);
//        displayProduct(Item);

        // SUB CLASSES CAL BE USED  WITHOUT DEFINING THE SUPER CLASS
        M_03_Shirt shirt = new M_03_Shirt("L", 29.99);
        displayProduct(shirt);
        shirt.setPattern("Plaid");
        System.out.println("This shirts Pattern is " + shirt.getPattern());

        M_03_ClothingItem_Abstract reallyAShirt = new M_03_Shirt("L", 39.99);
        displayProduct(reallyAShirt);

        M_03_Shirt shirt2 = (M_03_Shirt) reallyAShirt;
        shirt2.setPattern("Solid");
        System.out.println("Pattern = " + shirt2.getPattern());

    }

    // OUTPUT IS OBTAINED FROM INTERFACE THIS INCREASES THE FLEXIBILITY
    // RATHER THAN BEING RESTRICTED TO CLOTHING ITEM, FOR EG YOU CAN USE TOOLS
    
    private static void displayProduct(M_03_Product_Interface product) {
        String output = product.getClass().getSimpleName() + "{" +
                "type='" + product.getType() + '\'' +
                ", size='" + product.getSize() + '\'' +
                ", price=" + product.getPrice() +
                '}';
        System.out.println(output);
    }

}
