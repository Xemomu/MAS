package com.xemo.MP4.subset;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RaidS {
    private String name;
    private String difficulty;
    private LocalDate startDate;
    private PlayerS leader;
    private List<PlayerS> players = new ArrayList<>();

    public RaidS(String name, String difficulty, LocalDate startDate) {
        this.name = name;
        this.difficulty = difficulty;
        this.startDate = startDate;
    }

    public void setLeader(PlayerS playerS) throws Exception {
        if (playerS.getRaidS() != this) {
            throw new Exception(String.format("Player (%s) is not in this raid (%s) !", playerS.getUsername(), this.name));
        }
        if (playerS == leader) {
            throw new Exception(String.format("Player (%s) is already a leader of this raid (%s) !", playerS.getUsername(), this.name));
        }
        if (leader != null) {
            leader = null;
        }
        leader = playerS;
        playerS.setLeader(true);
    }

    public void removeLeader() {
        leader.setLeader(false);
        leader = null;
    }

    public void addPlayer(PlayerS playerS) throws Exception {
        if (!players.contains(playerS)) {
            players.add(playerS);
            playerS.addToRaid(this);
        }
    }

    public void removePlayer(PlayerS playerS) throws Exception {
        if (!players.contains(playerS)) {
            throw new Exception(String.format("Player (%s) not found in the %s raid!", playerS.getUsername(), this.name));
        }
        if (playerS == leader) {
            playerS.setLeader(false);
            leader = null;
        }
        players.remove(playerS);
        playerS.setRaidS(null);
    }

    @Override
    public String toString() {
        if (this.getLeader() != null) {
            return "RaidS{" +
                    "name='" + this.getName() + '\'' +
                    ", leader=" + this.getLeader().getUsername() +
                    '}';
        } else {
            return "RaidS{" +
                    "name='" + this.getName() + '\'' +
                    ", !No leader!" +
                    '}';
        }
    }

    public PlayerS getLeader() {
        return leader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public List<PlayerS> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerS> players) {
        this.players = players;
    }
}
