package occmod.init.birthday;

import occmod.Main;
import occmod.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import occmod.init.items.CustomIngot;

public class ItemInit {
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    //MAKING A CRAFTING RECIPE

        public static void Recipitate() {
            GameRegistry.addRecipe(new ItemStack(birthday_cake_ingot, 1), new Object[]
                    {
                            "SSS",
                            "SSS",
                            "SSS",
                        'S', Items.FEATHER,
                    });

        }
        
        //----------------------
        
/** ------------------------------------------------------------------------------------------------------------------------------- **/
        
    //TELLING MINECRAFT ABOUT YOUR ITEM
    
    public static Item birthday_cake_ingot;

    public static void init() {
    	birthday_cake_ingot = new CustomIngot("birthday_cake_ingot");
    }
    
    //----------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    

    //PUT YOUR ITEM IN MINECRAFT WITH ICONS AND REGISTER
    
    public static void register() {
        registerItem(birthday_cake_ingot);
    }
    
    public static void registerItem(Item item) {
        GameRegistry.register(item);
        
        //------------------------
        
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
        new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    

}
