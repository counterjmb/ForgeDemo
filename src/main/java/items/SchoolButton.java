package items;

import java.util.Random;

import forgedemo.References;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class SchoolButton extends Item {

	String[] names = new String[] {"Aravind", "Chris", "Diego","David","Kelly", "LeighAnn", "Mounika", "Mike"};

	public SchoolButton() {

		setUnlocalizedName(References.ForgeDemoItems.SCHOOLBUTTON.getUnlocalizedName());
		setRegistryName(References.ForgeDemoItems.SCHOOLBUTTON.getRegistryName());
		setCreativeTab(getCreativeTab().DECORATIONS);

	}

	/**
	 * Called when the equipped item is right clicked.
	 */
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		
		Random rand = new Random();
		int i = rand.nextInt(7);
		
		Minecraft.getMinecraft().player.sendChatMessage("Hello " + names[i] + "!");
		return new ActionResult(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
	}

}
