package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

import java.util.Map;
import java.util.function.ToIntFunction;

public class ActionCardDef1 extends ResourceActionCard {

    public ActionCardDef1() {
        super(Util.createResourceMap(ResourceType.FOOD,1), true);
    }

    @Override
    public String getBaseName() {
        return "钓鱼";
    }



    @Override
    public String getDesc() {
        return "获得1食物";
    }
}
