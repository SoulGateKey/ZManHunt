package fun.zcraft.sgk.zmanhunt.zmanhunt;

import com.onarandombox.MultiverseCore.MultiverseCore;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import com.onarandombox.MultiverseCore.api.Core;

public final class ZManHunt extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Enabling ZManHunt...");
        if(!Hooker()) {
            getLogger().info("Multiverse-Core doesn't installed, ZManHunt has disabled");
        }
        else {
            MultiverseCore core = (MultiverseCore) Bukkit.getServer().getPluginManager().getPlugin("Multiverse-Core");
            getLogger().info("MultiverseCore has hooked by ZManHunt");
        }
        getLogger().info("ZManHunt has enabled successfull.");
        getLogger().info("Could you please donate me at https://afdian.net/@zmanhunt");
        getLogger().info("Your donate and using is the driving force and support for my development. Thank you for your using");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    boolean Hooker(){
        if(getServer().getPluginManager().getPlugin("Multiverse-Core") == null) {
            return false;
        }
        else {
            return true;
        }
    }
}
