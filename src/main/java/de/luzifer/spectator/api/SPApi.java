package de.luzifer.spectator.api;

import de.luzifer.spectator.api.manager.CameraManager;
import de.luzifer.spectator.api.manager.SpectateModeManager;
import de.luzifer.spectator.api.manager.SpectatorManager;

/**
 * The API to get the managers
 */
public class SPApi {

    static CameraManager cameraManager;
    static SpectatorManager spectatorManager;
    static SpectateModeManager spectateModeManager;

    /**
     * Returns the CameraManager
     *
     * @return the CameraManager to manage/create (new) Cameras
     */
    public static CameraManager getCameraManager() {
        return cameraManager;
    }

    /**
     * Returns the SpectatorManager
     *
     * @return the SpectatorManager to manage Spectators
     */
    public static SpectatorManager getSpectatorManager() {
        return spectatorManager;
    }

    /**
     * Returns the SpectateModeManager
     *
     * @return the SpectateModeManager to manage SpectateModes
     */
    public static SpectateModeManager getSpectateModeManager() {return spectateModeManager;}

    public void setCameraManager(CameraManager cameraManager) {
        SPApi.cameraManager = cameraManager;
    }

    public void setSpectatorManager(SpectatorManager spectatorManager) {
        SPApi.spectatorManager = spectatorManager;
    }

    public void setSpectateModeManager(SpectateModeManager spectateModeManager) {
        SPApi.spectateModeManager = spectateModeManager;
    }
}
