package com.xemo.MP4.atribute_custom;

public class Mob {

    private String name;
    private int xpDrop;
    public final static int MIN_XP_DROP = 200;
    public final static int MAX_XP_DROP = 5000;
    public final static int MAX_XP_DROP_CHANGE_PERCENTAGE = 20;
    private int lvl;
    private int hp;
    private final static int MAX_HP_AVR = 2000;

    public Mob(String name, int xpDrop, int lvl, int hp) throws Exception {
        setXpDrop(xpDrop);
        setName(name);
        setLvl(lvl);
        setHp(hp);
    }

    public int getXpDrop() {
        return xpDrop;
    }

    //dynamic
    public void setXpDrop(int xpDrop) throws Exception {
        if (this.xpDrop != 0) {
            if (xpDrop < this.xpDrop) {
                throw new Exception(String.format("The xp drop (%s) cannot be decreased!", this.xpDrop));
            }
            if (xpDrop > MAX_XP_DROP) {
                throw new Exception(String.format("The xp drop cannot exceed %s!", MAX_XP_DROP));
            }
            if (this.xpDrop * (1d + MAX_XP_DROP_CHANGE_PERCENTAGE / 100d) < xpDrop) {
                throw new Exception(String.format("The xp drop increase cannot be more than %s%%", MAX_XP_DROP_CHANGE_PERCENTAGE));
            }
            if (xpDrop < MIN_XP_DROP) {
                throw new Exception(String.format("The xp drop has to be at least %s", MIN_XP_DROP));
            }
        }
        this.xpDrop = xpDrop;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) throws Exception {
        if (this.hp != 0) {
            if (((hp * this.hp) / 2) > MAX_HP_AVR) {
                throw new Exception(String.format("The hp change cannot exceed the max (%s) for the average of the old (%s) and new hp (%s)!", MAX_HP_AVR, this.hp, hp));
            }
        }
        this.hp = hp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (this.name != null) {
            if (this.name.equals(name)) {
                throw new Exception(String.format("New name (%s) can't be the same as the old one (%s)", name, this.name));
            }
        }
        this.name = name;
    }
}
