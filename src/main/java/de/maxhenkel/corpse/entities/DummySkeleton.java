package de.maxhenkel.corpse.entities;

import de.maxhenkel.corpse.CorpseMod;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.skeleton.Skeleton;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.EnumMap;

public class DummySkeleton extends Skeleton {

    public DummySkeleton(Level world, EnumMap<EquipmentSlot, ItemStack> equipment) {
        super(EntityTypes.SKELETON, world);
        if (CorpseMod.SERVER_CONFIG.renderEquipment.get()) {
            for (EnumMap.Entry<EquipmentSlot, ItemStack> entry : equipment.entrySet()) {
                setItemSlot(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override
    public int getId() {
        return Integer.MIN_VALUE;
    }
}
