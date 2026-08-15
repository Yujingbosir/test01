package testiusb;
import java.util.Scanner;

public class ttestyic {
    public static void main(String[] args) {
        Rey ry = new Rey();
        ry.checkInt(); // 启动
    }
}
//可不可以让try有一个方法体来判断是否为整数然后是的情况下直接报错。报错下调用catcah执行代码，
// 程序结束。然后不是的情况下try代码成立catch不执行，然后finally输出请一直输入直到为整数，
// 并再次调用try的代码来再次判断。构成循环
class Rey {
    Scanner sc = new Scanner(System.in);

    public void checkInt() {
        try {
            System.out.print("请输入：");
            String input = sc.next();

            // 如果是整数 → 抛异常
            if (isInteger(input)) {
                throw new Exception("是整数");
            }

        } catch (Exception e) {
            // 输入是整数，这里执行
            System.out.println("catch 执行：输入是整数，程序结束");
            return; // 真正结束方法
        }

        // 只有【不是整数】才会走到这里循环
        System.out.println("finally：请一直输入直到为整数\n");
        checkInt(); // 继续输入
    }

    // 判断是否为整数
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}



//package testiusb;
//        import java.util.Scanner;
///*
//    @wersion yu
//*/
//public class test04 {
//    public static void main(String[] args) {
//        Ry t=new Ry();
//        int result =t.getInt();
//        System.out.println("你输入的正确整数是：" + result);
//
//
//    }
//}
//class Ry { // 类名首字母大写
//
//    // 写一个方法：一直输入，直到输入整数才返回
//    public int getInt() {
//        Scanner myscanner=new Scanner(System.in);
//        while(true){
//            System.out.println("请输入整数：");
//            try {
//                int i=myscanner.nextInt();
//                return i;
//            } catch (Exception e) {
//                System.out.println("输入不是整数，请重新输入！");
//                myscanner.nextLine();
//            }
//        }
//    }
//}

// 包名：测试USB
//package testiusb;
//
//// 导入键盘输入工具类
//        import java.util.Scanner;
//
///*
//    版本：yu
//*/
//// 主类
//public class test04 {
//    // 主方法（程序入口）
//    public static void main(String[] args) {
//        // 创建键盘输入对象
//        Scanner my = new Scanner(System.in);
//
//
//        // 无限循环
//        while(true){
//            // 接收用户输入的整数（年龄）
//            int i = my.nextInt();
//
//            // ============== 这里你写反了！==============
//            // 原代码：i<18&&i>80 永远不可能成立
//            // 正确逻辑：小于18 或者 大于80
//            if(i < 18 || i > 80){
//                // 手动抛出异常：年龄不合适
//                throw new Ry("年龄要适合");
//            }
//
//            // 如果年龄符合，输出这句话
//            System.out.println("您可以");
//
//            // 吸收换行符
//            my.nextLine();
//        }
//    }
//}
//
//// 自定义异常类 Ry，继承运行时异常
//class Ry extends RuntimeException {
//
//    // 构造方法：传入异常提示信息
//    public Ry(String message) {
//        super(message);
//
//    }
//}


//多种异常提取
//package testiusb;
//
//public class test04 {
//    // 主方法（程序入口）
//    public static void main(String[] args) {
//        try {
//            if(args.length!=2){
//                throw new ArrayIndexOutOfBoundsException();
//            }
//                int n1=Integer.parseInt(args[0]);
//            int n2=Integer.parseInt(args[1]);
//            double we=cal(n1,n2);
//            System.out.println("运算结果为"+we);
//        } catch (ArrayIndexOutOfBoundsException e) {//
//            System.out.println(e.getMessage());
//        } catch(NumberFormatException e){
//            System.out.println("参数格式不正确");
//        }catch(ArithmeticException e){
//            System.out.println("出现了除以0的");
//        }
//    }
//    public static double cal(int n1,int n2){
//        return n1/n2;
//    }
//}
//

//动态数组
/*5
package testiusb;
import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        int arr[] = {};
        Scanner myscanner = new Scanner(System.in);

        System.out.println("请输入数字，输入 -1 结束：");
        while (true) {
            int num = myscanner.nextInt();
            if (num == -1) {
                break;
            }

            int r[] = new int[arr.length + 1];

            for (int j = 0; j < arr.length; j++) {
                r[j] = arr[j];
            }

            r[arr.length] = num;

            arr = r;
        }
        System.out.println("\n你输入的所有数字是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 */