package sh.snaxx.gw2javaapi.model.v2.wvw;

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

    @JsonProperty("id") private Integer id;
    @JsonProperty("name") private String name;
    @JsonProperty("description") private String description;
    @JsonProperty("icon") private String icon;
    @JsonProperty("ranks") private List<WvwAbilityRank> ranks;

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

    public Integer id() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String name() { return name; }
    public void setName(String name) { this.name = name; }

    public String description() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String icon() { return icon; }
    public void setIcon(String icon) { this.icon = icon; }

    public List<WvwAbilityRank> ranks() { return ranks; }
    public void setRanks(List<WvwAbilityRank> ranks) { this.ranks = ranks; }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "cost", "effect"
    })
    public static class WvwAbilityRank {

        @JsonProperty("cost") private Integer cost;
        @JsonProperty("effect") private String effect;

        @JsonCreator
        public WvwAbilityRank(@JsonProperty("cost") Integer cost,
                              @JsonProperty("effect") String effect
        ) {
            this.cost = cost;
            this.effect = effect;
        }

        public String effect() {return effect;}
        public void setEffect(String effect) {this.effect = effect;}

        public Integer cost() {return cost;}
        public void setCost(Integer cost) {this.cost = cost;}
    }
}
