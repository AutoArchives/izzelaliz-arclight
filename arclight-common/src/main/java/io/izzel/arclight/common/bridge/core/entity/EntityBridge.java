package io.izzel.arclight.common.bridge.core.entity;

import io.izzel.arclight.common.bridge.core.command.ICommandSourceBridge;
import net.minecraft.core.PositionImpl;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import org.bukkit.craftbukkit.v.entity.CraftEntity;
import org.bukkit.projectiles.ProjectileSource;

import java.util.List;

public interface EntityBridge extends ICommandSourceBridge {

    Entity bridge$teleportTo(ServerLevel world, PositionImpl blockPos);

    void bridge$setOnFire(int tick, boolean callEvent);

    CraftEntity bridge$getBukkitEntity();

    void bridge$setBukkitEntity(CraftEntity craftEntity);

    boolean bridge$isPersist();

    void bridge$setPersist(boolean persist);

    boolean bridge$isValid();

    void bridge$setValid(boolean valid);

    ProjectileSource bridge$getProjectileSource();

    void bridge$setProjectileSource(ProjectileSource projectileSource);

    float bridge$getBukkitYaw();

    boolean bridge$isChunkLoaded();

    boolean bridge$isLastDamageCancelled();

    void bridge$setLastDamageCancelled(boolean cancelled);

    void bridge$postTick();

    boolean bridge$removePassenger(Entity passenger);

    boolean bridge$addPassenger(Entity entity);

    List<Entity> bridge$getPassengers();

    void bridge$setRideCooldown(int rideCooldown);

    int bridge$getRideCooldown();

    boolean bridge$canCollideWith(Entity entity);
}
