package com.xemo.MP4.bag;

import java.time.LocalDate;

public class PlayerRaid {

    private Player player;
    private Raid raid;
    private LocalDate startDate;
    private String difficulty;

    public PlayerRaid(Player player, Raid raid, LocalDate startDate, String difficulty) {
        setPlayer(player);
        setRaid(raid);
        setStartDate(startDate);
        setDifficulty(difficulty);
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        if (this.player == player) return;
        if (this.player != null) {
            this.player.removePlayerRaid(this);
        }
        this.player = player;
        this.player.addPlayerRaid(this);
    }

    public Raid getRaid() {
        return raid;
    }

    public void setRaid(Raid raid) {
        if (this.raid == raid) return;
        if (this.raid != null) {
            this.raid.removePlayerRaid(this);
        }

        this.raid = raid;
        this.raid.addPlayerRaid(this);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }


//    public static void printPlayerRaids() {
//        for (PlayerRaid playerRaid : getPlayerRaids()) {
//            System.out.println(playerRaid.getRaid() + "->" + playerRaid.getPlayer() + ", StartDate-" + playerRaid.getStartDate() +
//                    ", Difficulty-" + playerRaid.getDifficulty() + "\n");
//        }
//    }
//
//    private static boolean checkForPlayer(Player player) {
//        for(PlayerRaid playerRaid : getPlayerRaids()) {
//            if(playerRaid.getPlayer() == player) {
//                return true;
//            }
//        }
//        return false;
//    }

//    private static boolean checkForRaid(Raid raid) {
//        for(PlayerRaid playerRaid : getPlayerRaids()) {
//            if(playerRaid.getRaid() == raid) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static List<PlayerRaid> findPlayer(Player player) {
//        List<PlayerRaid> playerRaids = new ArrayList<>();
//        for(PlayerRaid playerRaid : getPlayerRaids()) {
//            if (playerRaid.getPlayer() == player) {
//                playerRaids.add(playerRaid);
//            }
//        }
//        return playerRaids;
//    }
//
//    public static List<PlayerRaid> findRaid(Raid raid) {
//        List<PlayerRaid> playerRaids = new ArrayList<>();
//        for(PlayerRaid playerRaid : getPlayerRaids()) {
//            if (playerRaid.getRaid() == raid) {
//                playerRaids.add(playerRaid);
//            }
//        }
//        return playerRaids;
//    }
//
//    public static void addPlayerRaids(PlayerRaid playerRaid) {
//        playerRaids.add(playerRaid);
//    }
//
//    public void removePlayerRaid_Player(Player player) {
//        if(checkForPlayer(player)) {
//            for (PlayerRaid playerRaid : findPlayer(player)) {
//                playerRaids.remove(playerRaid);
//            }
//        }
//    }
//
//    public void removePlayerRaid_Raid(Raid raid) {
//        if(checkForRaid(raid)) {
//            for (PlayerRaid playerRaid : findRaid(raid)) {
//                playerRaids.remove(playerRaid);
//            }
//        }
//    }

    @Override
    public String toString() {
        return "PlayerRaid{" +
                "player=" + getPlayer() +
                ", raid=" + getRaid() +
                ", startDate=" + getStartDate() +
                ", difficulty='" + getDifficulty() + '\'' +
                "}\n";
    }
}
