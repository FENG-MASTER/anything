package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardStage4A extends ResourceActionCard {

    public ActionCardStage4A() {
        super(Util.createResourceMap(ResourceType.CATTLE,1), true);
    }

    @Override
    public String getBaseName() {
        return "牛市场";
    }

    @Override
    public String getDesc() {
        return "获得1牛";
    }
}
