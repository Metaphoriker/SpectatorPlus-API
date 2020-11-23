package de.luzifer.spectator.api.entity.player;


import de.luzifer.spectator.api.entity.Camera;
import de.luzifer.spectator.api.mode.SpectateMode;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

import java.util.Collection;
import java.util.UUID;

/**
 * Represents the Spectator
 */
public interface Spectator {

    /**
     * To identify the spectator
     *
     * @return uuid of the player
     */
    UUID getUniqueId();

    /**
     * Returns the spectator as a player
     *
     * @return the spectator as player
     */
    Player asPlayer();

    /**
     * Sets the spectateMode of the spectator
     *
     * @param spectateMode the spectateMode the spectator is set into
     */
    void setSpectateMode(SpectateMode spectateMode);

    /**
     * Returns the spectateMode the spectator currently has
     *
     * @return the spectateMode the spectator currently has
     */
    SpectateMode getSpectateMode();

    /**
     * Sets the camera the spectator is using to spectate
     *
     * @param camera the camera which is set as the camera the spectator is looking through
     */
    void setCamera(Camera camera);

    /**
     * Returns the camera the spectator is spectating through
     *
     * @return the camera the spectator is looking through
     */
    Camera getCamera();

    /**
     * True: Has camera
     * False: Has no camera
     *
     * @return if the spectator has a camera or not
     */
    boolean hasCamera();

    /**
     * Set the target the spectator is spectating
     *
     * @param player the target the spectator is going to spectate
     */
    void setTarget(Player player);

    /**
     * Returns the target the spectator is spectating
     *
     * @return the target the spectator is spectating
     */
    Player getTarget();

    /**
     * Sets if the spectator is spectating or not
     *
     * @param spectating set if the spectator is spectating or not
     */
    void setSpectating(boolean spectating);

    /**
     * True: The spectator is spectating
     * False: The spectator is not spectating
     *
     * @return if the spectator is currently spectating
     */
    boolean isSpectating();

    /**
     * Sets the Location in which the spectator gets teleported if he stops spectating
     *
     * @param lastLocation the last location the spectator had
     */
    void setLastLocation(Location lastLocation);

    /**
     * Returns the last Location the spectator had
     *
     * @return the last location the spectator had
     */
    Location getLastLocation();

    /**
     * Sets the GameMode in which the spectator gets set into if he stops spectating
     *
     * @param gameMode the last GameMode the spectator had
     */
    void setLastGameMode(GameMode gameMode);

    /**
     * Returns the last GameMode the spectator had
     *
     * @return the last GameMode the spectator had
     */
    GameMode getLastGameMode();

    /**
     * Sets the remaining air which the spectator get if he stops spectating
     *
     * @param air the last remaining air the spectator had - in ticks
     */
    void setLastRemainingAir(Integer air);

    /**
     * Returns the last remaining air the spectator had
     *
     * @return the last remaining air the spectator had - in ticks
     */
    Integer getLastRemainingAir();

    /**
     * Sets the potion effects the spectator will get if he stops spectating
     *
     * @param potionEffects the last potion effects the spectator had
     */
    void setLastPotionEffects(Collection<PotionEffect> potionEffects);

    /**
     * Returns the last potion effects the spectator had
     *
     * @return the last potion effects the spectator had
     */
    Collection<PotionEffect> getLastPotionEffects();

    /**
     * Removes everything the spectator had
     * If deregister is true, the plugin deletes the object
     *
     * @param deregister
     * True: deletes the object
     * False: doesn't deletes the object
     */
    void remove(boolean deregister);

}
