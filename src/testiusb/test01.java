package testiusb;
//接口的多态数组，动态绑定
//我们也知道接口的介入对象也可以体现接口的动态
public class test01 {
    public static void main(String[] args){
        A[] a=new A[2];
        a[0]=new Person();
        a[1]=new Camera();
        for(int i=0;i<a.length;i++){
            a[i].work();
            if(a[i] instanceof Person){
                ((Person) a[i]).call();
            }else{
                ((Camera) a[i]).take();
            }
        }

    }
}
interface A{
    void work();
}
class Person implements A{

    @Override
    public void work() {
        System.out.println("手机工作");
    }
    public void call(){
        System.out.println("手机打电话");
    }
}
class Camera implements A{

    @Override
    public void work() {
        System.out.println("相机工作");
    }
    public void take(){
        System.out.println("相机拍照");
    }
}