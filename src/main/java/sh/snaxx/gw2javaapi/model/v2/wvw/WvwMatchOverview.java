package sh.snaxx.gw2javaapi.model.v2.wvw;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id", "start_time", "end_time", "scores", "worlds", "all_worlds", "deaths", "kills", "victory_points", "skirmishes", "maps"
})
public class WvwMatchOverview {

    @JsonProperty("id") private String id;
    @JsonProperty("start_time") private String startTime;
    @JsonProperty("end_time") private String endTime;
    @JsonProperty("scores") private WvwMatchOverviewValues scores;
    @JsonProperty("worlds") private WvwMatchOverviewValues worlds;
    @JsonProperty("all_worlds") private WvwMatchOverviewMultiValue all_worlds;
    @JsonProperty("deaths") private WvwMatchOverviewValues deaths;
    @JsonProperty("kills") private WvwMatchOverviewValues kills;
    @JsonProperty("victory_points") private WvwMatchOverviewValues victory_points;
    @JsonProperty("skirmishes") private List<WvwMatchOverviewSkirmish> skirmishes;
    @JsonProperty("maps") private List<WvwMatchOverviewMap> maps;

    @JsonCreator
    public WvwMatchOverview(
            @JsonProperty("id") String id,
            @JsonProperty("start_time") String startTime,
            @JsonProperty("end_time") String endTime,
            @JsonProperty("scores") WvwMatchOverviewValues scores,
            @JsonProperty("worlds") WvwMatchOverviewValues worlds,
            @JsonProperty("all_worlds") WvwMatchOverviewMultiValue all_worlds,
            @JsonProperty("deaths") WvwMatchOverviewValues deaths,
            @JsonProperty("kills") WvwMatchOverviewValues kills,
            @JsonProperty("victory_points") WvwMatchOverviewValues victory_points,
            @JsonProperty("skirmishes") List<WvwMatchOverviewSkirmish> skirmishes,
            @JsonProperty("maps") List<WvwMatchOverviewMap> maps
    ) {
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

    public String id() { return id; }
    public void setId(String id) { this.id = id; }

    public String startTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }

    public String endTime() { return endTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; }

    public WvwMatchOverviewValues scores() { return scores; }
    public void setScores(WvwMatchOverviewValues scores) { this.scores = scores; }

    public WvwMatchOverviewValues worlds() { return worlds; }
    public void setWorlds(WvwMatchOverviewValues worlds) { this.worlds = worlds; }

    public WvwMatchOverviewMultiValue all_worlds() { return all_worlds; }
    public void setAll_worlds(WvwMatchOverviewMultiValue all_worlds) { this.all_worlds = all_worlds; }

    public WvwMatchOverviewValues deaths() { return deaths; }
    public void setDeaths(WvwMatchOverviewValues deaths) { this.deaths = deaths; }

    public WvwMatchOverviewValues kills() { return kills; }
    public void setKills(WvwMatchOverviewValues kills) { this.kills = kills; }

    public WvwMatchOverviewValues victory_points() { return victory_points; }
    public void setVictory_points(WvwMatchOverviewValues victory_points) { this.victory_points = victory_points; }

    public List<WvwMatchOverviewSkirmish> skirmishes() { return skirmishes; }
    public void setSkirmishes(List<WvwMatchOverviewSkirmish> skirmishes) { this.skirmishes = skirmishes; }

    public List<WvwMatchOverviewMap> maps() { return maps; }
    public void setMaps(List<WvwMatchOverviewMap> maps) { this.maps = maps; }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "red", "blue", "green"
    })
    public static class WvwMatchOverviewValues {

        @JsonProperty("red") private Integer red;
        @JsonProperty("blue") private Integer blue;
        @JsonProperty("green") private Integer green;

        @JsonCreator
        public WvwMatchOverviewValues(
                @JsonProperty("red") Integer red,
                @JsonProperty("blue") Integer blue,
                @JsonProperty("green") Integer green
        ) {
            this.red = red;
            this.blue = blue;
            this.green = green;
        }

        public Integer red() { return red; }
        public void setRed(Integer red) { this.red = red; }

        public Integer blue() { return blue; }
        public void setBlue(Integer blue) { this.blue = blue; }

        public Integer green() { return green; }
        public void setGreen(Integer green) { this.green = green; }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "red", "blue", "green"
    })
    public static class WvwMatchOverviewMultiValue {

        @JsonProperty("red") private List<Integer> red;
        @JsonProperty("blue") private List<Integer> blue;
        @JsonProperty("green") private List<Integer> green;

        @JsonCreator
        public WvwMatchOverviewMultiValue(
                @JsonProperty("red") List<Integer> red,
                @JsonProperty("blue") List<Integer> blue,
                @JsonProperty("green") List<Integer> green
        ) {
            this.red = red;
            this.blue = blue;
            this.green = green;
        }

        public List<Integer> red() { return red; }
        public void setRed(List<Integer> red) { this.red = red; }

        public List<Integer> blue() { return blue; }
        public void setBlue(List<Integer> blue) { this.blue = blue; }

        public List<Integer> green() { return green; }
        public void setGreen(List<Integer> green) { this.green = green;}
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "id", "scores", "maps_scores"
    })
    public static class WvwMatchOverviewSkirmish {

        @JsonProperty("id") private Integer id;
        @JsonProperty("scores") private WvwMatchOverviewValues scores;
        @JsonProperty("map_scores") private List<WvwMatchOverviewSkirmishMapScore> maps_scores;

        @JsonCreator
        public WvwMatchOverviewSkirmish(
                @JsonProperty("id") Integer id,
                @JsonProperty("scores") WvwMatchOverviewValues scores,
                @JsonProperty("map_scores") List<WvwMatchOverviewSkirmishMapScore> maps_scores
        ) {
            this.id = id;
            this.scores = scores;
            this.maps_scores = maps_scores;
        }

        public Integer id() { return id; }
        public void setId(Integer id) { this.id = id; }

        public WvwMatchOverviewValues scores() { return scores; }
        public void setScores(WvwMatchOverviewValues scores) { this.scores = scores; }

        public List<WvwMatchOverviewSkirmishMapScore> map_scores() { return maps_scores; }
        public void setMaps_scores(List<WvwMatchOverviewSkirmishMapScore> maps_scores) { this.maps_scores = maps_scores; }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "type", "scores"
    })
    public static class WvwMatchOverviewSkirmishMapScore {

        @JsonProperty("type") private String type;
        @JsonProperty("scores") private WvwMatchOverviewValues scores;

        public String type() { return type; }
        public void setType(String type) { this.type = type; }

        public WvwMatchOverviewValues scores() { return scores; }
        public void setScores(WvwMatchOverviewValues scores) { this.scores = scores; }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "id", "type", "scores", "bonuses", "objectives", "deaths", "kills"
    })
    public static class WvwMatchOverviewMap {

        @JsonProperty("id") private Integer id;
        @JsonProperty("type") private String type;
        @JsonProperty("scores") private WvwMatchOverviewValues scores;
        @JsonProperty("bonuses") private List<WvwMatchOverviewMapBonus> bonuses;
        @JsonProperty("objectives") private List<WvwMatchOverviewMapObjective> objectives;
        @JsonProperty("deaths") private WvwMatchOverviewValues deaths;
        @JsonProperty("kills") private WvwMatchOverviewValues kills;

        @JsonCreator
        public WvwMatchOverviewMap(
                @JsonProperty("id") Integer id,
                @JsonProperty("type") String type,
                @JsonProperty("scores") WvwMatchOverviewValues scores,
                @JsonProperty("bonuses") List<WvwMatchOverviewMapBonus> bonuses,
                @JsonProperty("objectives") List<WvwMatchOverviewMapObjective> objectives,
                @JsonProperty("deaths") WvwMatchOverviewValues deaths,
                @JsonProperty("kills") WvwMatchOverviewValues kills
        ) {
            this.id = id;
            this.type = type;
            this.scores = scores;
            this.bonuses = bonuses;
            this.objectives = objectives;
            this.deaths = deaths;
            this.kills = kills;
        }

        public Integer id() { return id; }
        public void setId(Integer id) { this.id = id; }

        public String type() { return type; }
        public void setType(String type) { this.type = type; }

        public WvwMatchOverviewValues scores() { return scores; }
        public void setScores(WvwMatchOverviewValues scores) { this.scores = scores; }

        public List<WvwMatchOverviewMapBonus> bonuses() { return bonuses; }
        public void setBonuses(List<WvwMatchOverviewMapBonus> bonuses) { this.bonuses = bonuses; }

        public List<WvwMatchOverviewMapObjective> objectives() { return objectives; }
        public void setObjectives(List<WvwMatchOverviewMapObjective> objectives) { this.objectives = objectives; }

        public WvwMatchOverviewValues deaths() { return deaths; }
        public void setDeaths(WvwMatchOverviewValues deaths) { this.deaths = deaths; }

        public WvwMatchOverviewValues kills() { return kills; }
        public void setKills(WvwMatchOverviewValues kills) { this.kills = kills; }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "type", "owner"
    })
    public static class WvwMatchOverviewMapBonus {

        @JsonProperty("type") private String type;
        @JsonProperty("owner") private String owner;

        @JsonCreator
        public WvwMatchOverviewMapBonus(
                @JsonProperty("type") String type,
                @JsonProperty("owner") String owner
        ) {
            this.type = type;
            this.owner = owner;
        }

        public String type() { return type; }
        public void setType(String type) { this.type = type; }

        public String owner() { return owner; }
        public void setOwner(String owner) { this.owner = owner; }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "id", "type", "owner", "last_flipped", "claimed_by", "claimed_at", "points_tick", "points_capture", "yaks_delivered", "guild_upgrades"
    })
    public static class WvwMatchOverviewMapObjective {

        @JsonProperty("id") private String id;
        @JsonProperty("type") private String type;
        @JsonProperty("owner") private String owner;
        @JsonProperty("last_flipped") private String last_flipped;
        @JsonProperty("claimed_by") private String claimed_by;
        @JsonProperty("claimed_at") private String claimed_at;
        @JsonProperty("points_tick") private Integer points_tick;
        @JsonProperty("points_capture") private Integer points_capture;
        @JsonProperty("yaks_delivered") private Integer yaks_delivered;
        @JsonProperty("guild_upgrades") private List<Integer> guild_upgrades;

        @JsonCreator
        public WvwMatchOverviewMapObjective(
                @JsonProperty("id") String id,
                @JsonProperty("type") String type,
                @JsonProperty("owner") String owner,
                @JsonProperty("last_flipped") String last_flipped,
                @JsonProperty("claimed_by") String claimed_by,
                @JsonProperty("claimed_at") String claimed_at,
                @JsonProperty("points_tick") Integer points_tick,
                @JsonProperty("points_capture") Integer points_capture,
                @JsonProperty("yaks_delivered") Integer yaks_delivered,
                @JsonProperty("guild_upgrades") List<Integer> guild_upgrades
        ) {
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

        public String id() { return id; }
        public void setId(String id) { this.id = id; }

        public String type() { return type; }
        public void setType(String type) { this.type = type; }

        public String owner() { return owner; }
        public void setOwner(String owner) { this.owner = owner; }

        public String last_flipped() { return last_flipped; }
        public void setLast_flipped(String last_flipped) { this.last_flipped = last_flipped; }

        public String claimed_by() { return claimed_by; }
        public void setClaimed_by(String claimed_by) { this.claimed_by = claimed_by; }

        public String claimed_at() { return claimed_at; }
        public void setClaimed_at(String claimed_at) { this.claimed_at = claimed_at; }

        public Integer points_tick() { return points_tick; }
        public void setPoints_tick(Integer points_tick) { this.points_tick = points_tick; }

        public Integer points_capture() { return points_capture; }
        public void setPoints_capture(Integer points_capture) { this.points_capture = points_capture; }

        public Integer yaks_delivered() { return yaks_delivered; }
        public void setYaks_delivered(Integer yaks_delivered) { this.yaks_delivered = yaks_delivered; }

        public List<Integer> guild_upgrades() { return guild_upgrades; }
        public void setGuild_upgrades(List<Integer> guild_upgrades) { this.guild_upgrades = guild_upgrades; }
    }
}
