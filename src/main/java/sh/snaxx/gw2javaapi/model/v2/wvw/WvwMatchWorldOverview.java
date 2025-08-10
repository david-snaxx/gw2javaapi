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
@JsonPropertyOrder({ "id", "worlds", "all_worlds", "start_time", "end_time" })
public class WvwMatchWorldOverview {

    private String id;
    private WvwTeamValues worlds;
    private WvwMatchWorldOverviewMultiValues all_worlds;
    private String start_time;
    private String end_time;

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "red", "blue", "green" })
    public static class WvwMatchWorldOverviewMultiValues {

        private List<Integer> red;
        private List<Integer> blue;
        private List<Integer> green;
    }
}
