package io.github.acardon1.medievalsimulation.EventListeners;

import org.bukkit.GameMode;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.entity.Player;

import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Objective;

//

public class PlayerLifeListener implements Listener {

    @EventHandler
    public void onPlayerDeath(EntityDeathEvent e) {
        Entity entity = e.getEntity();
        if(entity instanceof Player) { //Entity that died was a player
            Player player = ((Player) entity).getPlayer(); //grab player
            Scoreboard board = player.getScoreboard(); //get scoreboard
            Objective obj = board.getObjective("lives"); //find lives objective
            Score lives = obj.getScore(player); //find number of lives for each player
            int newLives = lives.getScore() - 1; //new lives

            //check to see if they are at or "below" -> set spectator
            if (newLives <= 0) {
                player.setGameMode(GameMode.SPECTATOR);
                lives.setScore(0);
                player.setScoreboard(board);
            }
            else { //else update their lives
                lives.setScore(newLives);
                player.setScoreboard(board);
            }
        }

    }
}
