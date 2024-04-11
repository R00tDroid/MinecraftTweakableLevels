package nl.rootdroid.tweakablelevels;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "TweakableLevels")
public class ModConfig implements ConfigData {
    public int baseExperience = 7;
    public int experiencePerLevel = 0;
}
