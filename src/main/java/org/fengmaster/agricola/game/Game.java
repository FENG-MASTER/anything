package org.fengmaster.agricola.game;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.util.ArrayUtil;
import lombok.Getter;
import org.fengmaster.agricola.actioncard.*;
import org.fengmaster.agricola.base.Ai;
import org.fengmaster.agricola.base.BaseActionCard;
import org.fengmaster.agricola.base.Player;
import org.fengmaster.agricola.base.ResourceType;

import java.util.*;
import java.util.function.Consumer;

public class Game {

    @Getter
    private int round;
    @Getter
    private int stage;

    @Getter
    public List<BaseActionCard> availableActionCards;


    public List<BaseActionCard> roundActionCards=new ArrayList<>();

    public Player player = new Player(false,"玩家");

    public Player   aiPlayer=new Player(true,"电脑AI");

    private Queue<Player> playerQueue;

    private Ai ai=new Ai();



    public void start(){
        round=0;
        stage=1;
        playerQueue=new ArrayDeque<>();
        availableActionCards=new ArrayList<>();
        availableActionCards.add(new ResourceAdjustActionCard());
        availableActionCards.add(new ActionCardDef1());
        availableActionCards.add(new ActionCardDef2());
        availableActionCards.add(new ActionCardDef3());
        availableActionCards.add(new ActionCardDef4());
        availableActionCards.add(new ActionCardDef5());
        availableActionCards.add(new ActionCardDef6());
        availableActionCards.add(new ActionCardDef7());
        availableActionCards.add(new ActionCardDef8());
        availableActionCards.add(new ActionCardDef9());
        availableActionCards.add(new ActionCardDef10());

        List<BaseActionCard> stage1=ListUtil.toList(ArrayUtil.shuffle(new BaseActionCard[]{new ActionCardStage1A(),new ActionCardStage1B(),new ActionCardStage1C(),new ActionCardStage1D()}));
        roundActionCards.addAll(stage1);

        List<BaseActionCard> stage2=ListUtil.toList(ArrayUtil.shuffle(new BaseActionCard[]{new ActionCardStage2A(),new ActionCardStage2B(),new ActionCardStage2A()}));
        roundActionCards.addAll(stage2);



        List<BaseActionCard> stage3=ListUtil.toList(ArrayUtil.shuffle(new BaseActionCard[]{new ActionCardStage3A(),new ActionCardStage3B(),new ActionCardStage1C()}));
        roundActionCards.addAll(stage3);



        List<BaseActionCard> stage4=ListUtil.toList(ArrayUtil.shuffle(new BaseActionCard[]{new ActionCardStage4A(),new ActionCardStage4B()}));
        roundActionCards.addAll(stage4);


        List<BaseActionCard> stage5=ListUtil.toList(ArrayUtil.shuffle(new BaseActionCard[]{new ActionCardStage5A(),new ActionCardStage5B()}));
        roundActionCards.addAll(stage5);



        List<BaseActionCard> stage6=ListUtil.toList(ArrayUtil.shuffle(new BaseActionCard[]{new ActionCardStage6A()}));
        roundActionCards.addAll(stage6);


        playerQueue.add(player);

        playerQueue.add(aiPlayer);

        nextRound();

    }

    public void nextRound(){
        round++;
        if (round==5){
            stage=2;
        }else if (round==8){
            stage=3;
        }else if (round==10){
            stage=4;
        }else if (round==12){
            stage=5;
        }else if (round==14){
            stage=6;
        }

        availableActionCards.add(roundActionCards.get(round-1));
        availableActionCards.stream().forEach(baseActionCard -> baseActionCard.nextRound(round));
    }


    public String info(){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("农家乐");
        stringBuffer.append("当前回合数:").append(round);
        stringBuffer.append("当前阶段:").append(stage);
        stringBuffer.append("\n");
        stringBuffer.append("您的资源如下:");
        for (Map.Entry<ResourceType, Integer> resourceTypeIntegerEntry : player.getResourceMap().entrySet()) {
            stringBuffer.append(resourceTypeIntegerEntry.getKey().getName()).append("(").append(resourceTypeIntegerEntry.getKey().getSymbol()).append("):").append(resourceTypeIntegerEntry.getValue()).append(" | ");
        }
        stringBuffer.append("\n");
        stringBuffer.append("可选行动如下:");
        stringBuffer.append("\n");
        for (int i = 0; i < availableActionCards.size(); i++) {
            stringBuffer.append(i).append(".").append(availableActionCards.get(i).getDisplayName()).append(":").append(availableActionCards.get(i).getDesc());
            stringBuffer.append("\n");
        }


        return stringBuffer.toString();
    }

    public void aiNext(){
        int cardIndex = ai.nextActionCard(aiPlayer, round, stage, availableActionCards);
        playerAction(aiPlayer,cardIndex,null);
    }


    public void playerAction(Player player,int actionCardIndex,String input){
        availableActionCards.get(actionCardIndex).playerUse(player,input);

    }

    public void playerAction(int actionCardIndex,String input){
        availableActionCards.get(actionCardIndex).playerUse(player,input);

    }
}
