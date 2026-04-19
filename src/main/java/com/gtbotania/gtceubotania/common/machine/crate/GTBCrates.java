package com.gtbotania.gtceubotania.common.machine.crate;

import com.gtbotania.gtceubotania.common.data.materials.GTBMaterials;

import com.gregtechceu.gtceu.api.machine.MachineDefinition;

import static com.gregtechceu.gtceu.common.data.machines.GTMachineUtils.registerCrate;
import static com.gtbotania.gtceubotania.common.registry.GTBRegistry.REGISTRATE;

public class GTBCrates {

    public static MachineDefinition MANASTEEL_CRATE;
    public static MachineDefinition TERRASTEEL_CRATE;
    public static MachineDefinition ELEMENTIUM_CRATE;
    public static MachineDefinition GAIASTEEL_CRATE;

    public static void register() {
        MANASTEEL_CRATE = registerCrate(REGISTRATE, GTBMaterials.MANASTEEL, 90, "Manasteel Crate");
        TERRASTEEL_CRATE = registerCrate(REGISTRATE, GTBMaterials.TERRASTEEL, 108, "Terrasteel Crate");
        ELEMENTIUM_CRATE = registerCrate(REGISTRATE, GTBMaterials.ELEMENTIUM, 144, "Elementium Crate");
        GAIASTEEL_CRATE = registerCrate(REGISTRATE, GTBMaterials.GAIASTEEL, 180, "Gaiasteel Crate");
    }
}
