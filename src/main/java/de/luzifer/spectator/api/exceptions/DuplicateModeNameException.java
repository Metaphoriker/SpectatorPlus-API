package de.luzifer.spectator.api.exceptions;

/**
 * Will be thrown when 2 SpectateModes have the same name
 * Will also unregister the second SpectateMode with the same name
 */
public class DuplicateModeNameException extends Exception {

    public DuplicateModeNameException(String message) { super(message); }

}
