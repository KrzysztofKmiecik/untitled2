
class A {int a;}
class B {int b;}

public class Main3 {

    public static void fun (String c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Object obj = Class.forName(c).newInstance();

        System.out.println("Created object class "+ obj.getClass().getSimpleName());
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        fun("MyBlock");
    }
}
