package interface_;

public class Camera implements UsbInterface{
    @Override
    public void work() {
        System.out.println("相机开始工作");
    }
}
