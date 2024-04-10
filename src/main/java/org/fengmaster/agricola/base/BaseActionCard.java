package org.fengmaster.agricola.base;

public abstract class BaseActionCard {

    private boolean canUse=true;

    protected abstract String getName();

    public abstract String getDesc();

    public  String getDisplayName(){
        if (!canUse){
            return " [X] "+getName();
        }else {
            return getName();
        }


    }



    /**
     * @param player
     * @param input 格式类似于  3G 8Y
     * @return
     */
    public abstract boolean done(Player player,String input);

    public boolean playerUse(Player player,String input){
        boolean done = done(player, input);
        if (done){
            canUse=false;
            System.out.println(player.getName()+" 执行了 " +getDisplayName());
        }
        return done;
    }

    public boolean playerUndo(Player player,String input){
        boolean undo = undo(player);
        if (undo){
            canUse=true;
        }
        return undo;
    }

    public abstract boolean undo(Player player);


    public  void nextRound(int nextRound){
        canUse=true;
        innerNextRound(nextRound);
    }

    public abstract void innerNextRound(int nextRound);

    public  boolean canUse(Player player){
        return canUse;
    };

}
