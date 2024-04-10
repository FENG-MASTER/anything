package org.fengmaster.agricola.actioncard;


import cn.hutool.core.util.StrUtil;
import org.fengmaster.agricola.base.*;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResourceAdjustActionCard extends BaseActionCard {

    private static Pattern numberPattern = Pattern.compile("[-+]?\\d+");;
    private static  Pattern letterPattern = Pattern.compile("[a-zA-Z]+");


    private Map<ResourceType,Integer> lastUseResourceMap;

    @Override
    public String getName() {
        return "调整资源";
    }

    @Override
    public String getDesc() {
        return "可反复使用 格式 1XX -2XX";
    }

    @Override
    public boolean done(Player player, String input) {

        input= StrUtil.strip(input," ");

        String[] parts = input.split(" ");
        lastUseResourceMap=new HashMap<>();

        for (String part : parts) {
            int size = 1;
            String s;
            // 使用正则表达式提取数字，考虑正负号

            Matcher numberMatcher = numberPattern.matcher(part);
            if (numberMatcher.find()) {
                size = Integer.parseInt(numberMatcher.group());
            }

            // 使用正则表达式提取字母

            Matcher letterMatcher = letterPattern.matcher(part);
            if (letterMatcher.find()) {
                s = letterMatcher.group();
            } else {
                return false;
            }


            Util.addResource(Util.createResourceMap(ResourceType.getBySymbol(s),size),player.getResourceMap());
            Util.addResource(Util.createResourceMap(ResourceType.getBySymbol(s),size),lastUseResourceMap);


        }

        return true;
    }

    @Override
    public boolean undo(Player player) {
        Util.addResource(lastUseResourceMap,player.getResourceMap());
        lastUseResourceMap.clear();
        return true;
    }

    @Override
    public void innerNextRound(int nextRound) {

    }

    @Override
    public boolean canUse(Player player) {
        return true;
    }
}
