package exnihilocreatio.recipes.yaml.yamlRecipeClasses;

import exnihilocreatio.recipes.yaml.yamlRecipeClasses.prefab.YamlItemChanceRecipe;

public class YamlHammerRecipe extends YamlItemChanceRecipe {
    public int miningLevel = 0;
    public float fortuneChance = 0;

    public YamlHammerRecipe(String item, int miningLevel, float chance, float fortuneChance) {
        super(item, chance);
        this.miningLevel = miningLevel;
        this.fortuneChance = fortuneChance;
    }
}