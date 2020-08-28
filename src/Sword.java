public class Sword extends Weapon{

    private String swordType;

    Sword(){
        this.weaponType = "sword";
        this.damageOutput = 5;
        this.swordType = "wood";

    }
    Sword(int mySwordDamage, String mySwordType){



    }

    @Override
    public int dealDamage(int characterStrength, int characterLuck, double characterActiveStrength) {

        double damageDealt =((double)(this.damageOutput + characterStrength)) * characterActiveStrength ;

        if(characterLuck < 5){
            /*Roll dice, probability of miss/lower damage depending on unluckiness

             */
        }
        else if(characterLuck > 5){

            /* Roll dice, probability of crit depending on luckiness

             */
        }


        return (int) damageDealt;
    }
}
