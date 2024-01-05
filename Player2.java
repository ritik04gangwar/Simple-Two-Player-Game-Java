package TwoPlayerGameJava;

public class Player2 extends Player1{
    private int health;
    private boolean armour;

    public Player2(String name,String weapon,int health,boolean armour){
        super(name, weapon, health);
        this.health=health;
        this.armour=armour;
    }

    @Override
    public void damageByGun1() {
        if(armour){
            this.health-=20;
            if(this.health<=0){
                this.health=0;
                System.out.println("Armour is on. Got hit by Gun1. Health is reduced by 20. "+"New Health is "+this.health+" of "+getName());
            }
        }else{
            this.health-=30;
            if(this.health<=0){
                this.health=0;
                System.out.println("Armour is off. Got hit by Gun1. Health is reduced by 30. "+"New Health is "+this.health+" of "+getName());
            }
        }
        if(this.health==0){
            System.out.println(getName()+" is dead. ");
        }
    }

    @Override
    public void damageByGun2() {
        if(armour){
            this.health-=40;
            if(this.health<=0){
                this.health=0;
                System.out.println("Armour is on. Got hit by Gun2. Health is reduced by 40. "+"New Health is "+this.health+" of "+getName());
            }
        }else{
            this.health-=50;
            if(this.health<=0){
                this.health=0;
                System.out.println("Armour is off. Got hit by Gun2. Health is reduced by 50. "+"New Health is "+this.health+" of "+getName());
            }
        }
        if(this.health==0){
            System.out.println(getName()+" is dead. ");
        }
    }
}
