package Example.Polymorphism;

class Animal{
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
    this.name = name;

    }
public void speak(){
    System.out.println("Hayvan Konusuyor");
}
public static void speaktry(Animal animal){
  animal.speak();
}}
     class Bird extends Animal{

         public Bird(String name) {
             super(name);
         }

         @Override
         public void speak() {
             System.out.println(getName()+ " Otuyor...");
         }
     }
     class Dog extends Animal {
         public Dog(String name) {
             super(name);
         }

         @Override
         public void speak() {
             System.out.println(getName()+" Hurur...");
         }
     }
     class Horse extends Animal {
         public Horse(String name) {
             super(name);
         }

         @Override
         public void speak() {
             System.out.println(getName()+" Kisniyir...");
         }
     }


public class Main {
    public static void main(String[] args) {

        Animal.speaktry(new Dog("Rex"));
}}
