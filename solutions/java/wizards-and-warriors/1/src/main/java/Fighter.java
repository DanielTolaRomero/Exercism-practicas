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
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable()? 10 : 6;
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    
    

    
}


// TODO: define the Wizard class
class Wizard extends Fighter{

    boolean spellPreparated = false;

    @Override
    int getDamagePoints(Fighter fighter) {
        return spellPreparated ? 12 : 3;
    }

    @Override
    boolean isVulnerable() {
        return !spellPreparated;
    }

    void prepareSpell(){
        spellPreparated = !spellPreparated;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    
    
    
}
