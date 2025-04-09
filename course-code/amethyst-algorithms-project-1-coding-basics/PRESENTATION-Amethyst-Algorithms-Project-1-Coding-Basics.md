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

# IDE setup

First, we're going to set up your IDE.

1. Clone the repository 