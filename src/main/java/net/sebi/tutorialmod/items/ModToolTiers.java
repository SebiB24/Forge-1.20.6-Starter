package net.sebi.tutorialmod.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.sebi.tutorialmod.util.ModTags;

public class ModToolTiers {
    public static final Tier SAPPHIRE = new ForgeTier(2000,10f,4f, 25,
            ModTags.Blocks.NEEDS_SAPPHIRE_TOOL,
            () -> Ingredient.of(ModItems.SAPPHIRE.get()), ModTags.Blocks.INCORECT_FOR_SAPPHIRE_TOOL);
}
