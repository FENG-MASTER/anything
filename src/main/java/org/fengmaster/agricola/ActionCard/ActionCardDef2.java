package org.fengmaster.agricola.ActionCard;

import cn.hutool.core.map.MapUtil;
import org.fengmaster.agricola.base.BuildActionCard;
import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

import java.util.AbstractMap;

public class ActionCardDef2 extends BuildActionCard {

    public ActionCardDef2() {
        super(MapUtil.ofEntries(
                new AbstractMap.SimpleEntry<>("W",Util.createResourceMap(ResourceType.WOOD,5)),
                new AbstractMap.SimpleEntry<>("C",Util.createResourceMap(ResourceType.CLAY,5)),
                new AbstractMap.SimpleEntry<>("S",Util.createResourceMap(ResourceType.STONE,5)),
                new AbstractMap.SimpleEntry<>("s",Util.createResourceMap(ResourceType.WOOD,2))
        ));
    }

    @Override
    public String getName() {
        return "扩建房舍";
    }

    @Override
    public String getDesc() {
        return "扩建房屋/+建造畜舍 房间(W/C/S)=5(木/砖/石)+2芦苇 畜舍(s)=2木";
    }

    @Override
    public void nextRound(int nextRound) {

    }
}
