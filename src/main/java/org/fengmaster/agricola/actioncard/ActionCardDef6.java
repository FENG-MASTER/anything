package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardDef6 extends ResourceActionCard {

    public ActionCardDef6() {
        super(Util.createResourceMap(ResourceType.FIELD,1), false);
    }

    @Override
    public String getBaseName() {
        return "犁地";
    }



    @Override
    public String getDesc() {
        return "开垦1个田地";
    }
}
