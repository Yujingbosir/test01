package shixi_IO;
//IO_test01
//冒泡排序
/*
public class IO_test01{
    public static void main(String[] args){
        int r[]={1,3,2,-2,4,7,12,5};
        for(int i=0;i<r.length;i++){
            for(int j=0;j<r.length-i-1;j++){
                int temp=0;
                if(r[j]>r[j+1]){
                    temp=r[j];
                    r[j]=r[j+1];
                    r[j+1]=temp;
                }
            }
        }
        for(int i=0;i<r.length;i++){
            System.out.println(r[i]);
        }
    }
}*/
public class IO_test01 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.start();
        dog d=new dog();
        d.say();
        Son s=new Son();


    }
}
class Cat extends Thread{
    @Override
    public void run() {

        System.out.println("程序进行");
    }
}
class dog{
    public void say(){
        System.out.println("旺");
    }
}


class Father{
    public Father(String name){
        System.out.println("父类有参构造");
        {
            System.out.println("666");
        }
    }
    {
        System.out.println("nishi");
    }
}

class Son extends Father{
    public Son(){
        //手动调用父类的有参构造，必须写在第一行
        super("父名字");
        System.out.println("子类构造器");
    }
}