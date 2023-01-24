package io.github.acardon1.medievalsimulation;

import org.bukkit.plugin.java.JavaPlugin;
import io.github.acardon1.medievalsimulation.CommandExecutors.StartGame;

public final class MedievalSimulation extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        getServer().getPluginCommand("start-sim").setExecutor(new StartGame());
        //getServer().getPluginManager().registerEvents(new LISTENER, this);
        //getServer().getP
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }
}
