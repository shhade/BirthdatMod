package occmod.init.blocks;

import occmod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

//MAKING YOUR BLOCK EXTEND MINECRAFT'S BLOCK CLASS

public class CustomBlock extends Block{

    public CustomBlock(String name, float hardness, float resistance) {
        super(Material.ROCK);
        
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        }
    
}
