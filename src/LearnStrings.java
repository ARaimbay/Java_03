public class LearnStrings {
    public static void main(String[] args) {
        String fruit = "apple";
        String anotherFruit = "apple";
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");

        System.out.println(fruit == anotherFruit);
        System.out.println(vegetable == anotherVegetable);
        System.out.println("Hello world");
    }
}
