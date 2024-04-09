package org.fengmaster.agricola.base;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Util {

    public static Map<ResourceType,Integer> createResourceMap(ResourceType resourceType,Integer size){
        Map<ResourceType,Integer> resourceMap1=new HashMap<>();
        resourceMap1.put(resourceType,size);
        return resourceMap1;
    }

    public static void addResource(Map<ResourceType,Integer> resourceMap1,Map<ResourceType,Integer> addTo){

        resourceMap1.forEach(new BiConsumer<ResourceType, Integer>() {
            @Override
            public void accept(ResourceType resourceType, Integer integer) {
                addTo.put(resourceType,addTo.getOrDefault(resourceType,0)+integer);
            }
        });

    }

    public static void subResource(Map<ResourceType,Integer> resourceMap1,Map<ResourceType,Integer> subFrom){

        resourceMap1.forEach(new BiConsumer<ResourceType, Integer>() {
            @Override
            public void accept(ResourceType resourceType, Integer integer) {
                subFrom.put(resourceType,subFrom.getOrDefault(resourceType,0)-integer);
            }
        });

    }
}
