package sh.snaxx.gw2javaapi.model.v2.account;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "age", "world", "guilds", "guild_leader", "created", "access", "commander", "fractal_level", "daily_ap", "monthly_ap", "wvw_rank", "wvw", "last_modified", "build_storage_slots" })
public class AccountOverview {

    private String id;
    private String name;
    private Integer age;
    private Integer world;
    private List<String> guilds;
    private List<String> guild_leader;
    private String created;
    private List<String> access;
    private Boolean commander;
    private Integer fractal_level;
    private Integer daily_ap;
    private Integer monthly_ap;
    private Integer wvw_rank;
    private AccountOverviewWvw wvw;
    private String last_modified;
    private Integer build_storage_slots;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "team_id", "rank" })
    public static class AccountOverviewWvw {

        private Integer team_id;
        private Integer rank;
    }
}
