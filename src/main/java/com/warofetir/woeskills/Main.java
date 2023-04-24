package com.warofetir.woeskills;

import com.warofetir.woeskills.events.PlayerEvents;
import com.warofetir.woeskills.util.FileManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    private Logger logger;

    //FileManagers
    private FileManager configManager;
    private FileManager langManager;
    private FileManager expFileManager;
    private FileManager playerDataManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger = Bukkit.getLogger();
        initializeFiles();
        registerEvents();
        registerCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void initializeFiles(){
        logger.info("[Skills] Initializing files");
        //Files
        configManager = new FileManager(this, "config.yml");
        langManager = new FileManager(this, "lang.yml");
        expFileManager = new FileManager(this, configManager.getFile().getString("leveling.exp_file"));
        playerDataManager = new FileManager(this, "player-data.yml");
        logger.info("[Skills] Files initialized!");
    }
    private void registerEvents(){
        logger.info("[Skills] Registering events");
        //Events
        new PlayerEvents(this);
        logger.info("[Skills] Events registering!");
    }
    private void registerCommands(){
        logger.info("[Skills] Registering commands");
        //Commands
        logger.info("[Skills] Commands registering!");
    }

    @Override
    public Logger getLogger() {
        return logger;
    }

    public FileManager getConfigManager() {
        return configManager;
    }

    public FileManager getLangManager() {
        return langManager;
    }

    public FileManager getExpFileManager() {
        return expFileManager;
    }

    public FileManager getPlayerDataManager() {
        return playerDataManager;
    }
}
