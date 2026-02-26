package com.gtbotania.gtceubotania.common.data;

import static com.gtbotania.gtceubotania.GTBotania.GTB_CREATIVE_TAB;
import static com.gtbotania.gtceubotania.common.registry.GTBRegistry.REGISTRATE;

@SuppressWarnings("all")
public class GTBotaniaItems {

    static {
        REGISTRATE.creativeModeTab(() -> GTB_CREATIVE_TAB);
    }

    public static void init() {}
}
