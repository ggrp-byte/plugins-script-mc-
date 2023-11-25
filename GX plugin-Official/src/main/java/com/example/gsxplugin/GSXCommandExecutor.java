package com.example.gsxplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class GSXCommandExecutor implements CommandExecutor {

    private ScriptManager scriptManager;

    public GSXCommandExecutor(ScriptManager scriptManager) {
        this.scriptManager = scriptManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Your command handling logic here
        return true;
    }
}