package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.BaseActionCard;
import org.fengmaster.agricola.base.Player;
import org.fengmaster.agricola.base.ResourceType;

public class ActionCardDef3 extends BaseActionCard {



    @Override
    public String getName() {
        return "职业卡";
    }

    @Override
    public String getDesc() {
        return "打出1张职业卡(每个玩家的第一张免费,后续需要支付1食物)";
    }

    @Override
    public boolean done(Player player, String input) {
        if (player.getResource(ResourceType.OCCUPATION)==0){

        }else if(player.getResource(ResourceType.OCCUPATION)>1){
            player.subResource(ResourceType.FOOD,1);
            player.addResource(ResourceType.OCCUPATION,1);
        }

        return true;
    }

    @Override
    public boolean undo(Player player) {
        if (player.getResource(ResourceType.OCCUPATION)==0){
            return true;
        }
        player.addResource(ResourceType.FOOD,1);
        player.subResource(ResourceType.OCCUPATION,1);
        return true;
    }

    @Override
    public void innerNextRound(int nextRound) {

    }
}
