package chapter10_polymorphism;

public class  Zoo {

    public static void main(String[] args){

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        //Polymorphism
        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        //Polymorphism
        sasha = new Cat();
        sasha.makeSound();
        //Casting
        ((Cat) sasha).scratch();
        feed(sasha);
    }

    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("here is your dog food");
        }
        else if (animal instanceof Cat){
            System.out.println("here is your cat food");
        }

    }
}
