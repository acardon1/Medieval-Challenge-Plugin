package io.github.acardon1.eventlisteners;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

//import org.bukkit.scoreboard.*;
//

public class PlayerLifeListener implements Listener {

    @EventHandler
    public void onPlayerDeath(EntityDeathEvent e) {
        Entity entity = e.getEntity();
        if(entity instanceof Player) {

        }

    }
}
