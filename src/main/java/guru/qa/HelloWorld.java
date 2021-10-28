package guru.qa;

public class HelloWorld {

    boolean aBoolean = false; //*
    char aChar = '§';
    byte aByte = 1;
    short aShort = 1;
    int aInt = 1; //*
    long aLong = 1L;
    float aFloat = 1.0F;
    double aDouble = 1.0D; //*

    static class Human {
        int age = 0; // 0
        String name = "unnamed human"; // null

        public void sayName() {
            System.out.println(name);
        }

        public void sayAge() {
            System.out.println(age);
        }

        public void incrementAge() {
            age = age + 1;
        }
    }


    // модификатор доступа ||static -> возвращаемое значение -> имя -> (аргументы)
    public static void main(String[] args) {
        int age = 10;
        String message = "HelloWorld!";
        Human dima = new Human();
        Human alex = new Human();
        dima.name = "Дима";
        dima.age = 32;
        alex.name = "Александр";
        alex.age = 32;
        dima.sayName();
        alex.sayName();

        dima.incrementAge();
        dima.sayAge();
        alex.sayAge();
//        System.out.println(message);
    }


}
