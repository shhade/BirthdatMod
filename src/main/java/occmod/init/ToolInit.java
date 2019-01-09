package occmod.init;

import occmod.Main;
import occmod.Reference;
import occmod.init.items.CustomShovel;
import occmod.init.tools.CustomAxe;
import occmod.init.tools.CustomHoe;
import occmod.init.tools.CustomPickaxe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToolInit {
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    // GIVING YOUR TOOLS SOME RECIPES
    
    public static void Recipitate() {
    
    
        // PICKAXE RECIPE
    
        /** GameRegistry.addRecipe(new ItemStack(occ_pickaxe, 1), new Object[]
                {
                        "   ",
                        "   ",
                        "   ",
                    'S', ItemInit.occitem_ingot,
                    'X', Items.STICK
                    
                    }); **/
                    
                    
         // SWORD RECIPE           
                    
         /** GameRegistry.addRecipe(new ItemStack(occ_sword, 1), new Object[]
                {
                        "   ",
                        "   " ,
                        "   ",
                     'S', ItemInit.occitem_ingot,
                     'X', Items.STICK
                     
                    }); **/
                    
          
         // AXE RECIPE 
                        
         /** GameRegistry.addRecipe(new ItemStack(occ_axe, 1), new Object[]
                 {
                        "   ",
                        "   ",
                        "   ",
                      'S', ItemInit.occitem_ingot,
                      'X', Items.STICK
                      
                     }); **/
                     
        
         // SHOVEL RECIPE 
                                
         /** GameRegistry.addRecipe(new ItemStack(occ_shovel, 1), new Object[]
                 {
                         "   ",
                         "   ",
                         "   ",
                      'S', ItemInit.occitem_ingot,
                      'X', Items.STICK
                      
                      }); **/
                      
                      
          // HOE RECIPE
                                        
          /** GameRegistry.addRecipe(new ItemStack(occ_hoe, 1), new Object[]
                 {
                         "   ",
                         "   ",
                         "   ",
                      'S', ItemInit.occitem_ingot,
                      'X', Items.STICK
                      
                      }); **/
    }
    
    // -----------------------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    // TELLING MINECRAFT ABOUT YOUR TOOLS (SWORD. PICAXE. AXE, HOE, SHOVEL)
    
public static final ToolMaterial chicken = EnumHelper.addToolMaterial("chicken", 2, 10, 2.F, 3.F, 1);
    
    public static Item chicken_axe;
    public static Item chicken_pickaxe;
    public static Item chicken_shovel;
    public static Item chicken_sword;
    public static Item chicken_hoe;

    public static void init() {
    
    	chicken_axe = new CustomAxe("chicken_axe", chicken);
    	chicken_pickaxe = new CustomPickaxe("chicken_pickaxe", chicken);
    	chicken_shovel = new CustomShovel("chicken_shovel", chicken);
    	chicken_sword = new CustomShovel("chicken_sword", chicken);
    	chicken_hoe = new CustomHoe("chicken_hoe", chicken);
        
    }
    
    // ---------------------------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    // PUTTING YOUR TOOLSET INSIDE OF MINECRAFT
    
    public static void register() {
          registerItem(chicken_axe);
          registerItem(chicken_pickaxe);
          registerItem(chicken_hoe);
          registerItem(chicken_shovel);
          registerItem(chicken_sword);
    }
    
    public static void registerItem(Item item) {
        GameRegistry.register(item);
        item.setCreativeTab(CreativeTabs.TOOLS);
        
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
        new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    
    // ----------------------------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    
}