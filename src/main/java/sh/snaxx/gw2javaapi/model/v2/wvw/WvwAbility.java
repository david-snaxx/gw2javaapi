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
@JsonPropertyOrder({ "id", "name", "description", "icon", "ranks" })
public class WvwAbility {

    private Integer id;
    private String name;
    private String description;
    private String icon;
    private List<WvwAbilityRank> ranks;

    @JsonCreator
    public WvwAbility(Integer id, String name, String description, String icon, List<WvwAbilityRank> ranks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.ranks = ranks;
    }

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({ "cost", "effect" })
    public static class WvwAbilityRank {

        private Integer cost;
        private String effect;

        @JsonCreator
        public WvwAbilityRank(Integer cost, String effect) {
            this.cost = cost;
            this.effect = effect;
        }
    }
}
