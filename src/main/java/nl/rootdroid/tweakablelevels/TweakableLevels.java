package nl.rootdroid.tweakablelevels;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

public class TweakableLevels implements ModInitializer {
    private static final Logger logger = LoggerFactory.getLogger("tweakable-levels");
    private static ModConfig config;

    @Override
    public void onInitialize() {
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
        config.logConfig();
    }

    public static ModConfig getConfig(){
        return config;
    }

    public static Logger getLogger(){
        return logger;
    }
}
