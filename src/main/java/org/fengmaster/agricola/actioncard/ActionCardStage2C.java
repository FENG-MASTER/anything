package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.*;

public class ActionCardStage2C extends ResourceActionCard {


    public ActionCardStage2C() {
        super(Util.createResourceMap(ResourceType.PERSON,1), false);
    }

    @Override
    public String getBaseName() {
        return "增加家庭成员";
    }

    @Override
    public String getDesc() {
        return "增加1家庭成员/+使用主发展卡";
    }


}
