package org.fengmaster.agricola.base;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.RandomUtil;

import java.util.List;
import java.util.Random;

public class Ai {


    private static int[][] stageIndex = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14}, {15, 16, 17},
            {18, 19},
            {20, 21},
            {22, 23},
            {24}
    };

    private int[][][] stageActionList={
            {{1,1},{1,0},{0,0},{0,1}},
            {{1,1,1},{1,1,2},{1,2,1},{2,1,1}},
            {{1,1,1,2},{1,1,2,3},{1,2,3,1},{2,3,1,1},{3,1,1,1}},
            {{1,1,1,2,3},{1,1,2,3,4},{1,2,3,4,1},{2,3,4,1,1},{3,4,1,1,1},{4,1,1,1,2}},
            {{1,1,1,2,3},{1,1,2,3,4},{1,2,3,4,5},{2,3,4,5,1},{3,4,5,1,1},{4,5,1,1,1},{5,1,1,1,4}},
            {{1,1,1,2,3},{1,1,2,3,4},{1,2,3,4,5},{2,3,4,5,1},{3,4,5,1,1},{4,5,1,1,1},{5,1,1,1,2}}
    };




    public int nextActionCard(Player ai,int round, int stage, List<BaseActionCard> actionCards) {

        int[][] actionList = stageActionList[stage];

        //这里的action 比如 1 2  意思是随机一个1阶段动作 然后随机一个2阶段动作
        int[] action = RandomUtil.randomEle(actionList);
        for (int i : action) {


                int[] stageIndex = Ai.stageIndex[i];
                int[] shuffle = ArrayUtil.shuffle(stageIndex);

                for (int cardIndex : shuffle) {
                    if (cardIndex>=actionCards.size()){
                        //还没翻到那个卡
                        continue;
                    }

                    if ( actionCards.get(cardIndex).canUse(ai)){
                        //当前阶段的这个动作可以ai占用
                        return cardIndex;
                    }
                }

                if (i==0){
                    throw new RuntimeException("基础动作都占满了,不太可能");
                }


                //当前阶段动作都被占用了,现在去基础动作里找

                stageIndex = Ai.stageIndex[0];
                shuffle = ArrayUtil.shuffle(stageIndex);

                for (int cardIndex : shuffle) {
                    if ( actionCards.get(cardIndex).canUse(ai)){
                        return cardIndex;
                    }
                }

            if (i==0){
                throw new RuntimeException("基础动作都占满了,不太可能");
            }

        }

        return -1;

    }

}
