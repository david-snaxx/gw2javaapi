package sh.snaxx.gw2javaapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id", "name", "description", "icon", "ranks"
})
public class WvwAbility {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("icon")
    private String icon;

    @JsonProperty("ranks")
    private List<WvwAbilityRank> ranks;

    @JsonCreator
    public WvwAbility(@JsonProperty("id") Integer id,
                      @JsonProperty("name") String name,
                      @JsonProperty("description") String description,
                      @JsonProperty("icon") String icon,
                      @JsonProperty("ranks") List<WvwAbilityRank> ranks
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.ranks = ranks;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "cost", "effect"
    })
    public static class WvwAbilityRank {

        @JsonProperty("cost")
        private Integer cost;

        @JsonProperty("effect")
        private String effect;

        @JsonCreator
        public WvwAbilityRank(@JsonProperty("cost") Integer cost,
                              @JsonProperty("effect") String effect
        ) {
            this.cost = cost;
            this.effect = effect;
        }
    }
}
