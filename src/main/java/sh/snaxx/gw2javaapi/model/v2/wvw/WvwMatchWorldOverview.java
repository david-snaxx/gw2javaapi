package sh.snaxx.gw2javaapi.model.v2.wvw;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id", "worlds", "all_worlds", "start_time", "end_time"
})
public class WvwMatchWorldOverview {

    @JsonProperty("id") private String id;
    @JsonProperty("worlds") private WvwMatchWorldOverviewValues worlds;
    @JsonProperty("all_worlds") private WvwMatchWorldOverviewMultiValues all_worlds;
    @JsonProperty("start_time") private String start_time;
    @JsonProperty("end_time") private String end_time;

    public String id() { return id; }
    public void setId(String id) { this.id = id; }

    public WvwMatchWorldOverviewValues worlds() { return worlds; }
    public void setWorlds(WvwMatchWorldOverviewValues worlds) { this.worlds = worlds; }

    public WvwMatchWorldOverviewMultiValues all_worlds() { return all_worlds; }
    public void setAll_worlds(WvwMatchWorldOverviewMultiValues all_worlds) { this.all_worlds = all_worlds; }

    public String start_time() { return start_time; }
    public void setStart_time(String start_time) { this.start_time = start_time; }

    public String end_time() { return end_time; }
    public void setEnd_time(String end_time) { this.end_time = end_time; }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "red", "blue", "green"
    })
    public static class WvwMatchWorldOverviewValues {

        @JsonProperty("red") private Integer red;
        @JsonProperty("blue") private Integer blue;
        @JsonProperty("green") private Integer green;

        @JsonCreator
        public WvwMatchWorldOverviewValues(
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
    public static class WvwMatchWorldOverviewMultiValues {

        @JsonProperty("red") private List<Integer> red;
        @JsonProperty("blue") private List<Integer> blue;
        @JsonProperty("green") private List<Integer> green;

        @JsonCreator
        public WvwMatchWorldOverviewMultiValues(
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
        public void setGreen(List<Integer> green) { this.green = green; }
    }
}
