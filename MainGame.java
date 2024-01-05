package TwoPlayerGameJava;
import java.util.*;

public class MainGame {
    public static void main(String[] args) {
        Player1 You=new Player1("Ritik","Trident",100);
        Player2 CPU=new Player2("Computer","Sword",100,true);
        double turn=Math.random();
        double rand=Math.random();

        while(You.getHealth()>0 && CPU.getHealth()>0){
            if(turn%2==0){
                if(rand%3==0) You.damageByGun1();
                else You.damageByGun2();
                if(rand%2==0) {
                    CPU.heal();
                }
            }else{
                if(rand%3==0)CPU.damageByGun1();
                else CPU.damageByGun2();
                if(rand%2==0){
                    You.heal();
                }
            }
            turn++;
        }
    }
}
