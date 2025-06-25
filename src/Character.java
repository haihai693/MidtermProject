public abstract class Character implements Creature {
    String name;
    int hp;
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public final boolean isAlive() {
        if (hp > 0) {
            return true;
        }else{
            return false;
        }
    }

    public void showStats(){
        System.out.println(this.name + ": HP " + this.hp);
    }
}
