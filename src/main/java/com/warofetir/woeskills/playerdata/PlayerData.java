package com.warofetir.woeskills.playerdata;

import com.warofetir.woeskills.Main;
import com.warofetir.woeskills.util.FileManager;
import org.bukkit.GameMode;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class PlayerData {

    private final Main main;
    private final Player player;
    private final FileManager playerData;

    public PlayerData(Main main, Player player){
        this.main = main;
        this.player = player;
        this.playerData = main.getPlayerDataManager();
    }

    public void loadPlayerData(){
    }

    public void initPlayerData(){
        if (!playerData.fileExists()){playerData.setupFile();}
        FileConfiguration file = playerData.getFile();
        generatePlayerData(file);
    }

    public void generatePlayerData(FileConfiguration file){
        String path = player.getUniqueId().toString();

        //Leveling
        file.createSection(path + ".levels.farming.level");
        file.createSection(path + ".levels.farming.xp");
        file.createSection(path + ".levels.fishing.level");
        file.createSection(path + ".levels.fishing.xp");
        file.createSection(path + ".levels.mining.level");
        file.createSection(path + ".levels.mining.xp");
        file.createSection(path + ".levels.woodcutting.level");
        file.createSection(path + ".levels.woodcutting.xp");
        file.createSection(path + ".levels.smelting.level");
        file.createSection(path + ".levels.smelting.xp");
        file.createSection(path + ".levels.enchanting.level");
        file.createSection(path + ".levels.enchanting.xp");
        file.createSection(path + ".levels.swords.level");
        file.createSection(path + ".levels.swords.xp");
        file.createSection(path + ".levels.bows.level");
        file.createSection(path + ".levels.bows.xp");
        file.createSection(path + ".levels.axes.level");
        file.createSection(path + ".levels.axes.xp");
        file.createSection(path + ".levels.unarmed.level");
        file.createSection(path + ".levels.unarmed.xp");
        file.createSection(path + ".levels.endurance.level");
        file.createSection(path + ".levels.endurance.xp");
        file.createSection(path + ".levels.alchemy.level");
        file.createSection(path + ".levels.alchemy.xp");
        file.createSection(path + ".jobs.job.name");
        file.createSection(path + ".jobs.job.level");
        file.createSection(path + ".jobs.job.xp");

        //Levels
        file.set(path + ".levels.farming.level", 1);
        file.set(path + ".levels.farming.xp", 0);
        file.set(path + ".levels.fishing.level", 1);
        file.set(path + ".levels.fishing.xp", 0);
        file.set(path + ".levels.mining.level", 1);
        file.set(path + ".levels.mining.xp", 0);
        file.set(path + ".levels.woodcutting.level", 1);
        file.set(path + ".levels.woodcutting.xp", 0);
        file.set(path + ".levels.smelting.level", 1);
        file.set(path + ".levels.smelting.xp", 0);
        file.set(path + ".levels.enchanting.level", 1);
        file.set(path + ".levels.enchanting.xp", 0);
        file.set(path + ".levels.swords.level", 1);
        file.set(path + ".levels.swords.xp", 0);
        file.set(path + ".levels.bows.level", 1);
        file.set(path + ".levels.bows.xp", 0);
        file.set(path + ".levels.axes.level", 1);
        file.set(path + ".levels.axes.xp", 0);
        file.set(path + ".levels.unarmed.level", 1);
        file.set(path + ".levels.unarmed.xp", 0);
        file.set(path + ".levels.endurance.level", 1);
        file.set(path + ".levels.endurance.xp", 0);
        file.set(path + ".levels.alchemy.level", 1);
        file.set(path + ".levels.alchemy.xp", 0);
        file.set(path + "jobs.job.name", "None");
        file.set(path + "jobs.job.level", 1);
        file.set(path + "jobs.job.xp" , 0);
        playerData.saveFile();
    }


}
