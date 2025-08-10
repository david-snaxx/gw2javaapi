package sh.snaxx.gw2javaapi.model.v2.wvw;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id", "start_time", "end_time", "scores", "worlds", "all_worlds", "deaths", "kills", "victory_points", "skirmishes", "maps"
})
public class WvwMatchOverview {

    @JsonProperty("id") private String id;
    @JsonProperty("start_time") private String startTime;
    @JsonProperty("end_time") private String endTime;
    @JsonProperty("worlds") private WvwMatchOverviewValues worlds;
    @JsonProperty("all_worlds") private WvwMatchOverviewMultiValue all_worlds;
    @JsonProperty("deaths") private WvwMatchOverviewValues deaths;
    @JsonProperty("kills") private WvwMatchOverviewValues kills;
    @JsonProperty("victory_points") private WvwMatchOverviewValues victory_points;
    @JsonProperty("skirmishes") private List<WvwMatchOverviewSkirmish> skirmishes;

    public String id() { return id; }
    public void setId(String id) { this.id = id; }

    public String startTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }

    public String endTime() { return endTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; }

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "red", "blue", "green"
    })
    private static class WvwMatchOverviewValues {

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
    private static class WvwMatchOverviewMultiValue {

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
    private static class WvwMatchOverviewSkirmish {

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
    private static class WvwMatchOverviewSkirmishMapScore {

        @JsonProperty("type") private String type;
        @JsonProperty("scores") private WvwMatchOverviewValues scores;

        public String type() { return type; }
        public void setType(String type) { this.type = type; }

        public WvwMatchOverviewValues scores() { return scores; }
        public void setScores(WvwMatchOverviewValues scores) { this.scores = scores; }
    }
}
