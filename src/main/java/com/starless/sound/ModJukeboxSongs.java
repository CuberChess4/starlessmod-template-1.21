package com.starless.sound;

import com.starless.StarlessMod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public interface ModJukeboxSongs {
    public static RegistryKey<JukeboxSong> DARK_QILIN_OF_HEBEI = of("dark_qilin_of_hebei");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(StarlessMod.MOD_ID, id));
    }

    private static void register(
            Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput
    ) {
        registry.register(
                key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), lengthInSeconds, comparatorOutput)
        );
    }

    public static void bootstrap(Registerable<JukeboxSong> registry) {
        register(registry, DARK_QILIN_OF_HEBEI, ModSoundEvents.MUSIC_DISC_DARK_QILIN_OF_HEBEI, 2663, 15);
    }
}
