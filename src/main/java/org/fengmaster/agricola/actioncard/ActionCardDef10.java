package org.fengmaster.agricola.actioncard;

import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardDef10 extends ResourceActionCard {

    public ActionCardDef10() {
        super(Util.createResourceMap(ResourceType.REED,1), true);
    }

    @Override
    public String getBaseName() {
        return "芦苇滩";
    }

    @Override
    public String getDesc() {
        return "获得1芦苇";
    }
}
