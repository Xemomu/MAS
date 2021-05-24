package com.xemo.MP4.bag;

import java.util.HashSet;
import java.util.Set;

public class Player {
    private long id;
    private String nickname;
    private Set<PlayerRaid> playerRaids = new HashSet<>();

    public Player(long id, String nickname) {
        this.id = id;
        setNickname(nickname);
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

    public Set<PlayerRaid> getPlayerRaids() {
        return playerRaids;
    }

    public void setPlayerRaids(Set<PlayerRaid> playerRaids) {
        this.playerRaids = playerRaids;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        String info = "Player: " +
                "id=" + getId() +
                ", nickname='" + getNickname() + ", raids: ";

        for (PlayerRaid playerRaid : playerRaids) {
            info += playerRaid.getStartDate() + " ; ";
        }

        return info;
    }
}
