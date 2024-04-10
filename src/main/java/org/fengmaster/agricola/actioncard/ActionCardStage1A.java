package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardStage1A extends ResourceActionCard {

    public ActionCardStage1A() {
        super(Util.createResourceMap(ResourceType.SHEEP,1), true);
    }

    @Override
    public String getBaseName() {
        return "羊市场";
    }

    @Override
    public String getDesc() {
        return "获得1羊";
    }
}
