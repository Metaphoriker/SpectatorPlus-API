package de.luzifer.spectator.api;

import de.luzifer.spectator.SpectatorPlus;
import de.luzifer.spectator.api.manager.CameraManager;
import de.luzifer.spectator.api.manager.SpectateModeManager;
import de.luzifer.spectator.api.manager.SpectatorManager;

/**
 * The API to get the managers
 */
public class SPApi {

    /**
     * Returns the CameraManager
     *
     * @return the CameraManager to manage/create (new) Cameras
     */
    public static CameraManager getCameraManager() {
        return SpectatorPlus.cameraManager;
    }

    /**
     * Returns the SpectatorManager
     *
     * @return the SpectatorManager to manage Spectators
     */
    public static SpectatorManager getSpectatorManager() {
        return SpectatorPlus.spectatorManager;
    }

    /**
     * Returns the SpectateModeManager
     *
     * @return the SpectateModeManager to manage SpectateModes
     */
    public static SpectateModeManager getSpectateModeManager() {return SpectatorPlus.spectateModeManager;}
}
