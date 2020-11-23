package de.luzifer.spectator.api.entity;

import lombok.NonNull;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

/**
 * Represents a Camera
 */
public interface Camera {

    /**
     * Set the camera's view
     *
     * @param location location where the camera looks at
     */
    void lookAt(@NonNull Location location);

    /**
     *
     * Updates the cameras location
     *
     */
    void update();

    /**
     * Set the target the camera is following
     *
     * @param target the target the camera is following
     */
    void setTarget(Entity target);

    /**
     * Get the target the camera is following
     *
     * @return the target the camera is following
     */
    Entity getTarget();

    /**
     * Set the height of the camera
     *
     * @param height height of the camera
     */
    void setHeight(@NonNull double height);

    /**
     * Get the height of the camera
     *
     * @return height of the camera
     */
    @NonNull
    double getHeight();

    /**
     * Set the camera location
     *
     * @param location the location the camera will teleported to
     */
    void setCameraLocation(@NonNull Location location);

    /**
     * Get the current camera location
     *
     * @return location of the camera
     */
    @NonNull
    Location getCameraLocation();

    /**
     * Set the center where the camera moves around
     *
     * @param location the location the camera will move around
     */
    void setCenter(@NonNull Location location);

    /**
     * Returns the center where the camera moves around
     *
     * @return the center where the camera moves around
     */
    @NonNull
    Location getCenter();

    /**
     * Set the radius in which the camera moves around
     *
     * @param radius the radius in which the camera will move around the center
     */
    void setRadius(@NonNull double radius);

    /**
     * Get the radius in which the camera moves around the center
     *
     * @return the radius in which the camera moves around the center
     */
    @NonNull
    double getRadius();

    /**
     *
     * Removes the camera
     *
     */
    void remove();

    /**
     * Returns the ArmorStand for being a player spectator-target
     *
     * @return the camera as entity
     */
    @NonNull
    Entity asEntity();

}
