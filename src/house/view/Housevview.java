package house.view;
import house.domain.House;
import house.service.HouseService;

import javax.swing.text.Utilities;
import java.util.Scanner;
public class Housevview {
    Scanner myscanner=new Scanner(System.in);
    private boolean loop = true;
    private HouseService houseservice=new HouseService(3);
    public void delHouse(){
        System.out.println("======删除房屋======");
        System.out.println("轻松输入要删除的编号-1退出======");

    }
    public void addHouse(){
        System.out.println("======添加房屋======");
        System.out.println("姓名：");
        String name=myscanner.nextLine();
        System.out.println("电话：");
        String phone=myscanner.nextLine();
        System.out.println("地址：");
        String address=myscanner.nextLine();
        System.out.println("月租：");
        int rent=myscanner.nextInt();
        System.out.println("状态：");
        String state=myscanner.nextLine();
        House newhouse=new House(0,name,phone,address,rent,state);
        if(houseservice.add(newhouse)){
            System.out.println("添加房屋成功");
        }else{
            System.out.println("添加房屋失败");
        }
    }
    public void listHouse(){

        System.out.println("======房屋出租系统======");
        System.out.println("编号\t房屋 电话 地址 月租 状态(未出租/已出租)");
        House[] houses=houseservice.list();
        for(int i=0;i<houses.length;i++){
            if(houses[i]==null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("房屋列表现实完毕");
    }

    public void mainMenu() {
        do {
            System.out.println("======房屋出租系统======");
            System.out.println("\t1 新增房源");
            System.out.println("\t2 查找房源");
            System.out.println("\t3 删除房源");
            System.out.println("\t4 修改房源");
            System.out.println("\t5 房屋显示列表");
            System.out.println("\t6 退出");
            System.out.println("请输入你的选择(1-6)");
            char key=myscanner.next().charAt(0);
            switch(key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    System.out.println("查找");
                    break;
                case '3':
                    System.out.println("删除");
                    break;
                case '4':
                    System.out.println("修改");
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    System.out.println("退出");
                    loop=false;
                    break;

            }
        } while (loop);
    }
}
