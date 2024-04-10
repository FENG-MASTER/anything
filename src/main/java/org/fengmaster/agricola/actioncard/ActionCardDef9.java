package org.fengmaster.agricola.actioncard;

import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardDef9 extends ResourceActionCard {

    public ActionCardDef9() {
        super(Util.createResourceMap(ResourceType.CLAY,1), true);
    }

    @Override
    public String getBaseName() {
        return "粘土坑";
    }

    @Override
    public String getDesc() {
        return "获得1粘土";
    }
}
