package net.sebi.tutorialmod.items;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sebi.tutorialmod.TutorialMod;
import net.sebi.tutorialmod.items.custom.FuelItem;
import net.sebi.tutorialmod.items.custom.MetalDetectorItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);
///----------------------------------------------------------------------------------------------------------------------------

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOADER = ITEMS.register("toader",
            () -> new Item(new Item.Properties()));

/// Custom item
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
        () -> new MetalDetectorItem(new Item.Properties().durability(100)));

/// Food item
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
        () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
    public static final RegistryObject<Item> AUREL = ITEMS.register("aurel",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

/// Fuel item
    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
        () -> new FuelItem(new Item.Properties(), 400));

/// 2D inv, 3D hand
    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
        () -> new Item(new Item.Properties().stacksTo(1)));

/// tools
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
        () -> new SwordItem(ModToolTiers.SAPPHIRE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.SAPPHIRE, 10, 2f))));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, new Item.Properties().stacksTo(1)));

///------------------------------------------------------------------------------------------------------------------------------
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
