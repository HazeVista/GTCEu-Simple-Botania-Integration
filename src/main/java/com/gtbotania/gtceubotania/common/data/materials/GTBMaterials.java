package com.gtbotania.gtceubotania.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gtbotania.gtceubotania.GTBotania;
import com.gtbotania.gtceubotania.common.GTVoltage;
import org.zeith.botanicadds.init.BlocksBA;
import org.zeith.botanicadds.init.ItemsBA;
import vazkii.botania.common.block.BotaniaBlocks;
import vazkii.botania.common.item.BotaniaItems;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class GTBMaterials {

    private static final long[] V = GTValues.V;
    private static final int[] VA = GTValues.VA;

    public static Material MANA;
    public static Material MANASTEEL;
    public static Material MANA_DIAMOND;
    public static Material DRAGONSTONE;
    public static Material TERRASTEEL;
    public static Material DORMANT_TERRASTEEL;
    public static Material ELEMENTIUM;
    public static Material GAIASTEEL;
    public static Material AETHER;

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
                .gas()
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
                .fluidPipeProperties(3776, 400, true, true, true, true)
                .color(0x8c2929).iconSet(BRIGHT)
                // .components(VESNIUM, )
                .buildAndRegister();
    }

    public static void init() {

        // botania/additions
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

        ingot.setIgnored(GAIASTEEL, ItemsBA.GAIASTEEL_INGOT);
        nugget.setIgnored(GAIASTEEL, ItemsBA.GAIASTEEL_NUGGET);
        block.setIgnored(GAIASTEEL, BlocksBA.GAIASTEEL_BLOCK);
}
}
