package tk.hywt.block;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;
import tk.hywt.item.HywtItems;

public class QiuOre extends BlockOre {
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return HywtItems.Qiu;
	}
	@Override
public int quantityDropped(Random rand) {
	return rand.nextInt(4)+1;
}
}
