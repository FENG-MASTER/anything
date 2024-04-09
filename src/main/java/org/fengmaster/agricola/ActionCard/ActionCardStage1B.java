package org.fengmaster.agricola.ActionCard;

import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardStage1B extends ResourceActionCard {

    public ActionCardStage1B() {
        super(Util.createResourceMap(ResourceType.SHEEP,1), true);
    }

    @Override
    public String getName() {
        return "使用谷物";
    }

    @Override
    public String getDesc() {
        return "耕种小麦或者蔬菜/+烘培面包";
    }
}
