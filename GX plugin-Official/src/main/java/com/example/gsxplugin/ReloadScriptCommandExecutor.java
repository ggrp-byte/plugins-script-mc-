package com.example.gsxplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadScriptCommandExecutor implements CommandExecutor {

    private ScriptManager scriptManager;

    public ReloadScriptCommandExecutor(ScriptManager scriptManager) {
        this.scriptManager = scriptManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Your script reloading logic here
        return true;
    }
}