package org.yi.acru.bukkit.Lockette;

import org.bukkit.World;

public interface GroupProvider {
    public boolean playerInGroup(World world, String player, String group);
}
