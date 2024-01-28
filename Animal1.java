class Animal1 {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

 class RuntimePoly {
    public static void main(String[] args) {
        Animal1 animal1 = new Dog();
        Animal1 animal2 = new Cat();

        animal1.makeSound(); // Outputs "Woof!"
        animal2.makeSound(); // Outputs "Meow!"
    }
}