package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.*;

public class ActionCardStage2B extends BaseActionCard {



    @Override
    public String getName() {
        return "房屋重建";
    }

    @Override
    public String getDesc() {
        return "翻新房屋(房间数量相等的砖(C)/石(S)+1芦苇)/+使用发展卡";
    }

    @Override
    public boolean done(Player player, String input) {
        return true;
    }

    @Override
    public boolean undo(Player player) {
        return true;
    }

    @Override
    public void innerNextRound(int nextRound) {

    }
}
