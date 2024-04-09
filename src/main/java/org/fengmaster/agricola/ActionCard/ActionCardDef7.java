package org.fengmaster.agricola.ActionCard;

import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;
public class ActionCardDef7 extends ResourceActionCard {

    public ActionCardDef7() {
        super(Util.createResourceMap(ResourceType.FOOD,2), false);
    }

    @Override
    public String getName() {
        return "临时工";
    }

    @Override
    public String getDesc() {
        return "获得2食物";
    }
}
