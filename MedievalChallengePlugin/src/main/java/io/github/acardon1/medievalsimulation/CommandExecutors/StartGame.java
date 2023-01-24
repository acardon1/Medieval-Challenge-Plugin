package io.github.acardon1.medievalsimulation.CommandExecutors;

import io.github.acardon1.medievalsimulation.MedievalSimulation;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.bukkit.scoreboard.*;

public class StartGame implements CommandExecutor {

    @Override
    public boolean onCommand (CommandSender sender, Command command, String label, String[] args) {
        /*
        VAR TESTING -> NUMBER OF ARGS IS CORRECT
        ARGS ARE GOOD NUMBERS (NO CHAR NAMES OR W.E)
        ?!

        <args> -> vars /sg <#num of lives> <#num of teams>
        going to set up scoreboard and create the number of teams
        split players equally amongst teams,
            -> MAYBE RANDOM DISTRIBUTION ENTIRELY (not uniformly 1-x teams)
            -> instead closer to like each player, rng 1-4, assign you that team
         add lives objective to scoreboard, and set it equal to the number of lives
         and then add nothing else right?
         */
        if (args.length == 2) {
            //parse args
            int lifecount = Integer.parseInt(args[0]);
            int teamcount = Integer.parseInt(args[1]);
            //create scoreboard
            ScoreboardManager manager = Bukkit.getScoreboardManager();
            Scoreboard gameBoard = manager.getNewScoreboard();
            //create teams

            //create lives objective
            Objective lives = gameBoard.registerNewObjective("lives", "dummy", "Lives Left");
            //this renders their lives as a number of hearts, isn't that cute
            lives.setRenderType(RenderType.HEARTS);

            //set number of lives for each player
            for (Player online : Bukkit.getOnlinePlayers()) {
                Score numLives = lives.getScore(online);
                numLives.setScore(lifecount);
            }
            //push number of lives and the scoreboard to all players
            for (Player online : Bukkit.getOnlinePlayers()) {
                online.setScoreboard(gameBoard);
            }
            //distribute either randomly or uniformly idk how tho

            return true;
        }
        else {
            if(sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("Please use two integers to start game, one for number of lives, one for number of teams.");
            } else {
                System.out.println("Please use two integers to start game, one for number of lives, one for number of teams.");
            }
            return false;
        }
    }
}
