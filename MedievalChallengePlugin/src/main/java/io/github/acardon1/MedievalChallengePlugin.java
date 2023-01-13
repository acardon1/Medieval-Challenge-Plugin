package io.github.acardon1;


//think im making the scoreboard here?

import io.github.acardon1.eventlisteners.PlayerLifeListener;
import org.bukkit.plugin.java.JavaPlugin;
public class MedievalChallengePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        //Plugin was enabled: implement startup + set up.
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerLifeListener(), this);

    }

    @Override
    public void onDisable() {
        //Plugin was disabled: implement disabling features.
    }
}
