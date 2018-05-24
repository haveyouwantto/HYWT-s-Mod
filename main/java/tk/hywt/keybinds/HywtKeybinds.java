package tk.hywt.keybinds;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class HywtKeybinds
{
    public static KeyBinding spawn;
 
    public static void register()
    {
        spawn = new KeyBinding("key.spawn", Keyboard.KEY_V, "key.categories.hywt");
 
        ClientRegistry.registerKeyBinding(spawn);
    }
}