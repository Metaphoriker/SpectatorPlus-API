package de.luzifer.spectator.api.events;

import de.luzifer.spectator.api.entity.player.Spectator;
import de.luzifer.spectator.api.mode.SpectateMode;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Gets fired when a Player stops spectating
 */
public class StopSpectatingEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();
    private boolean isCancelled;

    private Spectator spectator;
    private SpectateMode lastSpectateMode;
    private Player lastTarget;

    public StopSpectatingEvent(Spectator spectator, Player target, SpectateMode spectateMode) {
        this.spectator = spectator;
        this.lastSpectateMode = spectateMode;
        this.lastTarget = target;
    }

    /**
     *
     * @return the last used SpectateMode
     */
    public SpectateMode getLastSpectateMode() {
        return lastSpectateMode;
    }

    /**
     *
     * @return the last target specced'
     */
    public Player getLastTarget() {
        return lastTarget;
    }

    /**
     *
     * @return the Spectator which just stopped spectating
     */
    public Spectator getSpectator() {
        return spectator;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
