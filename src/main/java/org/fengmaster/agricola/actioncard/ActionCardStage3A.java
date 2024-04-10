package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardStage3A extends ResourceActionCard {

    public ActionCardStage3A() {
        super(Util.createResourceMap(ResourceType.WILD_BOAR,1), true);
    }

    @Override
    public String getBaseName() {
        return "野猪市场";
    }

    @Override
    public String getDesc() {
        return "获得1野猪";
    }
}
