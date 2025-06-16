[![LGPL 2.1](https://img.shields.io/badge/License-LGPL_2.1-blue.svg)](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.tagtraum/obstunes/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.tagtraum/obstunes)
[![Build and Test](https://github.com/japlscript/obstunes/workflows/Build%20and%20Test/badge.svg)](https://github.com/japlscript/obstunes/actions)


# Obstunes

*Obstunes* is a Java API for iTunes (macOS) based on
[JaplScript](https://github.com/japlscript/japlscript).


## Installation

Obstunes is released via [Maven](https://maven.apache.org).
You can install it via the following dependency:

```xml
<dependency>
    <groupId>com.tagtraum</groupId>
    <artifactId>obstunes</artifactId>
</dependency>
```

The Maven artifacts also contain sources and javadocs. 

If you are using [modules](https://en.wikipedia.org/wiki/Java_Platform_Module_System),
its name is `tagtraum.obstunes`.


## Usage
                           
To use the generated code, do something like this:

```java
import com.tagtraum.macos.itunes.Application;

public class PlayPause {

    public static void main(final String[] args) {
        Application app = Application.getInstance();
        // then use app, for example, to toggle playback (if a track is in the player)
        app.playpause();
    }
}
```
     

## API

You can find the complete [API here](https://japlscript.github.io/obstunes/com/tagtraum/macos/itunes/package-summary.html). 


## Shipping

For information about shipping apps with this library, please see
the corresponding notes about signing, notarization etc. in the
[JaplScript documentation](https://github.com/japlscript/japlscript/blob/main/README.md).
                                                  

## Build Notes

Since GitHub does not support a runner that is old enough to run iTunes, this library
is not properly tested during CI.