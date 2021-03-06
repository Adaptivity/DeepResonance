package mcjty.deepresonance.blocks.crystalizer;

import cpw.mods.fml.common.registry.GameRegistry;
import mcjty.deepresonance.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CrystalizerSetup {
    public static CrystalizerBlock crystalizer;

    public static void setupBlocks() {
        crystalizer = new CrystalizerBlock("crystalizerBlock");
        crystalizer.registerTile().register();
    }

    public static void setupCrafting() {
        GameRegistry.addRecipe(new ItemStack(crystalizer), "ggg", "qMq", "iii", 'M', ModBlocks.machineFrame, 'g', Blocks.glass, 'q', Items.quartz, 'i', Items.iron_ingot);
    }
}
