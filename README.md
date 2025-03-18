# TutorialMod - A Minecraft Mod

Welcome to **TutorialMod**, a custom Minecraft mod built using **Forge** and written in **Java**. This mod introduces a variety of new **blocks, items, tools, and mechanics** to enhance your Minecraft experience.

---

## Features

### Blocks
- **Sapphire Block** – A decorative block made from sapphire.
- **Raw Sapphire Block** – Crafted from raw sapphire.
- **Sapphire Ore** – Found in multiple dimensions: Overworld, Nether, and End.
- **Deepslate Sapphire Ore** – A deepslate variant of sapphire ore.
- **Nether Sapphire Ore** – Found exclusively in the Nether.
- **End Stone Sapphire Ore** – Found in the End.
- **Sound Block** – Plays a custom sound when interacted with.
- **Sapphire Variants** – Stairs, slabs, buttons, pressure plates, fences, fence gates, walls, doors, and trapdoors for detailed building options.

### Items
- **Sapphire** – A valuable gem used for crafting.
- **Raw Sapphire** – Unrefined sapphire obtained from mining.
- **Metal Detector** – Helps locate valuable blocks underground.
- **Strawberry** – A food item that provides a speed boost when consumed.
- **Pine Cone** – A fuel item with high burn time.
- **Sapphire Staff** – A special item with future potential abilities.
- **Sapphire Tools** – A complete set of tools (sword, pickaxe, axe, shovel, hoe) made from sapphire.

### Mechanics
- **Metal Detector Functionality** – Detects valuable blocks and provides coordinates.
- **Sound Block Interaction** – Plays a custom sound when used.
- **Custom Food Effects** – Strawberries grant a temporary speed boost when eaten.

### Creative Tab
- **Tutorial Tab** – A dedicated tab in Creative Mode organizing all custom blocks and items from TutorialMod.

---

## How the Mod Was Made

### Development Environment
- **Java** – The mod is written in Java, leveraging the Minecraft Forge API.
- **Minecraft Forge** – Provides tools and libraries to extend Minecraft's functionality.
- **Gradle** – Used for building and managing dependencies.

### Key Components

#### Blocks and Items
- Custom blocks and items are registered using **DeferredRegister** to ensure they are properly added to the game.
- Each block and item has its own class, extending Minecraft's base classes like `Block` and `Item`.

#### Custom Mechanics
- **Metal Detector** – Scans for valuable blocks below the player and provides feedback. It uses a custom method to check block states and tags.
- **Sound Block** – Plays a sound when interacted with, utilizing Minecraft's sound events.

#### Data Generation
- The mod includes **data generators** for block states, item models, loot tables, and recipes, ensuring seamless integration into the game.
- `ModBlockStateProvider`, `ModItemModelProvider`, and `ModRecipeProvider` handle the generation of these assets.

#### Creative Tab
- A custom **creative tab** organizes all new blocks and items, registered using `DeferredRegister`.

#### Tags
- **Custom tags** are defined for blocks and items to support functionalities like the metal detector and tool requirements.
- Tags group blocks based on mining tool requirements and other properties.

#### Tools and Armor
- Custom tools and armor sets are created using `ModToolTiers`, defining properties like **durability, mining speed, and attack damage**.

### Code Structure
- **Main Mod Class (`TutorialMod`)** – Initializes the mod and registers event listeners.
- **Block and Item Classes** – Define the properties and behaviors of custom blocks and items.
- **Data Generators** – Automate the creation of JSON files for block states, models, and recipes.
- **Event Handlers** – Manage custom events, such as server startup and client setup.

---

## Getting Started

### Prerequisites
Before installing the mod, ensure you have the following:
- **Minecraft Forge** – Install the appropriate version.
- **Java Development Kit (JDK)** – Required for compiling and running the mod.

### Installation
1. **Clone the Repository**

2. **Build the Mod**
   Navigate to the project directory and run:
   ```bash
   ./build.gradle
   ```

3. **Install the Mod**
   Copy the generated `.jar` file from the `build/libs` directory to your Minecraft `mods` folder.

### Usage
- Launch **Minecraft** with Forge.
- Select the mod from the **Mods List**.
- Enjoy exploring new **blocks, items, and mechanics** in your world!

---

## Contributing
We welcome contribut
