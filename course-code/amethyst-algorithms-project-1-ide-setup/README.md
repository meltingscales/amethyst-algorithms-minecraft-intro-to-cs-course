# Amethyst Algorithms Project 1: IDE Setup

This part of Amethyst Algorithms is just focused on IDE and tooling setup.

We need to make sure you're able to build your minecraft mod and play it.

We also want to make sure you've got tools to debug and diagnose code within Minecraft.

I don't like boring students with annoying setup, so this is meant to be as easy for you as possible.
HOWEVER: In real life, "annoying technology setup" will very much smack you in the face and steal your purse, and make you step on a lego. It can be really useful to learn how to set up something from scratch! And annoying, too.

It would be wise to learn through trial and error how to create this stub from scratch if you want to challenge yourself.

## Learning Objectives

1. Understand how to use an IDE to build, run, and debug
   - Debugging: understand how to dynamically change dropped items within Minecraft by using debug
     - You can evaluate arbitrary expressions! Think about things like spawning TNT, sheep, replacing blocks, etc.

2. Understand Gradle build targets
   - `clean` - clean the build environment
   - `build` - compile source code
   - `runClient` - play your mod!
   - etc.

3. Understand how NeoForge works at a basic level
   - A full re-implementation of the Minecraft server and client (separated)
   - Annotations, what are they?

4. Understand why code auto-formatting is used in the industry (we are using `spotless`)
   - Don't have to remember to format things manually
   - No arguing with team members and less merge conflicts since you all use the same formatter
   - A pre-commit-hook is ideal, but we can do it on build using `gradle`.

## How did you create this stub?

I just read `moddevgradle` documentation and fiddled with Java versions until it almost worked.

I then realized I failed, and realized I needed to use <https://neoforged.net/mod-generator/> after chatting on The NeoForge Project discord channel.

You should just use <https://neoforged.net/mod-generator/> to generate a stub like this.

## What else can i do with `moddevgradle`?

Run `./gradlew -q :tasks --all` and read!

## Tools

- IntelliJ IDEA
- JDK 21
  - Lower versions will NOT work. You must use at least JDK 21.
- Gradle
- NeoForge
  - [moddevgradle (READ THIS)](https://projects.neoforged.net/neoforged/moddevgradle)
  - https://neoforged.net/mod-generator/

## Steps

1. Import the project `amethyst-algorithms-project-1-ide-setup` into IntelliJ IDEA.
2. Run `./gradlew neoforge neoForgeIdeSync` to sync NeoForge with your IDE. Note that this will add "Run" configurations that can be used to launch Minecraft.
3. Now, use the "Play" button at the top-right to launch a client or server.
   - Or, just run `./gradlew clean cleanRunClient runClient`.

## Extra

### Code formatting

```bash
./gradlew spotlessApply
```

### Find string in file contents

    grep -rnw './' -e 'project1'

### Find string in file paths

    find . -wholename *project1*

