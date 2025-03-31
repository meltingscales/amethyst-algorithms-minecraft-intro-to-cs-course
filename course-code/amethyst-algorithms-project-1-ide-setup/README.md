# Amethyst Algorithms Project 1: IDE Setup

This part of Amethyst Algorithms is just focused on IDE and tooling setup.

We need to make sure you're able to build your minecraft mod and play it.

We also want to make sure you've got tools to debug and diagnose code within Minecraft.

I don't like boring students with annoying setup, so this is meant to be as easy for you as possible.
HOWEVER: In real life, "annoying technology setup" will very much smack you in the face and steal your purse, and make you step on a lego. 

It would be wise to learn through trial and error how to create this stub from scratch as an extra project.

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

1. Import the project `amethyst-algorithms-1-ide-setup` into IntelliJ IDEA.
2. Run `./gradlew neoforge neoForgeIdeSync` to sync NeoForge with your IDE. Note that this will add "Run" configurations that can be used to launch Minecraft.
3. Now, use the "Play" button at the top-right to launch a client or server.
   - Or, just run `./gradlew clean cleanRunClient runClient`.

## Extra

### Code formatting

```bash
./gradlew spotlessApply
```