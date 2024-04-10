package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardStage5A extends ResourceActionCard {

    public ActionCardStage5A() {
        super(Util.createResourceMap(ResourceType.FIELD,1), false);
    }

    @Override
    public String getBaseName() {
        return "耕作";
    }

    @Override
    public String getDesc() {
        return "开垦1个田地/+耕种小麦(G)或者蔬菜(V)";
    }
}
