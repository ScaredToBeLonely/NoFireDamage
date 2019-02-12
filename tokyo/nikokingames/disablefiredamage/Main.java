package tokyo.nikokingames.disablefiredamage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onDamage(EntityDamageEvent e) {
		if(e.getCause().equals(DamageCause.FIRE_TICK) || e.getCause().equals(DamageCause.FIRE)) {
			e.setCancelled(true);
			e.getEntity().setFireTicks(0);
		}
	}

}
