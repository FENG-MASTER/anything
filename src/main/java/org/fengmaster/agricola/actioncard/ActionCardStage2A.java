package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardStage2A extends ResourceActionCard {

    public ActionCardStage2A() {
        super(Util.createResourceMap(ResourceType.STONE,1), true);
    }

    @Override
    public String getBaseName() {
        return "西部采石场";
    }

    @Override
    public String getDesc() {
        return "获得1石";
    }
}
