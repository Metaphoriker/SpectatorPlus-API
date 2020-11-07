package de.luzifer.spectator.api.events;

import de.luzifer.spectator.api.entity.player.Spectator;
import de.luzifer.spectator.api.mode.SpectateMode;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * This event gets called, when a Spectator is changing his SpectateMode
 */
public class SwitchSpectateModeEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();
    private boolean isCancelled;

    private final SpectateMode before;
    private SpectateMode after;

    private final Spectator spectator;

    public SwitchSpectateModeEvent(Spectator spectator, SpectateMode before, SpectateMode after) {

        this.spectator = spectator;
        this.before = before;
        this.after = after;

    }

    /**
     * Returns the Spectator which changed his SpectateMode
     *
     * @return the Spectator which changed his SpectateMode
     */
    public Spectator getSpectator() {
        return spectator;
    }

    /**
     * Returns the SpectateMode the Spectator had before changing
     *
     * @return the SpectateMode before changing
     */
    public SpectateMode getBefore() {
        return before;
    }

    /**
     * Returns the SpectateMode the Spectator will have as next
     *
     * @return the SpectateMode to which got changed
     */
    public SpectateMode getAfter() {
        return after;
    }

    /**
     * Sets the SpectateMode which will be the next SpectateMode of the Spectator
     *
     * @param after the next SpectateMode
     */
    public void setAfter(SpectateMode after) {
        this.after = after;
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
