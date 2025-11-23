package com.starless.sound;

import com.starless.StarlessMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

// import java.rmi.registry.Registry;

public class ModSoundEvents {
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_DARK_QILIN_OF_HEBEI = registerReference("music_disc.dark_qilin_of_hebei");

    private static RegistryEntry.Reference<SoundEvent> registerReference(String name) {
        Identifier id = Identifier.of(StarlessMod.MOD_ID, name);
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModSoundEvents() {

    }
}
