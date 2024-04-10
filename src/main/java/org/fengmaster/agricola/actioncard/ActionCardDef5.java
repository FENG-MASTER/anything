package org.fengmaster.agricola.actioncard;

import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;
public class ActionCardDef5 extends ResourceActionCard {

    public ActionCardDef5() {
        super(Util.createResourceMap(ResourceType.GRAIN,1), false);
    }

    @Override
    public String getBaseName() {
        return "小麦";
    }



    @Override
    public String getDesc() {
        return "获得1小麦";
    }
}
