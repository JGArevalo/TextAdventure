public abstract class Weapon extends Item {

    String weaponType;
    int damageOutput;
    int weaponSpeed;

    Weapon(){
        this.type = "weapon";
    }

    public abstract int dealDamage(int characterStrength, int characterLuck, double characterActiveStrength);


}
