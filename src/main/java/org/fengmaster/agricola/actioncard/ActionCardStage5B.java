package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.ResourceActionCard;
import org.fengmaster.agricola.base.ResourceType;
import org.fengmaster.agricola.base.Util;

public class ActionCardStage5B extends ResourceActionCard {

    public ActionCardStage5B() {
        super(Util.createResourceMap(ResourceType.PERSON,1), false);
    }

    @Override
    public String getBaseName() {
        return "紧急增加家庭成员";
    }

    @Override
    public String getDesc() {
        return "无视房屋需求增加1家庭成员";
    }
}
