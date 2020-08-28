public abstract class InGameCharacter {

    int health;
    int level;
    int strength;
    int perception;
    int endurance;
    int charisma;
    int intelligence;
    int agility;
    int luck;
    double activeStrength;
    double armor;

    InGameCharacter(){
        /*
        this.health = 100;
        this.level = 1;
        this.strength = 5;
        this.perception = 5;
        this.endurance = 5;
        this.charisma = 5;
        this.intelligence = 5;
        this.agility = 5;
        this.luck = 5;
        this.activeStrength = 1.0;
        this.armor = 1.0;

         */
    }

    InGameCharacter(int myHealth, int myLevel, int myStrength, int myPerception, int myEndurance, int myCharisma, int myIntelligence, int myAgility, int myLuck, double myActiveStrength, double myArmor){
        /*
        this.health = myHealth;
        this.level = myLevel;
        this.strength = myStrength;
        this.perception = myPerception;
        this.endurance = myEndurance;
        this.charisma = myCharisma;
        this.intelligence = myIntelligence;
        this.agility = myAgility;
        this.luck = myLuck;
        this.activeStrength = myActiveStrength;
        this.armor = myArmor;

         */
    }

    public abstract void healUp(String healType);

        /* Here we can heal our character based on the kind of healing spell or potion they used

         */

    public abstract int useAttack(String attackType);

        /* Here we can make our player attack and drain stamina/action points, depending on the attack

        This method will return the base damage that the attack deals
         */


    public abstract int takeDamage(int damageReceived);

        /* Here we calculate damage taken based on many factors (Strength, vulnerability, active debuffs, etc...)

        We return an int value representing the total damage taken after calculating. This might come in handy.

         */



}
