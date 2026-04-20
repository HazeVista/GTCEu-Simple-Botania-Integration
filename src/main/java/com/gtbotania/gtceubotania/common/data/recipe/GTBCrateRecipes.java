package com.gtbotania.gtceubotania.common.data.recipe;

import com.gtbotania.gtceubotania.common.data.materials.GTBMaterials;
import com.gtbotania.gtceubotania.common.machine.crate.GTBCrates;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialEntry;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.plate;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.rodLong;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;

public class GTBCrateRecipes {

    public static final void init(Consumer<FinishedRecipe> provider) {
        register(provider);
    }

    private static void register(Consumer<FinishedRecipe> provider) {
        VanillaRecipeHelper.addShapedRecipe(provider, true,
                "manasteel_crate",
                GTBCrates.MANASTEEL_CRATE.asStack(),
                "RPR",
                "PhP",
                "RPR",
                'P', new MaterialEntry(plate, GTBMaterials.MANASTEEL),
                'R', new MaterialEntry(rodLong, GTBMaterials.MANASTEEL));

        ASSEMBLER_RECIPES.recipeBuilder("manasteel_crate")
                .EUt(16)
                .inputItems(rodLong, GTBMaterials.MANASTEEL, 4)
                .inputItems(plate, GTBMaterials.MANASTEEL, 4)
                .outputItems(GTBCrates.MANASTEEL_CRATE)
                .duration(200)
                .circuitMeta(1)
                .addMaterialInfo(true)
                .save(provider);

        VanillaRecipeHelper.addShapedRecipe(provider, true,
                "terrasteel_crate",
                GTBCrates.TERRASTEEL_CRATE.asStack(),
                "RPR",
                "PhP",
                "RPR",
                'P', new MaterialEntry(plate, GTBMaterials.TERRASTEEL),
                'R', new MaterialEntry(rodLong, GTBMaterials.TERRASTEEL));

        ASSEMBLER_RECIPES.recipeBuilder("terrasteel_crate")
                .EUt(16)
                .inputItems(rodLong, GTBMaterials.TERRASTEEL, 4)
                .inputItems(plate, GTBMaterials.TERRASTEEL, 4)
                .outputItems(GTBCrates.TERRASTEEL_CRATE)
                .duration(200)
                .circuitMeta(1)
                .addMaterialInfo(true)
                .save(provider);

        VanillaRecipeHelper.addShapedRecipe(provider, true,
                "elementium_crate",
                GTBCrates.ELEMENTIUM_CRATE.asStack(),
                "RPR",
                "PhP",
                "RPR",
                'P', new MaterialEntry(plate, GTBMaterials.ELEMENTIUM),
                'R', new MaterialEntry(rodLong, GTBMaterials.ELEMENTIUM));

        ASSEMBLER_RECIPES.recipeBuilder("elementium_crate")
                .EUt(16)
                .inputItems(rodLong, GTBMaterials.ELEMENTIUM, 4)
                .inputItems(plate, GTBMaterials.ELEMENTIUM, 4)
                .outputItems(GTBCrates.ELEMENTIUM_CRATE)
                .duration(200)
                .circuitMeta(1)
                .addMaterialInfo(true)
                .save(provider);

        VanillaRecipeHelper.addShapedRecipe(provider, true,
                "gaiasteel_crate",
                GTBCrates.GAIASTEEL_CRATE.asStack(),
                "RPR",
                "PhP",
                "RPR",
                'P', new MaterialEntry(plate, GTBMaterials.GAIASTEEL),
                'R', new MaterialEntry(rodLong, GTBMaterials.GAIASTEEL));

        ASSEMBLER_RECIPES.recipeBuilder("gaiasteel_crate")
                .EUt(16)
                .inputItems(rodLong, GTBMaterials.GAIASTEEL, 4)
                .inputItems(plate, GTBMaterials.GAIASTEEL, 4)
                .outputItems(GTBCrates.GAIASTEEL_CRATE)
                .duration(200)
                .circuitMeta(1)
                .addMaterialInfo(true)
                .save(provider);
    }
}
