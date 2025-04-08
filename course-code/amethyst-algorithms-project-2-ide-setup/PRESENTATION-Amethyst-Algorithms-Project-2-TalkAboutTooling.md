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

# IDE choice

We're going to be using IntelliJ IDEA. Both "Community" and "Ultimate" edition will work.

This is not necessary, but recommended. I prefer IntelliJ IDEA, and if you're a student with a `.edu` or similar email, you can get the "Ultimate" edition for free on their website!

<https://www.jetbrains.com/community/education/>

# Debugging

It's dead simple to debug while coding with an IDE!

In the "Gutter", the left-hand tract of screen space to the right of line numbers in IDEA, you can set what's called a "breakpoint".

If you set one, and run the "Client" run configuration in Debug mode, the game will PAUSE right before it executes the code targeted by a breakpoint! 

Try it out! In `DirtDropsGold.java:L26` (line 26), add a breakpoint, run `Client` in debug, join a world, and break a dirt block.

```text
  vvv -- Right there is the gutter.
01 | package test.mypackage.com;
02 | 
03 | public static void main(String[] args) {
04 |     System.out.println("Hello world!");
05 | }
```

# Debugging part 2

Another neat feature of Debug mode is the ability to execute arbitrary Java code while the game is paused.

Create a breakpoint inside `DirtDropsGold.java`, and try running some of these expressions in the `Threads & Variables > Evaluate expression` field:

Alternatively, you can hit CTRL-SHIFT-P to bring up the command palette, and type in `Debugging actions` or `Evaluate expression`.

You can use `F5` to resume the program execution.

```java
Minecraft.getInstance().mouseHandler.releaseMouse()
Minecraft.getInstance().player.getName()
Minecraft.getInstance().player.position.x
world.isDaytime()
player.sendMessage("Hello, Minecraft!")
world.setBlock(player.getPosition().up(), Blocks.DIAMOND_BLOCK)
```

# Java

# Gradle

# Neoforged

# sample `onBlockBreak`