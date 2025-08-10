package sh.snaxx.gw2javaapi.model.v2.wvw;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sh.snaxx.gw2javaapi.model.common.WvwTeamValues;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "deaths", "kills", "maps" })
public class WvwMatchWorldStats {

    private String id;
    private WvwTeamValues deaths;
    private WvwTeamValues kills;
    private List<WvwMatchWorldStatsMap> maps;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "id", "type", "deaths", "kills" })
    public final static class WvwMatchWorldStatsMap {

        private Integer id;
        private String type;
        private WvwTeamValues deaths;
        private WvwTeamValues kills;
    }
}
