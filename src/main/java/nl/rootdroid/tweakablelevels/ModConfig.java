package nl.rootdroid.tweakablelevels;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import org.slf4j.Logger;

@Config(name = "TweakableLevels")
public class ModConfig implements ConfigData {
    float requiredExperienceBase = 5.0f;
    float requiredExperienceLinear = 1.0f;
    float requiredExperienceExponential = 0.087f;

    public int getRequiredExperience(int level){
        double experience = requiredExperienceBase + level * requiredExperienceLinear + Math.pow(level, 2) * requiredExperienceExponential;
        return (int)experience;
    }

    public void logConfig(){
        Logger logger = TweakableLevels.getLogger();
        logger.info("Experience config: base {}, linear {}, exponential {}", requiredExperienceBase, requiredExperienceLinear, requiredExperienceExponential);
        logger.info("Required for level 1: {}", getRequiredExperience(1));
        logger.info("Required for level 15: {}", getRequiredExperience(15));
        logger.info("Required for level 30: {}", getRequiredExperience(30));
    }
}
