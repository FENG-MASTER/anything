package org.fengmaster.agricola.ActionCard;


import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardDef1 extends ResourceActionCard {

    public ActionCardDef1() {
        super(Util.createResourceMap(ResourceType.FOOD,1), true);
    }

    @Override
    public String getName() {
        return "钓鱼";
    }

    @Override
    public String getDesc() {
        return "获得1食物";
    }
}
