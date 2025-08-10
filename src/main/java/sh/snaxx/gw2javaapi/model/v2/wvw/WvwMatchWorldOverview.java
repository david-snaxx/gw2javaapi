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
@JsonPropertyOrder({ "id", "worlds", "all_worlds", "start_time", "end_time" })
public class WvwMatchWorldOverview {

    private String id;
    private WvwMatchWorldOverviewValues worlds;
    private WvwMatchWorldOverviewMultiValues all_worlds;
    private String start_time;
    private String end_time;

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "red", "blue", "green" })
    public static class WvwMatchWorldOverviewValues {

        private Integer red;
        private Integer blue;
        private Integer green;

        @JsonCreator
        public WvwMatchWorldOverviewValues(Integer red, Integer blue, Integer green) {
            this.red = red;
            this.blue = blue;
            this.green = green;
        }
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "red", "blue", "green" })
    public static class WvwMatchWorldOverviewMultiValues {

        private List<Integer> red;
        private List<Integer> blue;
        private List<Integer> green;

        @JsonCreator
        public WvwMatchWorldOverviewMultiValues(List<Integer> red, List<Integer> blue, List<Integer> green) {
            this.red = red;
            this.blue = blue;
            this.green = green;
        }
    }
}
