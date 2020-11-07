package de.luzifer.spectator.api.manager;

import de.luzifer.spectator.api.entity.Camera;
import de.luzifer.spectator.api.entity.player.Spectator;
import lombok.NonNull;
import org.bukkit.Location;

/**
 * Represents the CameraManager to manage all around Cameras
 */
public interface CameraManager {

    /**
     * Creates a new Camera and returns it
     *
     * @param location the Location where the Camera should spawn
     * @return the Camera
     */
    @NonNull
    Camera createCamera(Location location);

    /**
     * Removes the Camera
     * Alternative: camera#remove()
     *
     * @param camera the Camera to remove
     */
    @NonNull
    void removeCamera(Camera camera);

    /**
     * Returns the Camera from the Spectator
     * Null = Currently no Camera
     *
     * @param spectator the Spectator the Camera is from
     * @return the Camera
     */
    @NonNull
    Camera cameraFrom(Spectator spectator);

}
