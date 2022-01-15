package b7_abstract_class_and_interface.thuc_hanh.lop_Animal_and_interface_Edible;

public class Main {
    public static void main(String[] args) {
        Animal[] anime = new Animal[2];
        anime[0] = new Chicken();
        anime[1] = new Tiger();
        for (int a = 0; a < anime.length; a++) {
            System.out.println(anime[a].makeSound());
            if (anime[a] instanceof Chicken){
                System.out.println(((Chicken) anime[a]).howToEat());
                Edible edi = (Chicken)(anime[a]);
                System.out.println(edi.howToEat());

            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0]=new Apple();
        fruit[1] = new Orange();
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i].howToEat());
        }
    }

}
