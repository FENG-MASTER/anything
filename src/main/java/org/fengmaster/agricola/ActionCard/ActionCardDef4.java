package org.fengmaster.agricola.ActionCard;

import cn.hutool.core.util.StrUtil;
import org.fengmaster.agricola.base.*;

public class ActionCardDef4 extends BaseActionCard {



    @Override
    public String getName() {
        return "广场";
    }

    @Override
    public String getDesc() {
        return "获得起始玩家/+打出1张次要发展卡(m)";
    }

    @Override
    public boolean done(Player player, String input) {
        if (StrUtil.isEmpty(input)){
            return true;
        }

        if (input.equals("1m")||input.equals("m")){
            player.addResource(ResourceType.OCCUPATION,1);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean undo(Player player) {
        player.subResource(ResourceType.OCCUPATION,1);
        return true;
    }

    @Override
    public void nextRound(int nextRound) {

    }
}
