package me.ove.bukkit.effects.Listeners;

import org.bukkit.Sound;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

//
// cbmcEffects By Ove98 & CreeperAnatomy
// Copyright (c) OveHenrik 2013
//

public class Effects implements Listener {

	
	
	
	@EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent e) {
		
		
		
            if (e.getDamager() instanceof Snowball) {
                    Snowball f = (Snowball) e.getDamager();
                    if (f.getShooter() instanceof Player) {
                            if(e.getEntity() instanceof Player) {
                            	Player pl = (Player) e.getEntity();
                                    pl.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 400, 0));
                            }
                    }
            }
            
            
            
            
            
            
            if (e.getDamager() instanceof Egg) {
                Egg f = (Egg) e.getDamager();
                if (f.getShooter() instanceof Player) {
                        if(e.getEntity() instanceof Player) {
                        	Player pl = (Player) e.getEntity();
                                pl.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 400, 0));
                        }
                }
        }

            
            
	}
	
	
	
	
	
	
	
	@EventHandler
    public void onEntityDamage(PlayerTeleportEvent e) {
		e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.PORTAL_TRAVEL, 0, 0);
	}
}
