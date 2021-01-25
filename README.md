# sonare
A multi-purpose Spigot debugging plugin / framework.

## Why?
Ever try to override someone elses listeners? Events?
Have you ever ***needed*** to debug code you've never seen before?
**Sonare** makes that easier.

The concept of sonare was to create something that would allow getting conflicting `listeners` and `events`, as well as trigger them. There's a lot of annoyance when dealing with other people's problems, especially when they suck.

Per se, let's say you have a broken event listener. You see the flaw in their code. Obviously, injecting a line or even a few characters could be a pain in the ass. Maybe that will be a ***future feature***.

So, you have their original code, probably from your decompilation. You could modify it, and override it. Done. `This` archive for **sonare** contains source code to give insight to that overriding.
After peeking around, we found out we can deregister all of a plugin's listeners for a specific event. Sonare has the features to allow doing this in bulk.

But after overriding, how do we test that it even passes?

That's where the `execute` feature comes into play. This feature allows easy calling of events, from a player location, a given location, or the origin of the world.


## Sonare as a dependency

You can use Sonare as a dependency! Sonare provides a ***LIGHTWEIGHT PLUGIN STRUCTURE*** with debugging tools. To start off a new Sonare-based plugin, extend `SonarePlugin`.

### Repository
```xml
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

### Dependency
```xml
<dependency>
	    <groupId>com.github.bfu4</groupId>
	    <artifactId>sonare</artifactId>
	    <version>LATEST</version>
	</dependency>
```
