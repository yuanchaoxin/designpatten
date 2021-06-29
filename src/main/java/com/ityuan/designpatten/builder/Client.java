package com.ityuan.designpatten.builder;

/**
 * @ClassName Client
 * @Package com.ityuan.designpatten.builder
 * @Author yuanchaoxin
 * @Date 2021/6/29
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        // 盖改普通楼
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();

        // 盖高楼
        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);
        House highHouse = houseDirector.constructHouse();

    }
}
