package com.xemo.MP4.subset;

public class PlayerS {

    private String username;
    private int lvl;
    private boolean premiumAccount;
    private boolean leader;
    private RaidS raidS;

    public PlayerS(String username, int lvl, boolean premiumAccount) {
        setUsername(username);
        setLvl(lvl);
        setPremiumAccount(premiumAccount);
    }

    public void addToRaid(RaidS raidS) throws Exception {
        if (this.raidS != null) {
            raidS.removePlayer(this);
        }
        this.raidS = raidS;
        raidS.addPlayer(this);
    }

    public boolean isLeader() {
        return leader;
    }

    public void setLeader(boolean leader) {
        this.leader = leader;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public boolean isPremiumAccount() {
        return premiumAccount;
    }

    public void setPremiumAccount(boolean premiumAccount) {
        this.premiumAccount = premiumAccount;
    }

    public RaidS getRaidS() {
        return raidS;
    }

    public void setRaidS(RaidS raidS) {
        this.raidS = raidS;
    }
}
