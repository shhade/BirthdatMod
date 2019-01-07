package occmod.init.birthday;

import occmod.Main;
import occmod.Reference;
import occmod.init.blocks.CustomOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

//initialize block

public class BlockInit {

/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    //GIVING YOUR BLOCK A CRAFTING RECIPE
    
        public static void Recipitate() {
            GameRegistry.addRecipe(new ItemStack(birthday_cake_block, 1), new Object[]
                    {
                            "YYY",
                            "XXX",
                            "YYY",
                        'Y', Blocks.SANDSTONE,
                        'X', Blocks.SAND,
                    }); 
        }
        
    // -----------------------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
        
    //TELLING MINECRAFT ABOUT YOUR BLOCK    
        
        public static Block birthday_cake_block;
            
        public static void init() {
        	birthday_cake_block = new CustomOre("birthday_cake_block", 3.0F, 4.0F, 2);
        }
        
    // -----------------------------------
        
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    // PUT YOUR BLOCK IN MINECRAFT WITH ICONS AND REGISTERING IT
        
    public static void register() {

        registerBlock(birthday_cake_block);
    }
    
    public static void registerBlock(Block block) {
        GameRegistry.register(block);
        block.setCreativeTab(CreativeTabs.DECORATIONS);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
        
        }
    
    public static void registerRenders() {
        registerRender(birthday_cake_block);
    }
    
    public static void registerRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + 
        block.getUnlocalizedName().substring(5)));
        
        
    }
}
    