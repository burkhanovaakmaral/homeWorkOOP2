public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Binny");
        dog.setBreed("Dachshund");
        dog.setAge(3);
        dog.setSize("Big");
        dog.setColor("Brown");
        dog.setWildOrPets("Pets");

        System.out.println("Name: "+ dog.getName());
        System.out.println("Breed: "+dog.getBreed());
        System.out.println("Age: "+dog.getAge());
        System.out.println("Size: "+dog.getSize());
        System.out.println("Color: "+dog.getColor());
        System.out.println("Wild or pets: "+dog.getWildOrPets());

        System.out.println();

        System.out.println("Class Fish");
        Fish fish = new Fish();
        fish.setName("Акулла");
        fish.setEcologicalGroup("Морская рыба");
        fish.setClassification("Хрящевая рыба");
        fish.setSize("Большая");
        fish.setPredatoryOrNonPredatory("Хищник");

        System.out.println(fish.getName());
        System.out.println(fish.getEcologicalGroup());
        System.out.println(fish.getClassification());
        System.out.println(fish.getSize());
        System.out.println(fish.getPredatoryOrNonPredatory());

        System.out.println();

        System.out.println("Parrot");
        Parrot parrot = new Parrot();
        parrot.setClassification("Килевые");
        parrot.setSize("Маленький");
        parrot.setColor("Зеленый");
        parrot.setWildOrPets("Дикий");
        parrot.setName("Волнистый попугай");
        System.out.println(parrot.getClassification());
        System.out.println(parrot.getSize());
        System.out.println(parrot.getColor());
        System.out.println(parrot.getWildOrPets());
        System.out.println(parrot.getName());

        System.out.println();

        System.out.println("Cat");
        Cat cat = new Cat();
        cat.setName("Tod");
        cat.setBreed("Persian cat");
        cat.setAge(4);
        cat.setSize("Middle");
        cat.setColor("White");
        cat.setWildOrPets("Pets");
        System.out.println(cat.getName());
        System.out.println(cat.getBreed());
        System.out.println(cat.getAge());
        System.out.println(cat.getSize());
        System.out.println(cat.getColor());
        System.out.println(cat.getWildOrPets());

    }
}