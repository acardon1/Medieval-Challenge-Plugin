package io.github.acardon1;

import io.github.acardon1.commandexecutors.MedievalTeams;
import io.github.acardon1.eventlisteners.PlayerLifeListener;
import org.bukkit.plugin.java.JavaPlugin;
public class MedievalChallengePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        //Plugin was enabled: implement startup + set up.
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerLifeListener(), this);
        getServer().getPluginCommand("createteams").setExecutor(new MedievalTeams());

    }

    @Override
    public void onDisable() {
        //Plugin was disabled: implement disabling features.
    }
}
