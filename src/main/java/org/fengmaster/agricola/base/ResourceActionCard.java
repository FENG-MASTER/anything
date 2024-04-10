package org.fengmaster.agricola.base;

import java.util.HashMap;
import java.util.Map;

public abstract class ResourceActionCard extends BaseActionCard {

    /**
     * 是否可以累积
     */
    private Boolean stockpiling;

    private Map<ResourceType,Integer> eachGetResources;


    protected Map<ResourceType,Integer> allResources=new HashMap<>();

    public abstract String getBaseName();

    @Override
    public String getName() {
        String baseName="";
        if (stockpiling){
            baseName="+";
        }
        baseName+=getBaseName();

        if (allResources!=null&&!allResources.isEmpty()){

            int sum = allResources.entrySet().stream().mapToInt(Map.Entry::getValue).sum();
            if (sum!=0){
                return baseName+"["+sum+"]";
            }
        }
        return baseName;
    }

    public ResourceActionCard(Map<ResourceType,Integer> resource, Boolean stockpiling){
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
    public void innerNextRound(int nextRound) {
        if (!stockpiling){
            allResources.clear();
        }
        Util.addResource(eachGetResources,allResources);
    }
}
