package org.fengmaster.agricola.base;

import java.util.HashMap;
import java.util.Map;

public abstract class ResourceActionCard extends BaseActionCard {

    /**
     * 是否可以累积
     */
    private Boolean stockpiling;

    private Map<ResourceType,Integer> eachGetResources;


    private Map<ResourceType,Integer> allResources=new HashMap<>();;


    public ResourceActionCard(Map<ResourceType,Integer> resource,Boolean stockpiling){
        eachGetResources=resource;
        this.stockpiling=stockpiling;
    }


    @Override
    public boolean done(Player player,String input) {
        Util.addResource(allResources,player.getResourceMap());
        return true;
    }

    @Override
    public boolean undo(Player player) {
        Util.subResource(allResources,player.getResourceMap());
        return true;
    }

    @Override
    public void nextRound(int nextRound) {
        if (!stockpiling){
            allResources.clear();
        }
        Util.addResource(eachGetResources,allResources);
    }
}
