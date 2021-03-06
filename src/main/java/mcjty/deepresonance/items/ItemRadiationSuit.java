package mcjty.deepresonance.items;

import mcjty.deepresonance.DeepResonance;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Elec332 on 29-9-2015.
 */
public class ItemRadiationSuit extends ItemArmor {

    public ItemRadiationSuit(ArmorMaterial material, int renderIndex, int armorType, String name) {
        super(material, renderIndex, armorType);
        setUnlocalizedName(name);
        this.name = name;
        setTextureName(DeepResonance.MODID+":"+name);
        setCreativeTab(DeepResonance.tabDeepResonance);
    }

    private String name;

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        int i = armorType == 2 ? 2 : 1;
        return DeepResonance.MODID+":textures/items/"+name+"-"+i+".png";
    }

    @Override
    public String getUnlocalizedName() {
        return super.getUnlocalizedName() + armorType;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return getUnlocalizedName();
    }

    @Override
    public boolean getIsRepairable(ItemStack p_82789_1_, ItemStack p_82789_2_) {
        return false;
    }

    public static int countSuitPieces(EntityLivingBase entity){
        int cnt = 0;
        for (int i = 1; i < 5; i++) {
            ItemStack stack = entity.getEquipmentInSlot(i);
            if (stack != null && (stack.getItem() instanceof ItemRadiationSuit)) {
                cnt++;
            }
        }
        return cnt;
    }
}
