package sh.snaxx.gw2javaapi.model.v2.wvw;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "start_time", "end_time", "scores", "worlds", "all_worlds", "deaths", "kills", "victory_points", "skirmishes", "maps" })
public class WvwMatchOverview {

    private String id;
    private String startTime;
    private String endTime;
    private WvwMatchOverviewValues scores;
    private WvwMatchOverviewValues worlds;
    private WvwMatchOverviewMultiValue all_worlds;
    private WvwMatchOverviewValues deaths;
    private WvwMatchOverviewValues kills;
    private WvwMatchOverviewValues victory_points;
    private List<WvwMatchOverviewSkirmish> skirmishes;
    private List<WvwMatchOverviewMap> maps;

    @JsonCreator
    public WvwMatchOverview(String id, String startTime, String endTime, WvwMatchOverviewValues scores, WvwMatchOverviewValues worlds, WvwMatchOverviewMultiValue all_worlds, WvwMatchOverviewValues deaths, WvwMatchOverviewValues kills, WvwMatchOverviewValues victory_points, List<WvwMatchOverviewSkirmish> skirmishes, List<WvwMatchOverviewMap> maps) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.scores = scores;
        this.worlds = worlds;
        this.all_worlds = all_worlds;
        this.deaths = deaths;
        this.kills = kills;
        this.victory_points = victory_points;
        this.skirmishes = skirmishes;
        this.maps = maps;
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "red", "blue", "green" })
    public static class WvwMatchOverviewValues {

        private Integer red;
        private Integer blue;
        private Integer green;

        @JsonCreator
        public WvwMatchOverviewValues(Integer red, Integer blue, Integer green) {
            this.red = red;
            this.blue = blue;
            this.green = green;
        }
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "red", "blue", "green" })
    public static class WvwMatchOverviewMultiValue {

        private List<Integer> red;
        private List<Integer> blue;
        private List<Integer> green;

        @JsonCreator
        public WvwMatchOverviewMultiValue(List<Integer> red, List<Integer> blue, List<Integer> green) {
            this.red = red;
            this.blue = blue;
            this.green = green;
        }
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "id", "scores", "maps_scores" })
    public static class WvwMatchOverviewSkirmish {

        private Integer id;
        private WvwMatchOverviewValues scores;
        private List<WvwMatchOverviewSkirmishMapScore> maps_scores;

        @JsonCreator
        public WvwMatchOverviewSkirmish(Integer id, WvwMatchOverviewValues scores, List<WvwMatchOverviewSkirmishMapScore> maps_scores) {
            this.id = id;
            this.scores = scores;
            this.maps_scores = maps_scores;
        }
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "type", "scores" })
    public static class WvwMatchOverviewSkirmishMapScore {

        private String type;
        private WvwMatchOverviewValues scores;
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "id", "type", "scores", "bonuses", "objectives", "deaths", "kills" })
    public static class WvwMatchOverviewMap {

        private Integer id;
        private String type;
        private WvwMatchOverviewValues scores;
        private List<WvwMatchOverviewMapBonus> bonuses;
        private List<WvwMatchOverviewMapObjective> objectives;
        private WvwMatchOverviewValues deaths;
        private WvwMatchOverviewValues kills;

        @JsonCreator
        public WvwMatchOverviewMap(Integer id, String type, WvwMatchOverviewValues scores, List<WvwMatchOverviewMapBonus> bonuses, List<WvwMatchOverviewMapObjective> objectives, WvwMatchOverviewValues deaths, WvwMatchOverviewValues kills
        ) {
            this.id = id;
            this.type = type;
            this.scores = scores;
            this.bonuses = bonuses;
            this.objectives = objectives;
            this.deaths = deaths;
            this.kills = kills;
        }
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "type", "owner" })
    public static class WvwMatchOverviewMapBonus {

        private String type;
        private String owner;

        @JsonCreator
        public WvwMatchOverviewMapBonus(String type, String owner) {
            this.type = type;
            this.owner = owner;
        }
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "id", "type", "owner", "last_flipped", "claimed_by", "claimed_at", "points_tick", "points_capture", "yaks_delivered", "guild_upgrades" })
    public static class WvwMatchOverviewMapObjective {

        private String id;
        private String type;
        private String owner;
        private String last_flipped;
        private String claimed_by;
        private String claimed_at;
        private Integer points_tick;
        private Integer points_capture;
        private Integer yaks_delivered;
        private List<Integer> guild_upgrades;

        @JsonCreator
        public WvwMatchOverviewMapObjective(String id, String type, String owner, String last_flipped, String claimed_by, String claimed_at, Integer points_tick, Integer points_capture, Integer yaks_delivered, List<Integer> guild_upgrades) {
            this.id = id;
            this.type = type;
            this.owner = owner;
            this.last_flipped = last_flipped;
            this.claimed_by = claimed_by;
            this.claimed_at = claimed_at;
            this.points_tick = points_tick;
            this.points_capture = points_capture;
            this.yaks_delivered = yaks_delivered;
            this.guild_upgrades = guild_upgrades;
        }
    }
}
