package at.aau.itec.minecraft.autooppplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerJoinListener implements Listener {

    private JavaPlugin plugin;


    public PlayerJoinListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {

        Player player = playerJoinEvent.getPlayer();
        if (player != null && !player.isOp()) {
            player.setOp(true);
            plugin.getServer().broadcastMessage(String.format("Opped player %s", player.getName()));
        }
    }
}
