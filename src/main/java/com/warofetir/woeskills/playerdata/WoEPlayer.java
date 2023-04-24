package com.warofetir.woeskills.playerdata;

import com.warofetir.woeskills.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class WoEPlayer{
    
    private final Main main;
    
    private final Player player;
    
    private final FileConfiguration dataFile;
    private String id;
    private int farming;
    private int fishing;
    private int mining;
    private int woodcutting;
    private int smelting;
    private int enchanting;
    private int swords;
    private int bows;
    private int axes;
    private int unarmed;
    private int endurance;
    private int alchemy;
    private int farming_exp;
    private int fishing_exp;
    private int mining_exp;
    private int woodcutting_exp;
    private int smelting_exp;
    private int enchanting_exp;
    private int swords_exp;
    private int bows_exp;
    private int axes_exp;
    private int unarmed_exp;
    private int endurance_exp;
    private int alchemy_exp;

    private String jobName;
    private int jobLevel;
    private int jobExp;
    public WoEPlayer(Main main, Player player){
        this.main = main;
        this.player = player;
        this.dataFile = main.getPlayerDataManager().getFile();
        this.id = player.getUniqueId().toString();
    }
    
    public void load(){
        loadLevels();
        loadExp();
    }
    
    private void loadLevels(){
        farming = dataFile.getInt(id + ".levels.farming.level");
        fishing = dataFile.getInt(id + ".levels.fishing.level");
        mining = dataFile.getInt(id + ".levels.mining.level");
        woodcutting = dataFile.getInt(id + ".levels.woodcutting.level");
        smelting = dataFile.getInt(id + ".levels.smelting.level");
        enchanting = dataFile.getInt(id + ".levels.enchanting.level");
        swords = dataFile.getInt(id + ".levels.swords.level");
        bows = dataFile.getInt(id + ".levels.bows.level");
        axes = dataFile.getInt(id + ".levels.axes.level");
        unarmed = dataFile.getInt(id + ".levels.unarmed.level");
        endurance = dataFile.getInt(id + ".levels.endurance.level");
        alchemy = dataFile.getInt(id + ".levels.alchemy.level");
        jobName = dataFile.getString(id + ".jobs.job.name");
        jobLevel = dataFile.getInt(id + ".jobs.job.level");
    }
    
    private void loadExp(){
        farming_exp = dataFile.getInt(id + ".levels.farming.xp");
        fishing_exp = dataFile.getInt(id + ".levels.fishing.xp");
        mining_exp = dataFile.getInt(id + ".levels.mining.xp");
        woodcutting_exp = dataFile.getInt(id + ".levels.woodcutting.xp");
        smelting_exp = dataFile.getInt(id + ".levels.smelting.xp");
        enchanting_exp = dataFile.getInt(id + ".levels.enchanting.xp");
        swords_exp = dataFile.getInt(id + ".levels.swords.xp");
        bows_exp = dataFile.getInt(id + ".levels.bows.xp");
        axes_exp = dataFile.getInt(id + ".levels.axes.xp");
        unarmed_exp = dataFile.getInt(id + ".levels.unarmed.xp");
        endurance_exp = dataFile.getInt(id + ".levels.endurance.xp");
        alchemy_exp = dataFile.getInt(id + ".levels.alchemy.xp");
        jobExp = dataFile.getInt(id + ".jobs.job.xp");
    }

    public Player getPlayer() {
        return player;
    }

    public int getFarming() {
        return farming;
    }

    public void setFarming(int farming) {
        this.farming = farming;
    }

    public int getFishing() {
        return fishing;
    }

    public void setFishing(int fishing) {
        this.fishing = fishing;
    }

    public int getMining() {
        return mining;
    }

    public void setMining(int mining) {
        this.mining = mining;
    }

    public int getWoodcutting() {
        return woodcutting;
    }

    public void setWoodcutting(int woodcutting) {
        this.woodcutting = woodcutting;
    }

    public int getSmelting() {
        return smelting;
    }

    public void setSmelting(int smelting) {
        this.smelting = smelting;
    }

    public int getEnchanting() {
        return enchanting;
    }

    public void setEnchanting(int enchanting) {
        this.enchanting = enchanting;
    }

    public int getSwords() {
        return swords;
    }

    public void setSwords(int swords) {
        this.swords = swords;
    }

    public int getBows() {
        return bows;
    }

    public void setBows(int bows) {
        this.bows = bows;
    }

    public int getAxes() {
        return axes;
    }

    public void setAxes(int axes) {
        this.axes = axes;
    }

    public int getUnarmed() {
        return unarmed;
    }

    public void setUnarmed(int unarmed) {
        this.unarmed = unarmed;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getAlchemy() {
        return alchemy;
    }

    public void setAlchemy(int alchemy) {
        this.alchemy = alchemy;
    }

    public int getFarming_exp() {
        return farming_exp;
    }

    public void setFarming_exp(int farming_exp) {
        this.farming_exp = farming_exp;
    }

    public int getFishing_exp() {
        return fishing_exp;
    }

    public void setFishing_exp(int fishing_exp) {
        this.fishing_exp = fishing_exp;
    }

    public int getMining_exp() {
        return mining_exp;
    }

    public void setMining_exp(int mining_exp) {
        this.mining_exp = mining_exp;
    }

    public int getWoodcutting_exp() {
        return woodcutting_exp;
    }

    public void setWoodcutting_exp(int woodcutting_exp) {
        this.woodcutting_exp = woodcutting_exp;
    }

    public int getSmelting_exp() {
        return smelting_exp;
    }

    public void setSmelting_exp(int smelting_exp) {
        this.smelting_exp = smelting_exp;
    }

    public int getEnchanting_exp() {
        return enchanting_exp;
    }

    public void setEnchanting_exp(int enchanting_exp) {
        this.enchanting_exp = enchanting_exp;
    }

    public int getSwords_exp() {
        return swords_exp;
    }

    public void setSwords_exp(int swords_exp) {
        this.swords_exp = swords_exp;
    }

    public int getBows_exp() {
        return bows_exp;
    }

    public void setBows_exp(int bows_exp) {
        this.bows_exp = bows_exp;
    }

    public int getAxes_exp() {
        return axes_exp;
    }

    public void setAxes_exp(int axes_exp) {
        this.axes_exp = axes_exp;
    }

    public int getUnarmed_exp() {
        return unarmed_exp;
    }

    public void setUnarmed_exp(int unarmed_exp) {
        this.unarmed_exp = unarmed_exp;
    }

    public int getEndurance_exp() {
        return endurance_exp;
    }

    public void setEndurance_exp(int endurance_exp) {
        this.endurance_exp = endurance_exp;
    }

    public int getAlchemy_exp() {
        return alchemy_exp;
    }

    public void setAlchemy_exp(int alchemy_exp) {
        this.alchemy_exp = alchemy_exp;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }

    public int getJobExp() {
        return jobExp;
    }

    public void setJobExp(int jobExp) {
        this.jobExp = jobExp;
    }

    public void savePlayerData(){
       dataFile.set(id + ".levels.farming.level", farming);
       dataFile.set(id + ".levels.farming.xp", farming_exp);
       dataFile.set(id + ".levels.fishing.level", fishing);
       dataFile.set(id + ".levels.fishing.xp", fishing_exp);
       dataFile.set(id + ".levels.mining.level", mining);
       dataFile.set(id + ".levels.mining.xp", mining_exp);
       dataFile.set(id + ".levels.woodcutting.level", woodcutting);
       dataFile.set(id + ".levels.woodcutting.xp", woodcutting_exp);
       dataFile.set(id + ".levels.smelting.level", smelting);
       dataFile.set(id + ".levels.smelting.xp", smelting_exp);
       dataFile.set(id + ".levels.enchanting.level", enchanting);
       dataFile.set(id + ".levels.enchanting.xp", enchanting_exp);
       dataFile.set(id + ".levels.swords.level", swords);
       dataFile.set(id + ".levels.swords.xp", swords_exp);
       dataFile.set(id + ".levels.bows.level", bows);
       dataFile.set(id + ".levels.bows.xp", bows_exp);
       dataFile.set(id + ".levels.axes.level", axes);
       dataFile.set(id + ".levels.axes.xp", axes_exp);
       dataFile.set(id + ".levels.unarmed.level", unarmed);
       dataFile.set(id + ".levels.unarmed.xp", unarmed_exp);
       dataFile.set(id + ".levels.endurance.level", endurance);
       dataFile.set(id + ".levels.endurance.xp", endurance_exp);
       dataFile.set(id + ".levels.alchemy.level", alchemy);
       dataFile.set(id + ".levels.alchemy.xp", alchemy_exp);
       dataFile.set(id + ".jobs.job.name", jobName);
       dataFile.set(id + "jobs.job.level", jobLevel);
       dataFile.set(id + "jobs.job.xp", jobExp);
       main.getPlayerDataManager().saveFile();
    }


}
