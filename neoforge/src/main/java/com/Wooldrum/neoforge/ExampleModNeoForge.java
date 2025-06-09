package com.Wooldrum.neoforge;

import net.neoforged.fml.common.Mod;

import com.Wooldrum.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
