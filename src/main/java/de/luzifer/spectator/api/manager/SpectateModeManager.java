package de.luzifer.spectator.api.manager;

import de.luzifer.spectator.api.exceptions.DuplicateModeNameException;
import de.luzifer.spectator.api.mode.SpectateMode;
import lombok.NonNull;

import java.util.List;

/**
 * Represents the SpectateModeManager to manage all around SpectateModes
 */
public interface SpectateModeManager {

    /**
     * Returns a list with all registered SpectateModes
     *
     * @return a list with all registered SpectateModes
     */
    List<SpectateMode> getRegisteredSpectateModes();

    /**
     * Register a SpectateMode so it will work
     *
     * @param spectateMode the SpectateMode to register
     */
    @NonNull
    void register(SpectateMode spectateMode) throws DuplicateModeNameException;

    /**
     * Deregister(unregister) a SpectateMode so it won't work anymore
     *
     * @param spectateMode the SpectateMode to deregister
     */
    @NonNull
    void deregister(SpectateMode spectateMode);

    /**
     * Check if a SpectateMode is registered
     * True: Is registered
     * False: Is not registered
     *
     * @param spectateMode the SpectateMode to be checked
     * @return if the SpectateMode is registered or not
     */
    @NonNull
    boolean isRegistered(SpectateMode spectateMode);

    /**
     * Returns a SpectateMode by the given name
     * Null if there is none
     *
     * @param name the name of the SpectateMode
     * @return the SpectateMode, if there is one registered with that name
     */
    SpectateMode getSpectateModeByName(String name);

}
