package b7_abstract_class_and_interface.thuc_hanh.lop_Animal_and_interface_Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Ò Ó O o";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
