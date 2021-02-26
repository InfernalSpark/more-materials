package InfernalSpark.more.materials;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

public class MoreMaterials implements ModInitializer {

	public static final Item STEEL_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item STEEL_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F, 6.0F).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES)); 
	public static ToolItem STEEL_PICKAXE = new SteelPick(SteelToolMaterials.INSTANCE, -1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem STEEL_SWORD = new SwordItem(SteelToolMaterials.INSTANCE, (int) 1.5F, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem STEEL_SHOVEL = new ShovelItem(SteelToolMaterials.INSTANCE, -0.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem STEEL_AXE = new SteelAxe(SteelToolMaterials.INSTANCE, 0.5F, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ToolItem STEEL_HOE = new SteelHoe(SteelToolMaterials.INSTANCE, -4, -1F, new Item.Settings().group(ItemGroup.TOOLS));
	public static ArmorItem STEEL_HELMET = new ArmorItem(SteelArmorMaterials.INSTANCE , EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
	public static ArmorItem STEEL_CHESTPLATE = new ArmorItem(SteelArmorMaterials.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
	public static ArmorItem STEEL_LEGGINGS = new ArmorItem(SteelArmorMaterials.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
	public static ArmorItem STEEL_BOOTS = new ArmorItem(SteelArmorMaterials.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

	public static final Block URANIUM_ORE = new UraniumOre(FabricBlockSettings.copy(Blocks.STONE));
	public static final Item URANIUM_ITEM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item UNSTABLE_URANIUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

	public static final Item INFERNIUM_ITEM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item INFERNIUM_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final ToolItem INFERNIUM_PICKAXE = new InferniumPick(InferniumToolMaterials.INSTANCE, 2, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final SwordItem INFERNIUM_SWORD = new SwordItem(InferniumToolMaterials.INSTANCE, 4, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ShovelItem INFERNIUM_SHOVEL = new ShovelItem(InferniumToolMaterials.INSTANCE, 2, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem INFERNIUM_AXE = new InferniumAxe(InferniumToolMaterials.INSTANCE, 6, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ToolItem INFERNIUM_HOE = new InferniumHoe(InferniumToolMaterials.INSTANCE, -4, 0, new Item.Settings().group(ItemGroup.TOOLS));
	public static final ArmorItem INFERNIUM_HELMET = new ArmorItem(InferniumArmorMaterials.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ArmorItem INFERNIUM_CHESTPLATE = new ArmorItem(InferniumArmorMaterials.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ArmorItem INFERNIUM_LEGGINGS = new ArmorItem(InferniumArmorMaterials.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
	public static final ArmorItem INFERNIUM_BOOTS = new ArmorItem(InferniumArmorMaterials.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

	private static ConfiguredFeature<?, ?> URANIUM_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, URANIUM_ORE.getDefaultState(), 4)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 15))).spreadHorizontally().repeat(1);

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("morematerials", "steel_ingot"), STEEL_INGOT);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "steel_nugget"), STEEL_NUGGET);
		Registry.register(Registry.BLOCK, new Identifier("morematerials", "steel_block"), STEEL_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "steel_block"), new BlockItem(STEEL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("morematerials", "steel_pickaxe"), STEEL_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "steel_sword"), STEEL_SWORD);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "steel_shovel"), STEEL_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "steel_axe"), STEEL_AXE);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "steel_hoe"), STEEL_HOE);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "steel_helmet"), STEEL_HELMET);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "steel_chestplate"), STEEL_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "steel_leggings"), STEEL_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "steel_boots"), STEEL_BOOTS);

		Registry.register(Registry.BLOCK, new Identifier("morematerials", "uranium_ore"), URANIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "uranium_ore"), new BlockItem(URANIUM_ORE, new Item.Settings().group(ItemGroup.MATERIALS)));
		Registry.register(Registry.ITEM, new Identifier("morematerials", "uranium_item"), URANIUM_ITEM);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "unstable_uranium"), UNSTABLE_URANIUM);

		Registry.register(Registry.ITEM, new Identifier("morematerials", "infernium_item"), INFERNIUM_ITEM);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "infernium_shard"), INFERNIUM_SHARD);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "infernium_pickaxe"), INFERNIUM_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "infernium_sword"), INFERNIUM_SWORD);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "infernium_shovel"), INFERNIUM_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "infernium_axe"), INFERNIUM_AXE);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "infernium_hoe"), INFERNIUM_HOE);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "infernium_helmet"), INFERNIUM_HELMET);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "infernium_chestplate"), INFERNIUM_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "infernium_leggings"), INFERNIUM_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("morematerials", "infernium_boots"), INFERNIUM_BOOTS);

		RegistryKey<ConfiguredFeature<?, ?>> uraniumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("morematerials", "uranium_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, uraniumOreOverworld.getValue(), URANIUM_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, uraniumOreOverworld);

		System.out.println("Hello world!");
	}
}
