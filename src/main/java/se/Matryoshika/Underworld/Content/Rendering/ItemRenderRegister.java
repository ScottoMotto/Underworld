package se.Matryoshika.Underworld.Content.Rendering;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import se.Matryoshika.Underworld.Content.ContentRegistry;

public class ItemRenderRegister {
	
	public static void registerItemRenderer(){
		for(Item item : ContentRegistry.ItemList){
			reg(item);
		}
	}
	
	public static void reg(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
