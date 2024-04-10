package org.fengmaster.agricola.actioncard;

import org.fengmaster.agricola.base.*;

public class ActionCardStage1D extends BaseActionCard {


    public ActionCardStage1D() {

    }

    @Override
    public String getName() {
        return "建造栅栏";
    }

    @Override
    public String getDesc() {
        return "1木(W)1栅栏";
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
