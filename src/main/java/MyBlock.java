import java.io.Serializable;

public  class MyBlock implements MarkerInterface {
    static {
        System.out.println("static block executed");


    }

    {
        System.out.println("block executed");
    }


    public void  test(){
        System.out.println("test method executed");
    }

    public static void main(String[] args) {
        System.out.println("main executed");
        new MyBlock().test();
        new MyBlock2().test();
        int a = MarkerInterface.A;

    }

}

