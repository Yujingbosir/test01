package testiusb;

public class iphone implements usb{
    public void work(){
        System.out.println("我要开始工作啦");

    }

    @Override
    public void er() {
        System.out.println("默认方法重写");
    }
}
