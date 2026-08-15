package interface_;

public class Phone implements UsbInterface{
    @Override
    public void work() {
        System.out.println("开始工作");
    }
}
