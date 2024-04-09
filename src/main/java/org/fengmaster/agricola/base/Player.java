package org.fengmaster.agricola.base;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Player {

    private Map<ResourceType,Integer> resourceMap=new HashMap<>();
    {
        resourceMap.put(ResourceType.WOOD,0);
        resourceMap.put(ResourceType.CLAY,0);
        resourceMap.put(ResourceType.STONE,0);
        resourceMap.put(ResourceType.SHEEP,0);
        resourceMap.put(ResourceType.WILD_BOAR,0);
        resourceMap.put(ResourceType.CATTLE,0);
        resourceMap.put(ResourceType.REED,0);
        resourceMap.put(ResourceType.GRAIN,0);
        resourceMap.put(ResourceType.FIELD,0);
        resourceMap.put(ResourceType.VEGETABLES,0);
    }

    public int getResource(ResourceType resourceType){
       return resourceMap.get(resourceType);
    }

    public void addResource(ResourceType resourceType,int num){
        resourceMap.put(resourceType,resourceMap.getOrDefault(resourceType,0)+num);
    }


    public void subResource(ResourceType resourceType,int num){
        resourceMap.put(resourceType,resourceMap.getOrDefault(resourceType,0)-num);
    }


}
