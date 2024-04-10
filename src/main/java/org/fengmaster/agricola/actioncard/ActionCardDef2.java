package org.fengmaster.agricola.actioncard;

import org.fengmaster.agricola.base.*;

public class ActionCardDef2 extends BaseActionCard {



    @Override
    public String getName() {
        return "扩建房舍";
    }

    @Override
    public String getDesc() {
        return "扩建房屋/+建造畜舍 房间(W/C/S)=5(木/砖/石)+2芦苇 畜舍(s)=2木";
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
