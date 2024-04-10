package org.fengmaster.agricola.actioncard;

import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardDef8 extends ResourceActionCard {

    public ActionCardDef8() {
        super(Util.createResourceMap(ResourceType.WOOD,3), true);
    }

    @Override
    public String getBaseName() {
        return "森林";
    }



    @Override
    public String getDesc() {
        return "获得3木头";
    }
}
