package nl.rootdroid.tweakablelevels;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import org.slf4j.Logger;

@Config(name = "TweakableLevels")
public class ModConfig implements ConfigData {
    int requiredBaseExperience = 6;
    float requiredExperiencePerLevel = 0.2f;

    public int getRequiredExperience(int level){
        return requiredBaseExperience + (int)(level * requiredExperiencePerLevel);
    }

    public void logConfig(){
        Logger logger = TweakableLevels.getLogger();
        logger.info("Base experience: {}", requiredBaseExperience);
        logger.info("Experience per level: {}", requiredExperiencePerLevel);
        logger.info("Required for level 1: {}", getRequiredExperience(1));
        logger.info("Required for level 15: {}", getRequiredExperience(15));
        logger.info("Required for level 30: {}", getRequiredExperience(30));
    }
}
