package org.fengmaster.agricola.base;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public enum ResourceType {
    /**
     * 木头
     */
    WOOD("W","木"),
    /**
     * 砖
     */
    CLAY("C","砖"),
    /**
     * 石
     */
    STONE("S","石"),
    /**
     * 芦苇
     */
     REED("R","芦苇"),
    /**
     * 小麦
     */
     GRAIN("G","小麦"),
    /**
     * 蔬菜
     */
     VEGETABLES("V","蔬菜"),
    /**
     * 羊
     */
     SHEEP("SH","羊"),
    /**
     * 牛
     */
     CATTLE("C","牛"),
    /**
     * 野猪
     */
     WILD_BOAR("WB","猪"),
    /**
     * 食物
     */
     FOOD("F","食物"),
    /**
     * 家庭成员
     */
    PERSON("P","农民"),
    /**
     * 房间数
     */
    WOOD_ROOM("WR","木屋"),
    CLAY_ROOM("CR","砖屋"),
    STONE_ROOM("SR","石屋"),

    /**
     * 马厩
     */
    STABLE("ST","畜舍"),
    /**
     * 栅栏数
     */
    FENCE("FE","栅栏"),
    /**
     * 耕地
     */
    FIELD("D","耕地"),
    /**
     * 次要发展卡
     */
    MINOR_IMPROVEMENT("MI","次发"),
    /**
     * 主要发展卡
     */
    MAJOR_IMPROVEMENT("MA","主发"),
    /**
     * 职业卡
     */
    OCCUPATION("O","职业");

    @Getter
    private String symbol;


    @Getter
    private String name;

    ResourceType(String symbol,String name){
        this.symbol=symbol;
        this.name=name;
    }

    static Map<String,ResourceType> map=new HashMap<>();

    static {
        map.put(WOOD.getSymbol(),WOOD);
        map.put(CLAY.getSymbol(),CLAY);
        map.put(STONE.getSymbol(),STONE);
        map.put(GRAIN.getSymbol(),GRAIN);
        map.put(REED.getSymbol(),REED);
        map.put(SHEEP.getSymbol(),SHEEP);
        map.put(CATTLE.getSymbol(),CATTLE);
        map.put(WILD_BOAR.getSymbol(),WILD_BOAR);
        map.put(WOOD_ROOM.getSymbol(),WOOD_ROOM);
        map.put(CLAY_ROOM.getSymbol(),CLAY_ROOM);
        map.put(STONE_ROOM.getSymbol(),STONE_ROOM);
        map.put(VEGETABLES.getSymbol(),VEGETABLES);
        map.put(FOOD.getSymbol(),FOOD);
        map.put(PERSON.getSymbol(),PERSON);
        map.put(STABLE.getSymbol(),STABLE);
        map.put(FENCE.getSymbol(),FENCE);
        map.put(FIELD.getSymbol(),FIELD);
        map.put(MINOR_IMPROVEMENT.getSymbol(),MINOR_IMPROVEMENT);
        map.put(MAJOR_IMPROVEMENT.getSymbol(),MAJOR_IMPROVEMENT);
        map.put(OCCUPATION.getSymbol(),OCCUPATION);
    }

    public static ResourceType getBySymbol(String symbol){

            return map.get(symbol);

    }



}
