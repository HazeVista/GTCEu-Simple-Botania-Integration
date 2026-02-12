package com.gtbotania.gtceubotania.common.data.materials;

import com.gtbotania.gtceubotania.GTBotania;
import com.gtbotania.gtceubotania.common.GTVoltage;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;

import com.astro.core.common.data.materials.AstroMaterialFlags;
import org.zeith.botanicadds.init.BlocksBA;
import org.zeith.botanicadds.init.ItemsBA;
import vazkii.botania.common.block.BotaniaBlocks;
import vazkii.botania.common.item.BotaniaItems;

import static com.astro.core.common.data.materials.AstroMaterials.VESNIUM;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.api.item.tool.GTToolType.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class GTBMaterials {

    private static final long[] V = GTValues.V;

    public static Material MANA;
    public static Material MANASTEEL;
    public static Material MANA_DIAMOND;
    public static Material DRAGONSTONE;
    public static Material TERRASTEEL;
    public static Material DORMANT_TERRASTEEL;
    public static Material ELEMENTIUM;
    public static Material GAIASTEEL;
    public static Material AETHER;
    public static Material GAIAFORGED_NAQUADAH;

    public static void register() {
        // Botania
        MANA = new Material.Builder(
                GTBotania.id("mana"))
                .langValue("Mana")
                .dust()
                .flags(DISABLE_MATERIAL_RECIPES)
                .element(GTBElements.MN).formula("✨")
                .color(0x00fbff)
                .buildAndRegister();

        AETHER = new Material.Builder(
                GTBotania.id("aether"))
                .langValue("§3Æther§r")
                .gas(new FluidBuilder().customStill())
                .element(GTBElements.AE).formula("✨")
                .color(0x26a33f)
                .buildAndRegister();

        MANA_DIAMOND = new Material.Builder(
                GTBotania.id("mana_diamond"))
                .langValue("Mana Diamond")
                .gem()
                .flags(GENERATE_LENS, GENERATE_PLATE, CRYSTALLIZABLE, DISABLE_DECOMPOSITION)
                .components(Carbon, 1, MANA, 1).formula("C✨")
                .color(0x47eaed).iconSet(DIAMOND)
                .buildAndRegister();

        DRAGONSTONE = new Material.Builder(
                GTBotania.id("dragonstone"))
                .langValue("Dragonstone")
                .gem()
                .flags(GENERATE_LENS, GENERATE_PLATE, CRYSTALLIZABLE, DISABLE_DECOMPOSITION)
                .components(Carbon, 1, AETHER, 1).formula("C✨")
                .color(0xed64d4).iconSet(DIAMOND)
                .buildAndRegister();

        MANASTEEL = new Material.Builder(
                GTBotania.id("manasteel"))
                .langValue("§9Manasteel")
                .ingot()
                .fluid()
                .blastTemp(1000, BlastProperty.GasTier.LOW, 120, 400)
                .flags(GENERATE_FRAME, GENERATE_GEAR, DISABLE_DECOMPOSITION, GENERATE_PLATE,
                        GENERATE_ROD, MORTAR_GRINDABLE, DISABLE_ALLOY_BLAST, DISABLE_ALLOY_PROPERTY)
                .toolStats(new ToolProperty(9.0F, 8.0F, 768, 3,
                        new GTToolType[] { PICKAXE, AXE, HOE, SHOVEL, SWORD, MINING_HAMMER, SPADE, SAW,
                                HARD_HAMMER, WRENCH, FILE, CROWBAR, SCREWDRIVER, MORTAR, WIRE_CUTTER,
                                SCYTHE, KNIFE, BUTCHERY_KNIFE, DRILL_EV, DRILL_HV, DRILL_LV, DRILL_IV,
                                DRILL_MV, CHAINSAW_LV, WRENCH_LV, WRENCH_HV, WRENCH_IV, BUZZSAW,
                                SCREWDRIVER_LV, WIRE_CUTTER_LV, WIRE_CUTTER_HV, WIRE_CUTTER_IV }))
                .fluidPipeProperties(1855, 150, true, false, false, false)
                .color(0x228cc9).iconSet(SHINY)
                .components(Steel, 1, MANA, 1).formula("Fe✨")
                .buildAndRegister();

        DORMANT_TERRASTEEL = new Material.Builder(
                GTBotania.id("dormant_terrasteel"))
                .langValue("Dormant §2Terrasteel§r")
                .dust()
                .components(Steel, 1, Beryllium, 1, Aluminium, 1).formula("FeBeAl")
                .color(0x128719)
                .buildAndRegister();

        TERRASTEEL = new Material.Builder(
                GTBotania.id("terrasteel"))
                .langValue("§2Terrasteel")
                .ingot()
                .fluid()
                .blastTemp(1700, BlastProperty.GasTier.LOW, (int) GTVoltage.VA.MV, 800)
                .flags(GENERATE_FRAME, GENERATE_GEAR, DISABLE_DECOMPOSITION, GENERATE_PLATE,
                        GENERATE_ROD, DISABLE_ALLOY_BLAST, DISABLE_ALLOY_PROPERTY)
                .toolStats(new ToolProperty(11.0F, 14.0F, 1024, 4,
                        new GTToolType[] { PICKAXE, AXE, HOE, SHOVEL, SWORD, MINING_HAMMER, SPADE, SAW,
                                HARD_HAMMER, WRENCH, FILE, CROWBAR, SCREWDRIVER, MORTAR, WIRE_CUTTER,
                                SCYTHE, KNIFE, BUTCHERY_KNIFE, DRILL_EV, DRILL_HV, DRILL_LV, DRILL_IV,
                                DRILL_MV, CHAINSAW_LV, WRENCH_LV, WRENCH_HV, WRENCH_IV, BUZZSAW,
                                SCREWDRIVER_LV, WIRE_CUTTER_LV, WIRE_CUTTER_HV, WIRE_CUTTER_IV }))
                .fluidPipeProperties(2142, 225, true, false, false, false)
                .color(0x159e1e).iconSet(BRIGHT)
                .components(Steel, 1, Beryllium, 1, Aluminium, 1, MANA, 1)
                .formula("FeBeAl✨")
                .buildAndRegister();

        ELEMENTIUM = new Material.Builder(
                GTBotania.id("elementium"))
                .langValue("§dAlfsteel")
                .ingot()
                .fluid()
                .toolStats(ToolProperty.Builder.of(20.0F, 16.0F, 2048, 5)
                        .types(PICKAXE, AXE, HOE, SHOVEL, SWORD, MINING_HAMMER, SPADE, SAW,
                                HARD_HAMMER, WRENCH, FILE, CROWBAR, SCREWDRIVER, MORTAR, WIRE_CUTTER,
                                SCYTHE, KNIFE, BUTCHERY_KNIFE, DRILL_EV, DRILL_HV, DRILL_LV, DRILL_IV,
                                DRILL_MV, CHAINSAW_LV, WRENCH_LV, WRENCH_HV, WRENCH_IV, BUZZSAW,
                                SCREWDRIVER_LV, WIRE_CUTTER_LV, WIRE_CUTTER_HV, WIRE_CUTTER_IV)
                        .magnetic().build())
                .blastTemp(3500, BlastProperty.GasTier.MID, (int) GTVoltage.VA.IV, 1600)
                .flags(GENERATE_FRAME, GENERATE_GEAR, DISABLE_DECOMPOSITION, GENERATE_PLATE, GENERATE_ROD)
                .fluidPipeProperties(2426, 300, true, false, false, false)
                .color(0xed64d4).iconSet(SHINY)
                .components(Titanium, 3, Rhodium, 2, DRAGONSTONE, 1)
                .formula("Ti3Rh2C✨")
                .buildAndRegister();

        GAIASTEEL = new Material.Builder(
                GTBotania.id("gaiasteel"))
                .langValue("§cGaiasteel")
                .ingot()
                .fluid()
                .blastTemp(7100, BlastProperty.GasTier.HIGH, (int) GTVoltage.VA.ZPM, 2400)
                .flags(GENERATE_FRAME, GENERATE_GEAR, DISABLE_DECOMPOSITION, GENERATE_PLATE, GENERATE_ROD,
                        DISABLE_ALLOY_BLAST)
                .toolStats(ToolProperty.Builder.of(48.0F, 22.0F, 4096, 6)
                        .types(PICKAXE, AXE, HOE, SHOVEL, SWORD, MINING_HAMMER, SPADE, SAW,
                                HARD_HAMMER, WRENCH, FILE, CROWBAR, SCREWDRIVER, MORTAR, WIRE_CUTTER,
                                SCYTHE, KNIFE, BUTCHERY_KNIFE, DRILL_EV, DRILL_HV, DRILL_LV, DRILL_IV,
                                DRILL_MV, CHAINSAW_LV, WRENCH_LV, WRENCH_HV, WRENCH_IV, BUZZSAW,
                                SCREWDRIVER_LV, WIRE_CUTTER_LV, WIRE_CUTTER_HV, WIRE_CUTTER_IV)
                        .magnetic().build())
                .fluidPipeProperties(3776, 400, true, true, true, true)
                .color(0x8c2929).iconSet(BRIGHT)
                .components(ELEMENTIUM, 8, VESNIUM, 6, Duranium, 3, TitaniumTungstenCarbide, 2, AETHER, 1)
                .buildAndRegister();

        GAIAFORGED_NAQUADAH = new Material.Builder(GTBotania.id("gaiaforged_naquadah"))
                .langValue("Gaia-Forged Naquadah")
                .ingot().liquid(2774)
                .color(0x7a1d29).secondaryColor(0x000000).iconSet(SHINY)
                .blastTemp(7100, BlastProperty.GasTier.HIGH, 491520, 1800)
                .cableProperties(V[GTValues.ZPM], 64, 0, true)
                .rotorStats(1100, 380, 3, 32000)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, DISABLE_ALLOY_PROPERTY,
                        GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_RING,
                        GENERATE_SMALL_GEAR, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_SPRING,
                        AstroMaterialFlags.GENERATE_COMPRESSED_SPRING)
                .components(Naquadria, 1, GAIASTEEL, 1)
                .buildAndRegister();
    }

    public static void init() {
        dust.setIgnored(MANA, () -> BotaniaItems.manaPowder);

        gem.setIgnored(MANA_DIAMOND, () -> BotaniaItems.manaDiamond);
        block.setIgnored(MANA_DIAMOND, () -> BotaniaBlocks.manaDiamondBlock);

        gem.setIgnored(DRAGONSTONE, () -> BotaniaItems.dragonstone);
        block.setIgnored(DRAGONSTONE, () -> BotaniaBlocks.dragonstoneBlock);

        ingot.setIgnored(MANASTEEL, () -> BotaniaItems.manaSteel);
        nugget.setIgnored(MANASTEEL, () -> BotaniaItems.manasteelNugget);
        block.setIgnored(MANASTEEL, () -> BotaniaBlocks.manasteelBlock);

        ingot.setIgnored(TERRASTEEL, () -> BotaniaItems.terrasteel);
        block.setIgnored(TERRASTEEL, () -> BotaniaBlocks.terrasteelBlock);
        nugget.setIgnored(TERRASTEEL, () -> BotaniaItems.terrasteelNugget);

        ingot.setIgnored(ELEMENTIUM, () -> BotaniaItems.elementium);
        block.setIgnored(ELEMENTIUM, () -> BotaniaBlocks.elementiumBlock);
        nugget.setIgnored(ELEMENTIUM, () -> BotaniaItems.elementiumNugget);

        ingot.setIgnored(GAIASTEEL, () -> {
            try {
                return ItemsBA.GAIASTEEL_INGOT;
            } catch (Exception e) {
                return null;
            }
        });
        nugget.setIgnored(GAIASTEEL, () -> {
            try {
                return ItemsBA.GAIASTEEL_NUGGET;
            } catch (Exception e) {
                return null;
            }
        });
        block.setIgnored(GAIASTEEL, () -> {
            try {
                return BlocksBA.GAIASTEEL_BLOCK;
            } catch (Exception e) {
                return null;
            }
        });
    }
}
