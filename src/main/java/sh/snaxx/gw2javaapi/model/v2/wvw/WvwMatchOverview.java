package sh.snaxx.gw2javaapi.model.v2.wvw;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
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

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "red", "blue", "green" })
    public static class WvwMatchOverviewValues {

        private Integer red;
        private Integer blue;
        private Integer green;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "red", "blue", "green" })
    public static class WvwMatchOverviewMultiValue {

        private List<Integer> red;
        private List<Integer> blue;
        private List<Integer> green;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "id", "scores", "maps_scores" })
    public static class WvwMatchOverviewSkirmish {

        private Integer id;
        private WvwMatchOverviewValues scores;
        private List<WvwMatchOverviewSkirmishMapScore> maps_scores;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "type", "scores" })
    public static class WvwMatchOverviewSkirmishMapScore {

        private String type;
        private WvwMatchOverviewValues scores;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
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
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "type", "owner" })
    public static class WvwMatchOverviewMapBonus {

        private String type;
        private String owner;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
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
    }
}
