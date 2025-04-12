---
title: "Amethyst Algorithms Project 1: IDE Setup"
author: "Henry Post"
institute: "Drakonix Industries, LLC"
topic: "Amethyst Algorithms Project 1: IDE Setup"
theme: "Frankfurt"
colortheme: "beaver"
fonttheme: "professionalfonts"
mainfont: "Hack Nerd Font"
fontsize: 10pt
urlcolor: red
linkstyle: bold
aspectratio: 169
#titlegraphic: img/aleph0.png
#logo: img/aleph0-small.png
date: March 31, 2025
lang: en-US
section-titles: true
toc: true
---

# About the author

Henry Post  
![Henry Post](https://meltingscales.github.io/static/headshot.png)

```
bio  -> meltingscales.github.io
code -> github.com/meltingscales/amethyst-algorithms
```
This presentation was made using Markdown and Pandoc with the "beamer" template.

# What is this?

Amethyst Algorithms is a course aimed at smart highschoolers or average college students, meant to teach you how to do software programming using Minecraft and NeoForged.

If you're age 15+, like Minecraft, and want to learn programming, you should give this course a try.

# Tooling setup

You'll need to install a few tools first!

If using Windows, I highly recommend using Chocolatey `choco` to install packages. It is a fantastic package manager similar to `apt` or `yum`.

- [choco](https://docs.chocolatey.org/en-us/choco/setup/)

If using Linux, this will depend. I recommend Ubuntu for beginners.

1. [Install IntelliJ IDEA](https://www.jetbrains.com/idea/)
   - [Windows JetBrains Toolbox](https://community.chocolatey.org/packages/jetbrainstoolbox)
   - [Linux/OSX JetBrains Toolbox](https://www.jetbrains.com/toolbox-app/)
2. [Install Git](https://git-scm.com/)
3. Install Java Development Kit 21
    - [Windows Java 21](https://community.chocolatey.org/packages/openjdk/21.0.0)
    - [Linux/OSX Java 21](https://askubuntu.com/a/1492589)

# Git setup

I'll assume you've installed Git. You just need to run the below:
1. Open a terminal and `cd` to the place you'd like the repository to live.
2. Run `git clone https://github.com/meltingscales/amethyst-algorithms-minecraft-intro-to-cs-course`

# Java setup

Nothing to be done! Just install JDK 21 (not JRE 21).

# IDE setup

Next, we're going to set up your IDE.

(Live demo: Henry shows you how to set it up and import)

# Basics of Java code: Syntax 1

Let's go to `/src/main/java/io/meltingscales/amethystalgorithms/DirtDropsGold.java` in our editor!

Java syntax can be broken up into a few distinct types. We'll cover them in the next slide.

- `L13`: an annotation! `@EventBusSubscriber(...)`
- `L14`: a class declaration! `public class DirtDropsGold {...}`.
- `L16`: A method (also function) declaration! `onBlockBreak(...){...}`
- `L27`: A variable declaration! `int blockX = blockPos.getX();`
- z
- a
- b
- c

# Basics of Java code: Syntax 2: Annotations

Annotations are ways to store extra data ("metadata", literally "data about data" ) about a method (function), 
variable, or class.

In NeoForged, they are very powerful and mean specific things. They tell the (classloader?) to hook specific functions
into your mod.

[//]: # (TODO make this more descriptive?)

```java
@EventBusSubscriber(modid = AmethystAlgorithms.MODID, bus = EventBusSubscriber.Bus.GAME)
public class DirtDropsGold {

  @SubscribeEvent(receiveCanceled = true)
  public static void onBlockBreak(BlockEvent.BreakEvent event) {
    // get broken block position
     // 
  }
}

```

# Basics of Java code: Syntax 3: Class declarations
# Basics of Java code: Syntax 4: Function/method declarationsx
# Basics of Java code: Syntax 5: Variable declarations
# Basics of Java code: Syntax 6: `if` statements
# Basics of Java code: Syntax 7: `boolean` expressions
# Basics of Java code: Syntax 8: method/function invocations
# Basics of Java code: Syntax 9: "method chaining"

It looks pretty neat. Method chaining is a useful technique that lets you easily modify the state of an object.

It works because the method just repeatedly returns `this`, meaning the object that is currently running the method.




# Basics of Java code: Variables

# Basics of Java code: Mod Annotations

# Basics of Java code: Syntax

