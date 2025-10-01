public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;//here method is not hidden as myAnimal 
                                // is object of Animal class
        Animal.testClassMethod();
        myCat.testInstanceMethod();
        myAnimal.testClassMethod();
        myCat.testClassMethod();
    }
}