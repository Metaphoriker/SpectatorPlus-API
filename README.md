# Introduction

The following explains how and for what the API can be used.

With the API you can create standalone Addons, which you can put into plugins/SpectatorPlus/SpectateModes.
*The Spigot-API still have to be implemented*

You can also implement the API into your plugin.

The API is mainly intended to create new SpectateModes.
The data of the Spectator can also be modified by using the API.
Otherwise, a little bit more is possible and what you make possible.

# How to implement

You can simply implement the API into your Addon/Plugin by:

### Add the SpectatorPlus.jar to your project library
Not much to explain here.

### Maven
[![](https://jitpack.io/v/Luziferium/SpectatorPlus-API.svg)](https://jitpack.io/#Luziferium/SpectatorPlus-API)
Just add this to your pom.xml: 

Add the JitPack repository to your build file 
```java
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

Add the dependency
```java
	<dependency>
	    <groupId>com.github.Luziferium</groupId>
	    <artifactId>SpectatorPlus-API</artifactId>
	    <version>version</version>
	</dependency>
```

### Gradle

Add the JitPack repository to your build file 
Add it in your root build.gradle at the end of repositories:
```java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add the dependency
```java

	dependencies {
	        implementation 'com.github.Luziferium:SpectatorPlus-API:version'
	}

```

# How to use

### Creating a new SpectateMode

For this purpose you will need a class:

```java
public class TestMode {

}
```

This class we will now extend with SpectateMode:
*This will add some methods to the class and make the class visible for the ClassLoader*

```java
public class TestMode extends SpectateMode {

    @Override
    public void onEnable() {
        // everything in here will be executed, when the SpectateMode gets loaded
    }

    @Override
    public String getDescription() {
        return ""; // here you can set the description of the SpectateMode. What does it do?
    }

    @Override
    public String getName() {
        return ""; // here you can set the name of the SpectateMode
    }

    @Override
    public void execute(Spectator spectator) {
        // everything in here will be executed, when a Spectator have this SpectateMode equipped
    }
    
}
```

Now you just have to fill in the methods and there you go.

### Accessing the managers

You can modify a Spectator or create a Camera with accessing the managers.
This can be easily done with the **SPApi.class**.

```java
SpectatorManager spectatorManager = SPApi.getSpectatorManager();

CameraManager cameraManager = SPApi.getCameraManager();

SpectateModeManager specateModeManager = SPApi.getSpectateModeManager();
```

### Do something when a Spectator switch his SpectateMode

I've also implemented a new Event, which gets fired, when a Spectator changes his SpectateMode.

```java
@EventHandler
public void onSwitch(SwitchSpectateModeEvent event) {

// do something

}
```

