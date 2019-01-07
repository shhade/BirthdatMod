package occmod.handlers.birthday;

//import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import occmod.init.birthday.BlockInit;
import occmod.init.birthday.ItemInit;

public class RegistryHandler {
    
    public static void Client() {
        ItemInit.register();
    	BlockInit.registerRenders();
    }
    
    public static void Common() {
    	ItemInit.init();
    	BlockInit.init();
    	BlockInit.register();
    	ItemInit.Recipitate();
    	BlockInit.Recipitate();
    }
    
}