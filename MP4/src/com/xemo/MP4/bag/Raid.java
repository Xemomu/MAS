package com.xemo.MP4.bag;

import java.util.HashSet;
import java.util.Set;

public class Raid {
    private long id;
    private String name;
    private Set<PlayerRaid> playerRaids = new HashSet<>();

    public Raid(long id, String name) {
        this.id = id;
        setName(name);
    }

    public void addPlayerRaid(PlayerRaid playerRaid) {
        if (!playerRaids.contains(playerRaid)) {
            playerRaids.add(playerRaid);
        }
    }

    public void removePlayerRaid(PlayerRaid playerRaid) {
        if (playerRaids.contains(playerRaid)) {
            playerRaids.remove(playerRaid);
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Raid{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
