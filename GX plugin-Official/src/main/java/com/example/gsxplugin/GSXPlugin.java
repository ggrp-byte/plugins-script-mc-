package com.example.gsxplugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class GSXPlugin extends JavaPlugin {

    private ScriptManager scriptManager;

    @Override
    public void onEnable() {
        // Register the plugin's commands
        getCommand("gsx").setExecutor(new GSXCommandExecutor(scriptManager));
        getCommand("reloadscr").setExecutor(new ReloadScriptCommandExecutor(scriptManager));

        // Create the script manager
        this.scriptManager = new ScriptManager(this);

        // Start the script manager
        scriptManager.start();
    }

    @Override
    public void onDisable() {
        // Stop the script manager
        scriptManager.stop();
    }
}