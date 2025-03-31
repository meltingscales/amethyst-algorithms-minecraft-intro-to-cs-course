# Amethyst Algorithms 1: IDE Setup

This part of Amethyst Algorithms is just focused on IDE and tooling setup.

We need to make sure you're able to build your minecraft mod and play it.

We also want to make sure you've got tools to debug and diagnose code within Minecraft.

## Tools

- IntelliJ IDEA
- JDK 21
  - Lower versions will NOT work. You must use at least JDK 21.
- Gradle
- NeoForge
  - [moddevgradle (READ THIS)](https://projects.neoforged.net/neoforged/moddevgradle)

## Steps

1. Import the project `amethyst-algorithms-1-ide-setup` into IntelliJ IDEA.
2. Run `./gradlew neoforge` to sync NeoForge with your IDE. Note that this will add "Run" configurations that can be used to launch Minecraft.
3. 