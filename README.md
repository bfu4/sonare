# sonare [![picture](https://github.com/bfu4/sonare/blob/devel/.github/FINALSONARE.png)]
A multi-purpose Bukkit debugging plugin / framework. [![Build Status](https://travis-ci.com/bfu4/sonare.svg?token=bypWRsVUoMjidD3wJrUy&branch=master)](https://travis-ci.com/bfu4/sonare) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Why?
Ever try to override someone elses listeners? Events?
Have you ever ***needed*** to debug code you've never seen before?
**Sonare** makes that easier.

The concept of sonare was to create something that would allow getting conflicting `listeners` and `events`, as well as trigger them. There's a lot of annoyance when dealing with other people's problems, especially when they suck.

Per se, let's say you have a broken event listener. You see the flaw in their code. Obviously, injecting a line or even a few characters could be a pain in the ass. Maybe that will be a ***future feature***.

So, you have their original code, probably from your decompilation. You could modify it, and override it. Done. `This` archive for **sonare** contains source code to give insight to that overriding.
After peeking around, we found out we can deregister all of a plugin's listeners for a specific event. Sonare has the features to allow doing this in bulk.

### But after overriding, how do we test that it even passes?

That's where the `execute` feature comes into play. This feature allows easy calling of events, from a player location, a given location, or the origin of the world.

### How do we know what we touched?

Sonare is organized in a way to give the user both the human readable output, as well as the non-human readable output. Happy debugging!

## Where did the name come from?
The original concept of **sonare** was to create a debugging framework for Bukkit plugins to the best of my ability. The idea was to allow full-fledged analysis for most processes, to know how to code against it. [radare2](https://github.com/radareorg/radare2) is a fantastic reversing framework, however reversing Java isn't something that's very useful for plugin development / understanding and manipulating the bytecode is not very useful for Spigot plugin development. Sonare is an attempt to allow what *could be* the next best thing, and allow easy toggling of possible conflicts, and workarounds for code that probably shouldn't be the way it is (or at least for your purpose).

As `radare` is like *radar*, a method to detect objects, the idea of `sonare` was formed.
`Sonare` in concept, allows detection for things ***under the water*** or in this case, below user visibility -- from the development perspective.

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
