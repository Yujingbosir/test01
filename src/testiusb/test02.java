package testiusb;

public class test02 {
    public static void main(String[] args){
        waibu qqq=new waibu();
        qqq.we();
    }
}

interface AAA{
    public void cry();
}
//class w implements AAA{
//
//    @Override
//    public void cry() {
//        System.out.println("匿名内部类");
//    }
//}
class waibu {
    private int n1 = 0;
    public void we(){
        AAA a = new AAA() {

            @Override
            public void cry() {
                System.out.println("匿名内部类");
            }


        };
        a.cry();
        father b =new father("ty"){
            @Override
            public void test() {
                System.out.println("重写方法");
            }
        };
        System.out.println(b.getClass());
        b.test();
    }

}

class father{
    private String name;

    public father(String name) {
        this.name = name;
        System.out.println("姓名为"+name);
    }
    public void test(){

    }
}



//匿名内部类
interface bi{
    public void cty();
}
class zx{
    public static void main(String[] args){
        f1(new bi(){
            public void cty(){
                System.out.println("rt");
            }
        });
    }

    public static void f1(bi b){
        b.cty();
    }
}