package io.github.acardon1.medievalsimulation.CommandExecutors;

import io.github.acardon1.medievalsimulation.MedievalSimulation;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StartGame implements CommandExecutor {

    @Override
    public boolean onCommand (CommandSender sender, Command command, String label, String[] args) {
        //what should args be?
        /*
        take in maybe like the number of lives per player, and then number of teams
        <args> -> vars /sg <#num of lives> <#num of teams>
         */
        return false;
    }
}
