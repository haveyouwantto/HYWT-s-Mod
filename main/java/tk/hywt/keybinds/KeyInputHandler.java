package tk.hywt.keybinds;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraft.client.Minecraft;

public class KeyInputHandler
{
    @SubscribeEvent
    public void onKeyInput(KeyInputEvent event)
    {
        if (HywtKeybinds.spawn.isPressed())
        {
            Minecraft.getMinecraft().thePlayer.setSpawnChunk(Minecraft.getMinecraft().thePlayer.getPlayerCoordinates(), true);
            Minecraft.getMinecraft().thePlayer.sendChatMessage("Set "+Minecraft.getMinecraft().thePlayer.getDisplayName()+"'s spawnpoint to"+Minecraft.getMinecraft().thePlayer.getPlayerCoordinates());
        }
    }
}