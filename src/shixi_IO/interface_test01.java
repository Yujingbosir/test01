package shixi_IO;

/*
    @version yu
*/
public class interface_test01 {
    // main主方法，程序入口
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.print(s.getName());
        Season d = Season.AUTUMN;
        System.out.
                print(d.getName()); //夏天
    }
}

enum Season{
    //枚举常量，调用构造器
    SPRING("春天",1),
    SUMMER("夏天",2),
    AUTUMN("秋天",3),
    WINTER("冬天",4);

    private String name;
    private int num;

    //枚举构造器，默认private，只能枚举内部调用
    private Season(String name,int num){
        this.name = name;
        this.num = num;
    }
    //getter
    public String getName() {
        return name;
    }
    public int getNum() {
        return num;
    }
}