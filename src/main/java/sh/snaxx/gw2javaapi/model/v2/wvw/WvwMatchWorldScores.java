package sh.snaxx.gw2javaapi.model.v2.wvw;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import sh.snaxx.gw2javaapi.model.common.WvwTeamValues;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "scores", "victory_points", "skirmishes", "maps" })
public class WvwMatchWorldScores {

    private String id;
    private WvwTeamValues scores;
    private WvwTeamValues victory_points;
    private List<WvwMatchWorldScoresSkirmish> skirmishes;
    private List<WvwMatchWorldScoresMap> maps;

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "id", "scores", "map_scores" })
    public static class WvwMatchWorldScoresSkirmish {

        private Integer id;
        private WvwTeamValues scores;
        private List<WvwMatchWorldScoresSkirmishMap> map_scores;
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "type", "scores" })
    public static class WvwMatchWorldScoresSkirmishMap {

        private String type;
        private WvwTeamValues scores;
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "id", "type", "scores" })
    public static class WvwMatchWorldScoresMap {

        private Integer id;
        private String type;
        private WvwTeamValues scores;
    }
}
