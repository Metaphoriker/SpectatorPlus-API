package de.luzifer.spectator.api.manager;

import de.luzifer.spectator.api.entity.player.Spectator;
import lombok.NonNull;

import java.util.List;
import java.util.UUID;

/**
 * Represents the SpectatorManager to manage all around Spectators
 */
public interface SpectatorManager {

    /**
     * Returns a List of all Spectators
     *
     * @return a List of all Spectators
     */
    List<Spectator> getAllSpectators();

    /**
     * Returns the player with the UUID as a Spectator
     *
     * @param uuid the UUID of the player
     * @return the player as a Spectator
     */
    @NonNull
    Spectator getSpectator(UUID uuid);

    /**
     * Register a Spectator
     *
     * @param spectator the Spectator to register
     */
    @NonNull
    void registerSpectator(Spectator spectator);

    /**
     * Deregister a Spectator
     *
     * @param spectator the Spectator to deregister
     */
    @NonNull
    void deregisterSpectator(Spectator spectator);

    /**
     * Checks if the Spectator is already registered
     * True: Is registered
     * False: Is not registered
     *
     * @param spectator the Spectator to check
     * @return if the Spectator is registered or not
     */
    @NonNull
    boolean isRegisteredSpectator(Spectator spectator);

}
