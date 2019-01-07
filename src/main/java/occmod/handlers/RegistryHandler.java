package occmod.handlers;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import occmod.init.BlockInit;
import occmod.init.ItemInit;

public class RegistryHandler {
    
    public static void Client() {
    	ItemInit.register();
    	//occmod.init.birthday.ItemInit.register();
    	BlockInit.registerRenders();
    	//occmod.init.birthday.BlockInit.registerRenders();
    }
    
    public static void Common() {
    	ItemInit.init();
    	//occmod.init.birthday.ItemInit.init();
    	BlockInit.init();
    	//occmod.init.birthday.BlockInit.init();
    	BlockInit.register();
    	//occmod.init.birthday.BlockInit.register();
    	ItemInit.Recipitate();
    	//occmod.init.birthday.ItemInit.Recipitate();
    	BlockInit.Recipitate();
    	//occmod.init.birthday.BlockInit.Recipitate();
    	
    }
    
}