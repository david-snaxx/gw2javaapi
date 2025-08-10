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
@JsonPropertyOrder({ "id", "scores", "victory_points", "skirmishes", "maps" })
public class WvwMatchWorldScores {

    private String id;
    private WvwMatchWorldScoresValues scores;
    private WvwMatchWorldScoresValues victory_points;
    private List<WvwMatchWorldScoresSkirmish> skirmishes;
    private List<WvwMatchWorldScoresMap> maps;

    @JsonCreator
    public WvwMatchWorldScores(String id, WvwMatchWorldScoresValues scores, WvwMatchWorldScoresValues victory_points, List<WvwMatchWorldScoresSkirmish> skirmishes, List<WvwMatchWorldScoresMap> maps) {
        this.id = id;
        this.scores = scores;
        this.victory_points = victory_points;
        this.skirmishes = skirmishes;
        this.maps = maps;
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "red", "blue", "green" })
    public static class WvwMatchWorldScoresValues {

        private Integer red;
        private Integer blue;
        private Integer green;

        @JsonCreator
        public WvwMatchWorldScoresValues(Integer red, Integer blue, Integer green) {
            this.red = red;
            this.blue = blue;
            this.green = green;
        }
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "id", "scores", "map_scores" })
    public static class WvwMatchWorldScoresSkirmish {

        private Integer id;
        private WvwMatchWorldScoresValues scores;
        private List<WvwMatchWorldScoresSkirmishMap> map_scores;

        @JsonCreator
        public WvwMatchWorldScoresSkirmish(Integer id, WvwMatchWorldScoresValues scores, List<WvwMatchWorldScoresSkirmishMap> map_scores) {
            this.id = id;
            this.scores = scores;
            this.map_scores = map_scores;
        }
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "type", "scores" })
    public static class WvwMatchWorldScoresSkirmishMap {

        private String type;
        private WvwMatchWorldScoresValues scores;

        @JsonCreator
        public WvwMatchWorldScoresSkirmishMap(String type, WvwMatchWorldScoresValues scores) {
            this.type = type;
            this.scores = scores;
        }
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "id", "type", "scores" })
    public static class WvwMatchWorldScoresMap {

        private Integer id;
        private String type;
        private WvwMatchWorldScoresValues scores;

        @JsonCreator
        public WvwMatchWorldScoresMap(Integer id, String type, WvwMatchWorldScoresValues scores) {
            this.id = id;
            this.type = type;
            this.scores = scores;
        }
    }
}
