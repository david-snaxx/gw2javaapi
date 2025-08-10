package sh.snaxx.gw2javaapi.model.v2.wvw;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
       "id", "scores", "victory_points", "skirmishes", "maps"
})
public class WvwMatchWorldScores {

    @JsonProperty("id") private String id;
    @JsonProperty("scores") private WvwMatchWorldScoresValues scores;
    @JsonProperty("victory_points") private WvwMatchWorldScoresValues victory_points;
    @JsonProperty("skirmishes") private List<WvwMatchWorldScoresSkirmish> skirmishes;
    @JsonProperty("maps") private List<WvwMatchWorldScoresMap> maps;

    @JsonCreator
    public WvwMatchWorldScores(
            @JsonProperty("id") String id,
            @JsonProperty("scores") WvwMatchWorldScoresValues scores,
            @JsonProperty("victory_points") WvwMatchWorldScoresValues victory_points,
            @JsonProperty("skirmishes") List<WvwMatchWorldScoresSkirmish> skirmishes,
            @JsonProperty("maps") List<WvwMatchWorldScoresMap> maps
    ) {
        this.id = id;
        this.scores = scores;
        this.victory_points = victory_points;
        this.skirmishes = skirmishes;
        this.maps = maps;
    }

    public String id() { return id; }
    public void setId(String id) { this.id = id; }

    public WvwMatchWorldScoresValues scores() { return scores; }
    public void setScores(WvwMatchWorldScoresValues scores) { this.scores = scores; }

    public WvwMatchWorldScoresValues victory_points() { return victory_points; }
    public void setVictory_points(WvwMatchWorldScoresValues victory_points) { this.victory_points = victory_points; }

    public List<WvwMatchWorldScoresSkirmish> skirmishes() { return skirmishes; }
    public void setSkirmishes(List<WvwMatchWorldScoresSkirmish> skirmishes) { this.skirmishes = skirmishes; }

    public List<WvwMatchWorldScoresMap> maps() { return maps; }
    public void setMaps(List<WvwMatchWorldScoresMap> maps) { this.maps = maps; }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "red", "blue", "green"
    })
    public static class WvwMatchWorldScoresValues {

        @JsonProperty("red") private Integer red;
        @JsonProperty("blue") private Integer blue;
        @JsonProperty("green") private Integer green;

        @JsonCreator
        public WvwMatchWorldScoresValues(
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
            "id", "scores", "map_scores"
    })
    public static class WvwMatchWorldScoresSkirmish {

        @JsonProperty("id") private Integer id;
        @JsonProperty("scores") private WvwMatchWorldScoresValues scores;
        @JsonProperty("map_scores") private List<WvwMatchWorldScoresSkirmishMap> map_scores;

        @JsonCreator
        public WvwMatchWorldScoresSkirmish(
                @JsonProperty("id") Integer id,
                @JsonProperty("scores") WvwMatchWorldScoresValues scores,
                @JsonProperty("map_scores") List<WvwMatchWorldScoresSkirmishMap> map_scores
        ) {
            this.id = id;
            this.scores = scores;
            this.map_scores = map_scores;
        }

        public Integer id() { return id; }
        public void setId(Integer id) { this.id = id; }

        public WvwMatchWorldScoresValues scores() { return scores; }
        public void setScores(WvwMatchWorldScoresValues scores) { this.scores = scores; }

        public List<WvwMatchWorldScoresSkirmishMap> map_scores() { return map_scores; }
        public void setMap_scores(List<WvwMatchWorldScoresSkirmishMap> map_scores) { this.map_scores = map_scores; }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "type", "scores"
    })
    public static class WvwMatchWorldScoresSkirmishMap {

        @JsonProperty("type") private String type;
        @JsonProperty("scores") private WvwMatchWorldScoresValues scores;

        @JsonCreator
        public WvwMatchWorldScoresSkirmishMap(
                @JsonProperty("type") String type,
                @JsonProperty("scores") WvwMatchWorldScoresValues scores
        ) {
            this.type = type;
            this.scores = scores;
        }

        public String type() { return type; }
        public void setType(String type) { this.type = type; }

        public WvwMatchWorldScoresValues scores() { return scores; }
        public void setScores(WvwMatchWorldScoresValues scores) { this.scores = scores; }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "id", "type", "scores"
    })
    public static class WvwMatchWorldScoresMap {

        @JsonProperty("id") private Integer id;
        @JsonProperty("type") private String type;
        @JsonProperty("scores") private WvwMatchWorldScoresValues scores;

        @JsonCreator
        public WvwMatchWorldScoresMap(
                @JsonProperty("id") Integer id,
                @JsonProperty("type") String type,
                @JsonProperty("scores") WvwMatchWorldScoresValues scores
        ) {
            this.id = id;
            this.type = type;
            this.scores = scores;
        }

        public Integer id() { return id; }
        public void setId(Integer id) { this.id = id; }

        public String type() { return type; }
        public void setType(String type) { this.type = type; }

        public WvwMatchWorldScoresValues scores() { return scores; }
        public void setScores(WvwMatchWorldScoresValues scores) { this.scores = scores; }
    }
}
