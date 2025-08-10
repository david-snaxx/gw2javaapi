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
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "meta_progress_current", "meta_progress_complete", "meta_reward_item_id", "meta_reward_astral", "meta_reward_claimed", "objectives" })
public class AccountWizardsVaultWeekly {

    private Integer meta_progress_current;
    private Integer meta_progress_complete;
    private Integer meta_reward_item_id;
    private Integer meta_reward_astral;
    private Boolean meta_reward_claimed;
    private List<WeeklyObjective> objectives;

    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "id", "title", "track", "acclaim", "progress_current", "progress_complete", "claimed" })
    public static class WeeklyObjective {

        private Integer id;
        private String title;
        private String track;
        private Integer acclaim;
        private Integer progress_current;
        private Integer progress_complete;
        private Boolean claimed;
    }
}
