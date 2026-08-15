public class Enumer {
    public static void main(String[] args){
        Week []wr= Week.values();
        for(Week we:wr){
            System.out.println(we);
        }
        System.out.println(Week.Mondy);
        Week.yt.ty();
    }
}


enum Week implements A{

    yt,Mondy("星期一"),TUSDY("星期二");

    private String name;

    Week(String name) {
        this.name = name;
    }
    Week() {
        ;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void ty() {
        System.out.println("ha");
    }
}
@SuppressWarnings({"all"})
interface A{
    public void ty();
}
//enum Season{
//
//    SPRING("春天","温暖"),SPR("冬天","冷");
//    private String name;
//    private String desc;
////    public  static Season SPRING=new Season("春天","温暖");
////    public static Season SPRIN=new Season("秋天","凉");
////    public static Season SPRI=new Season("夏天","热");
////    public static Season SPR=new Season("冬天","冷");
//
//    private Season(String name, String desc) {
//        this.name = name;
//        this.desc = desc;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    @Override
//    public String toString() {
//        return "Season{" +
//                "name='" + name + '\'' +
//                ", desc='" + desc + '\'' +
//                '}';
//    }
//}
