package net.sebi.tutorialmod.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sebi.tutorialmod.TutorialMod;
import net.sebi.tutorialmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters,p0utput) -> {

                        p0utput.accept(ModItems.SAPPHIRE.get());
                        p0utput.accept(ModItems.RAW_SAPPHIRE.get());
                        p0utput.accept(ModItems.AUREL.get());
                        p0utput.accept(ModItems.TOADER.get());
                        p0utput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        p0utput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        p0utput.accept(ModBlocks.AUREL_BLOCK.get());
                        p0utput.accept(ModBlocks.PEUL_BLOCK.get());
                        p0utput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        p0utput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        p0utput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        p0utput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                        p0utput.accept(ModItems.METAL_DETECTOR.get());
                        p0utput.accept(ModBlocks.SOUND_BLOCK.get());
                        p0utput.accept(ModItems.STRAWBERRY.get());
                        p0utput.accept(ModItems.PINE_CONE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
