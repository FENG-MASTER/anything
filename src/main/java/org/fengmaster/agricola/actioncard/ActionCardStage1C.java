package org.fengmaster.agricola.actioncard;

import org.fengmaster.agricola.base.*;

public class ActionCardStage1C extends BaseActionCard {



    @Override
    public String getName() {
        return "使用发展卡";
    }

    @Override
    public String getDesc() {
        return "使用主要发展卡/使用次要发展卡";
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
