package com.atom596.ad_trappist.common.config;

import com.atom596.ad_trappist.AdTrappist;
import com.teamresourceful.resourcefulconfig.common.annotations.Config;
import com.teamresourceful.resourcefulconfig.web.annotations.Gradient;
import com.teamresourceful.resourcefulconfig.web.annotations.Link;
import com.teamresourceful.resourcefulconfig.web.annotations.WebInfo;

@Config(AdTrappist.MOD_ID)
@WebInfo(
        title = "Ad Adventum",
        description = "Explore the TRAPPIST-1 system in Minecraft!",

        icon = "box", // choose from https://config.teamresourceful.com/icons
        gradient = @Gradient(value = "45deg", first = "#7F4DEE", second = "#E7797A"),

        links = {
                @Link(value = "https://discord.gg/terrarium", icon = "gamepad-2", title = "Discord"),
                @Link(value = "https://github.com/terrarium-earth/Mod-Name", icon = "github", title = "GitHub"),
                @Link(value = "https://www.curseforge.com/minecraft/mc-mods/mod-name", icon = "curseforge", title = "CurseForge"),
                @Link(value = "https://modrinth.com/mod/mod-name", icon = "modrinth", title = "Modrinth"),
        }
)
public final class AdTrappistConfig {
}
