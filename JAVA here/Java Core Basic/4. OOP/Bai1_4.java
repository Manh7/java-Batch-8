// Abstract class - Trừu tượng hóa (Abstraction)
abstract class Animal {
    private String name;  // Encapsulation (Đóng gói) - thuộc tính private

    // Constructor để khởi tạo tên động vật
    public Animal(String name) {
        this.name = name;
    }

    // Getter để truy cập thuộc tính name
    public String getName() {
        return name;
    }

    // Phương thức trừu tượng
    public abstract void sound();

    // Phương thức thông thường (có thể được ghi đè)
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Interface - Định nghĩa hành vi di chuyển
interface Movable {
    void move();  // Phương thức trừu tượng, không có thân hàm
}

// Class Dog kế thừa Animal và triển khai Movable
class Dog extends Animal implements Movable {
    public Dog(String name) {
        super(name);  // Gọi constructor của lớp cha
    }

    // Overriding phương thức sound của Animal
    @Override
    public void sound() {
        System.out.println(getName() + " barks!");
    }

    // Implement (triển khai) phương thức move từ interface Movable
    public void move() {
        System.out.println(getName() + " is running!");
    }

    // Overloading phương thức eat - Overloading
    public void eat() {
        System.out.println(getName() + " is eating...");
    }

    public void eat(String food) {
        System.out.println(getName() + " is eating " + food + "...");
    }
}

// Class Cat kế thừa Animal và triển khai Movable
class Cat extends Animal implements Movable {
    public Cat(String name) {
        super(name);
    }

    // Overriding phương thức sound của Animal
    @Override
    public void sound() {
        System.out.println(getName() + " meows!");
    }

    // Implement phương thức move từ interface Movable
    public void move() {
        System.out.println(getName() + " is jumping!");
    }
}

public class Bai1_4 {
    public static void main(String[] args) {
        // Tạo các instance của Dog và Cat
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Gọi các phương thức
        dog.sound();        // Buddy barks!
        dog.move();         // Buddy is running!
        dog.eat();          // Buddy is eating...
        dog.eat("bone");    // Buddy is eating bone...

        cat.sound();        // Whiskers meows!
        cat.move();         // Whiskers is jumping!
        cat.sleep();        // Whiskers is sleeping...

        // Overriding và sử dụng từ khóa super và this
        dog.sleep();        // Buddy is sleeping...
    }
}
