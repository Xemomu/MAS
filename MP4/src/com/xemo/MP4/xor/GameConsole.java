//package com.xemo.MP4.xor;
//
//import java.time.LocalDate;
//
//public class GameConsole {
//    private LocalDate releaseDate;
//    private int hddSize;
//    private PlayStation ps;
//    private Xbox xb;
//
//    public GameConsole(LocalDate releaseDate, int hddSize) {
//        setReleaseDate(releaseDate);
//        setHddSize(hddSize);
//    }
//
//    public GameConsole(LocalDate releaseDate, int hddSize, PlayStation ps) {
//        this(releaseDate, hddSize);
//        setPs(ps);
//    }
//
//    public GameConsole(LocalDate releaseDate, int hddSize, Xbox xb) {
//        this(releaseDate, hddSize);
//        setXb(xb);
//    }
//
//    public void makeSonyConsole(PlayStation playStation) throws Exception {
//        if(this.xb != null) {
//            throw new Exception("The console is already a Xbox");
//        }
//        if (this.ps == playStation) return;
//
//        this.ps = playStation;
//    }
//
//    public void
//
//    public LocalDate getReleaseDate() {
//        return releaseDate;
//    }
//
//    public void setReleaseDate(LocalDate releaseDate) {
//        this.releaseDate = releaseDate;
//    }
//
//    public int getHddSize() {
//        return hddSize;
//    }
//
//    public void setHddSize(int hddSize) {
//        this.hddSize = hddSize;
//    }
//
//    public PlayStation getPs() {
//        return ps;
//    }
//
//    public void setPs(PlayStation ps) {
//        this.ps = ps;
//    }
//
//    public Xbox getXb() {
//        return xb;
//    }
//
//    public void setXb(Xbox xb) {
//        this.xb = xb;
//    }
//}
