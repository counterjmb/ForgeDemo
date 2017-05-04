package init;

import items.SchoolButton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item schoolButton;

	public static void init() {
		schoolButton = new SchoolButton();

	}

	public static void register() {
		GameRegistry.register(schoolButton);
	}

	public static void registerRenders() {
		registerRender(schoolButton);
	}

	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
