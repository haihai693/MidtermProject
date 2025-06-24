public abstract class Character implements Creature {
    String name;
    int hp;
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
