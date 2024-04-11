package nl.rootdroid.tweakablelevels;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "TweakableLevels")
public class ModConfig implements ConfigData {
    public int requiredBaseExperience = 7;
    public int requiredExperiencePerLevel = 0;
}
