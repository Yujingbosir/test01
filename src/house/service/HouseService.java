package house.service;

import house.domain.House;

public class HouseService {
    private House[] house;
    private int housenums=1;
    private int ageCounter=1;
    public HouseService(int size){
        house=new House[size];
        house[0]=new House(1,"jake","112","海淀区",200,"未出租");
    }
    public boolean add(House newHouse){
        if(housenums>=house.length){
            System.out.println("数组已满不能添加");
            return false;
        }
        house[housenums++]=newHouse;
        ageCounter++;
        newHouse.setAge(++ageCounter);
        return true;
    }
    public House[] list(){
        return house;
    }
}
