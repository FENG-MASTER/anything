package org.fengmaster.agricola.actioncard;

import org.fengmaster.agricola.base.*;

public class ActionCardStage1B extends BaseActionCard {



    @Override
    public String getName() {
        return "使用谷物";
    }

    @Override
    public String getDesc() {
        return "耕种小麦(G)或者蔬菜(V)/+烘培面包";
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
