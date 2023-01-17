package io.github.acardon1.commandexecutors;

import org.bukkit.command.CommandExecutor;
import org.bukkit.scoreboard.*;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public class MedievalTeams implements CommandExecutor {

    @Override
    public boolean onCommand(Command command, String label, String[] args){
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();
        Team team1 = board.registerNewTeam("TeamA");
        Team team2 = board.registerNewTeam("TeamB");
        Team team3 = board.registerNewTeam("TeamC");
        Team team4 = board.registerNewTeam("TeamD");
    }
}
