package net.swofty.type.village.npcs;

import net.minestom.server.coordinate.Pos;
import net.swofty.types.generic.entity.npc.NPCParameters;
import net.swofty.types.generic.entity.npc.SkyBlockNPC;

public class NPCFarmer extends SkyBlockNPC {

    public NPCFarmer() {
        super(new NPCParameters() {
            @Override
            public String[] holograms() {
                return new String[]{"§9Farmer", "§e§lCLICK"};
            }

            @Override
            public String signature() {
                return "F0DZ8COJZ2+j9OpMbK87nw6jjW9a1No40LxYZlIab1BdD68DIHBoUc4bA6XEisWhn0vtFvaV988j/IdYaGEo+O7+TZgrXpz5sgEzeP7BU9XRburiclHTJeY73PhX6MgdPuVcH2dhTkqp+kdqSmPme8xDvRiuenV9TC23ixuPpW+gduXYr1H3UoAx2H/7UVVznWw+WteBtOY3ENTv742nBmituYmyVx0cbmz6rPtoWdzxvQl2mnQqF68iSC9ADLGqhP4xFX3ERLX9uQKG27Lh27svSMPfy+ow5Ra9JV06Vac+j4THFMgVuVpp+UQgFQLmkCn0JyazNYJQkXirSSjkTkofFfMVPQJtal+6YJ8plBlgTXxA+MSuEUIiYJCK1LjQaxr6CW8U+uGY8kvo1w+C1J6iOyWdApvGrZEbCaXbR3Hu0E5AZFfjbscM6mLjh4N8jj/9tBcy1HKY8Lau2CkSI8bs00C8h0nzgb9W126m+jsFpNawoJVC4RF9mxh0576Y0kwzbgX+mFUfavrwFcsnhaRL1pyrUEMmmJ3j7vka7enezT+siGJ8KC4A2rMAuTGpSRpL4Ot6NxWWD6wv4bMRzNmHz+yEmqPGqZu4SsC0GSzS3bSVpK7o5lwzxYmQZFQZNRHmo70nWvPdQxcGsGe3ylZ88lb+78iS9itJ9Mbb/As=";
            }

            @Override
            public String texture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTU4OTg1MDk0MDAyNiwKICAicHJvZmlsZUlkIiA6ICIzZmM3ZmRmOTM5NjM0YzQxOTExOTliYTNmN2NjM2ZlZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJZZWxlaGEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmI2NTJkZDA4MTRhYjIxMzRmZmY5MzYzZmIyNTk2MzI5Njk5YzFkM2IyYjc5OTNmYzI5NzdiZjJjZTYxNTEyOSIKICAgIH0KICB9Cn0=";
            }

            @Override
            public Pos position() {
                return new Pos(44.5, 72, -162.5, 0, 0);
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
