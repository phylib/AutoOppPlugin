package at.aau.itec.minecraft.autooppplugin;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.logging.Level;

public class Main extends JavaPlugin {

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        super.onEnable();

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerJoinListener(this), this);
    }
}
