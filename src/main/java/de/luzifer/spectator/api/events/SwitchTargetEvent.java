package de.luzifer.spectator.api.events;

import de.luzifer.spectator.api.entity.player.Spectator;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Gets fired when the Spectator switches his target
 * Can also be fired if the player is not spectating
 */
public class SwitchTargetEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();
    private boolean isCancelled;

    private Spectator spectator;
    private Player targetBefore;
    private Player targetAfter;

    public SwitchTargetEvent(Spectator spectator, Player targetBefore, Player targetAfter) {
        this.spectator = spectator;
        this.targetBefore = targetBefore;
        this.targetAfter = targetAfter;
    }

    /**
     * @return the Spectator which started spectating
     */
    public Spectator getSpectator() {
        return spectator;
    }

    /**
     *
     * @return the target before the switch
     */
    public Player getTargetBefore() {
        return targetBefore;
    }

    /**
     *
     * @return the target after the switch
     */
    public Player getTargetAfter() {
        return targetAfter;
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
