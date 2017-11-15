package dev.tilegame.inventory.Items;

public class Dog_Food {
    int cost;
    int hunger_addition;

    public Dog_Food(){
        cost = 5;
        hunger_addition = 2;
    }

    public boolean sufficentFunds(int userMoney){
        if(userMoney >= cost)
            return true;
        return false;
    }

    public boolean isEdible(){
        return true;
    }

    public void quantity(){
        
    }
}
