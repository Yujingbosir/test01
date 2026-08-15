package testiusb;

public interface usb {
    public void work();
    default public void er(){
        System.out.println("默认方法");

    }
    public static void qw(){
        System.out.println("静态方法");
    }

}
