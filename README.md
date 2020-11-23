# Introduction

The following explains how and for what the API can be used.

With the API you can hook into the plugin.

The API is mainly intended to create new SpectateModes.
The data of the Spectator can also be modified by using the API.
Otherwise, a little bit more is possible and what you make possible.

# How to implement [![](https://jitpack.io/v/Luziferium/SpectatorPlus-API.svg)](https://jitpack.io/#Luziferium/SpectatorPlus-API)

You can simply implement the API into your Addon/Plugin by:

### Add the SpectatorPlus.jar to your project library
Not much to explain here.

### Maven

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

```java

/*

Should your SpectateMode have a Camera?
No problem! Just let your class implement "Camerable"

Would look like this:
public class TestMode extends SpectateMode implements Camerable { }

This automatically assigns a camera to the Spectator, which you can modify in your code

*/


public class TestMode extends SpectateMode {

    @Override
    public List<String> getDescription() {
    	List<String> desc = new ArrayList<>();
	desc.add("");
        return desc; // here you can set the description of the SpectateMode. What does it do?
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

Now you just have to fill in the methods and register the SpectateMode and there you go.

How to register:

```java
// your onEnable() in your JavaPlugin class
   @Override
   public void onEnable() {
   
   SpectateModeManager spm = SPApi.getSpectateModeManager();
   spm.register(new TestCheck());
   
   }
```

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

