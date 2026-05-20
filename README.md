# TowerDefenseGame

A simple 2D tower defense game implemented in Java.

## Overview

This project contains the core classes for a tower defense game where enemies follow a winding path and the player places towers to defeat them before they reach the exit.

## What the game does

- Uses `GamePanel` to render the play area, the enemy path, towers, and enemies.
- `LevelManager` controls game logic including spawning waves, updating enemy movement, processing tower firing, handling gold and lives, and advancing waves.
- `Enemy` and its subclasses (`Grunt`, `Speedster`, `Tank`) represent different enemy types with varying movement and health.
- `Tower` and its subclasses (`BasicTower`, `RapidTower`, `SniperTower`) represent different tower types with distinct range, damage, cost, and firing behavior.
- `Waypoint` stores path points used by enemies to follow the road.
- `GameAssets` defines shared constants like path colors and the waypoint path layout.

## Key classes

- `Runner.java` - likely contains the application entry point and window setup.
- `GamePanel.java` - main drawing surface and game loop.
- `LevelManager.java` - game state management, enemy spawning, tower placement, and wave progression.
- `Enemy.java` - base enemy behavior, including movement, damage, and health.
- `Tower.java` - base tower behavior, including firing cooldowns and target selection.
- `BasicTower.java` - balanced, affordable tower implementation.
- `Waypoint.java` - path node used for enemy navigation.
- `GameAssets.java` - static game constants and path builder.

## Notes

- The current README description is based on the files available in the workspace.
- Some project files were not provided, so this summary focuses on the visible game architecture and behavior.
