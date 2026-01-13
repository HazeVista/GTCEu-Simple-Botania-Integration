package com.gtbotania.gtceubotania.datagen;

import com.gtbotania.gtceubotania.datagen.lang.GTBLangHandler;
import com.tterrag.registrate.providers.ProviderType;

import static com.gtbotania.gtceubotania.common.registry.GTBRegistry.REGISTRATE;

public class GTBDatagen {

    public static void init() {
        REGISTRATE.addDataGenerator(ProviderType.LANG, GTBLangHandler::init);
    }

}
