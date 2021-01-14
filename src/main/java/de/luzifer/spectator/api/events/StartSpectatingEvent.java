package de.luzifer.spectator.api.events;

import de.luzifer.spectator.api.entity.player.Spectator;
import de.luzifer.spectator.api.mode.SpectateMode;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Gets fired when a Player start spectating
 */
public class StartSpectatingEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();
    private boolean isCancelled;

    private Spectator spectator;
    private SpectateMode spectateMode;
    private Player target;

    public StartSpectatingEvent(Spectator spectator, Player target, SpectateMode spectateMode) {
        this.spectator = spectator;
        this.spectateMode = spectateMode;
        this.target = target;
    }

    /**
     * @return the current SpectateMode
     */
    public SpectateMode getSpectateMode() {
        return spectateMode;
    }

    /**
     * @return the current target
     */
    public Player getTarget() {
        return target;
    }

    /**
     * @return the Spectator which started spectating
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
