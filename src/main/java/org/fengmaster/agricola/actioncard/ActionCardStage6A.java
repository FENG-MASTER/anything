package org.fengmaster.agricola.actioncard;


import org.fengmaster.agricola.base.*;

public class ActionCardStage6A extends BaseActionCard {


    @Override
    public String getName() {
        return "农场重建";
    }

    @Override
    public String getDesc() {
        return "翻新房屋/+建造栅栏(1木1栅栏)";
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
