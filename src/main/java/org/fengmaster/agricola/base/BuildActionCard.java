package org.fengmaster.agricola.base;

import cn.hutool.core.util.StrUtil;

import java.util.HashMap;
import java.util.Map;

public abstract class BuildActionCard extends BaseActionCard{

    private Map<String,Map<ResourceType,Integer>> useResourceMap;

    private Map<ResourceType,Integer> lastUseResourceMap;

    public BuildActionCard(Map<String,Map<ResourceType,Integer>> useResourceMap){
        this.useResourceMap=useResourceMap;
    }

    @Override
    public boolean done(Player player,String input) {
        if (StrUtil.isEmpty(input)){
            return false;
        }
        lastUseResourceMap=new HashMap<>();
        String[] parts = input.split(" +");

        for (String part : parts) {
            // 确保每个部分符合数字+字母的规则
            if (part.matches("^\\d+[A-Za-z]$")) {
                int number = Integer.parseInt(part.substring(0, part.length() - 1)); // 提取数字部分
                String letter = part.substring(part.length() - 1); // 提取字母部分

                if (useResourceMap.containsKey(letter)){
                    //找到 对应需要支付的资源
                    for (int i = 0; i < number; i++) {
                        Util.addResource(useResourceMap.get(letter),lastUseResourceMap);
                        Util.subResource(useResourceMap.get(letter),player.getResourceMap());
                    }
                }else {

                }

            }else {

            }
        }

        return true;

    }

    @Override
    public boolean undo(Player player) {
        Util.addResource(lastUseResourceMap,player.getResourceMap());
        return true;
    }
}
