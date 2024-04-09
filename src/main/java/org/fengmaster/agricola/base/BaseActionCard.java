package org.fengmaster.agricola.base;

public abstract class BaseActionCard {

    public abstract String getName();

    public abstract String getDesc();


    /**
     * @param player
     * @param input 格式类似于  3G 8Y
     * @return
     */
    public abstract boolean done(Player player,String input);

    public abstract boolean undo(Player player);


    public abstract void nextRound(int nextRound);

}
