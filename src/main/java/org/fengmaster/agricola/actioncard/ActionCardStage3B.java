package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardStage3B extends ResourceActionCard {

    public ActionCardStage3B() {
        super(Util.createResourceMap(ResourceType.VEGETABLES,1), true);
    }

    @Override
    public String getBaseName() {
        return "蔬菜种子";
    }

    @Override
    public String getDesc() {
        return "获得1蔬菜";
    }
}
