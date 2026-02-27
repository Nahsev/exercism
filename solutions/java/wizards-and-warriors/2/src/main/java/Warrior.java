class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
    
    
    @Override
    boolean isVulnerable(){
        return false;
    }

    public String toString(){
       return "Fighter is a Warrior";
    }
    @Override
    int getDamagePoints(Fighter fighter){
        if (fighter.isVulnerable()){
            return 10;
        }else{
            return 6;
        }
    }
}
// TODO: define the Wizard class
class Wizard extends Fighter{
    boolean spell = false;
    public String toString(){
        return "Fighter is a Wizard";
    }
    @Override
    boolean isVulnerable() {
        return !spell;
    }


    public void prepareSpell(){
        spell = true;
    }
    @Override
    int getDamagePoints(Fighter fighter){
        return spell ? 12 : 3;
        
    }
}