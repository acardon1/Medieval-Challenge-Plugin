package io.github.acardon1.commandexecutors;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;

import org.bukkit.command.CommandSender;
import org.bukkit.scoreboard.*;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public class MedievalTeams implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args){
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard simulation = manager.getNewScoreboard();
        Team team1 = simulation.registerNewTeam("TeamA");
        Team team2 = simulation.registerNewTeam("TeamB");
        Team team3 = simulation.registerNewTeam("TeamC");
        Team team4 = simulation.registerNewTeam("TeamD");
        /*make lives for all teams (im taking in an arg for lives,
        * but should prolly renamed to startgame or sm.)
        * also should learn how to read world name i think
        * maybe make a fancy display??
        */
        //assign players amongst each team randomly -> 1 3 2 4
        return true;
    }

}
