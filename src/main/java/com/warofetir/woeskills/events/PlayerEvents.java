package com.warofetir.woeskills.events;

import com.warofetir.woeskills.Main;
import com.warofetir.woeskills.playerdata.PlayerData;
import com.warofetir.woeskills.playerdata.WoEPlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerEvents implements Listener {

    private final Main main;

    public PlayerEvents(Main main){
        this.main = main;
        Bukkit.getPluginManager().registerEvents(this, main);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        PlayerData playerData = new PlayerData(main, player);
        WoEPlayer woePlayer = new WoEPlayer(main, player);
        if (!player.hasPlayedBefore() || !main.getPlayerDataManager().getFile().getKeys(false).contains(player.getUniqueId().toString())){
            playerData.generatePlayerData(main.getPlayerDataManager().getFile());
        }
        woePlayer.load();
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        WoEPlayer woePlayer = new WoEPlayer(main, player);
        woePlayer.savePlayerData();
    }
}

