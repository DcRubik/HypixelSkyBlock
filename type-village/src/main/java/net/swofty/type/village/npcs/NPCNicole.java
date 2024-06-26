package net.swofty.type.village.npcs;

import net.minestom.server.coordinate.Pos;
import net.swofty.types.generic.entity.npc.NPCParameters;
import net.swofty.types.generic.entity.npc.SkyBlockNPC;

public class NPCNicole extends SkyBlockNPC {

    public NPCNicole() {
        super(new NPCParameters() {
            @Override
            public String[] holograms() {
                return new String[]{"§9Nicole", "§e§lCLICK"};
            }

            @Override
            public String signature() {
                return "KDd6cdjHjGul2t11SIwkeeSpYNhI0rSuyqlvb1Go2IpWze5G9hwWu1uE3Vh+g0+Isu41Ng0VdKk65W7R+qlBbwCf4CdUwi5f01MCdTTgXTmhBShHlu47UQ7Pw4Dkz0I5o6lsbRnTqEclxO7zxJJZAzEaAQYBHdnEVqP7vXsBsgGfkNYHm8v0lSNDUHrnIuypMu1lvkWEQp0PPjHgLohe8uw5Yji8yoeJyxuNPMpu2fnq50dtLm+cY1F5Ucf33kpwVNj1h2h7wbN1rUd5+cK6bGipM2FSPu95IJtduN5iNEi0SNmefop8lkvgeliEb9oPC/xkzr+h9Vnj2o2oHDmGL3sFot8o7fy0jgTsA3wunLArE3kocCOFiId+nKH2v7lK2/fIVMz5M1XxAcRwJGo36fg+aHbhMKlvVrDa1mU2BxfqGxXJICNjAwbUzWt5je49zluxEJscLLEgFHsZ62qowg1J0NsSPBqZpH8vfv7vnEzhUJhcjbTY8/zVKJdgVZLCOMJkHuutZgYk38Ypmtpz13uZjzY3b7D/chIyLDIeLdiBmLAZu3H2xwZDibpHY9DnEclKneBSW8gvXxnDu0oyUaIGfK9y8AHMoYNsgdY87txGYA++VPQ+IJUVlY1y26X1ND/AApR9BoLu9eo53vKY8m9mVvrHy5IT7AvgAAbzTGI=";
            }

            @Override
            public String texture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTYwOTE5OTI3ODQxOSwKICAicHJvZmlsZUlkIiA6ICI3MzgyZGRmYmU0ODU0NTVjODI1ZjkwMGY4OGZkMzJmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJJb3lhbCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80OGEzZDQzMjgzZjEyYWIxZmE0ZDFiOTAxZGY4OTc1ODkxNDBmNGNjMWY2NzQ4MjIyZTU3NGNkYzcwY2U4M2E0IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
            }

            @Override
            public Pos position() {
                return new Pos(39.5, 90, 72.5, 90, 0);
            }

            @Override
            public boolean looking() {
                return true;
            }
        });
    }

    @Override
    public void onClick(PlayerClickNPCEvent e) {
        e.player().sendMessage("§cThis Feature is not there yet. §aOpen a Pull request at https://github.com/Swofty-Developments/HypixelSkyBlock to get it added quickly!");
    }

}
