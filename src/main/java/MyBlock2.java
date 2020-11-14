public class MyBlock2 {
    static {
        System.out.println("2static block executed");


    }

    {
        System.out.println("2block executed");
    }


    public void  test(){
        System.out.println("2test method executed");
    }

    public static void main(String[] args) {
        System.out.println("2main executed");
        new MyBlock2().test();
    }

}

