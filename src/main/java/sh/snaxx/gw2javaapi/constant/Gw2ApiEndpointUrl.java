package sh.snaxx.gw2javaapi.constant;

public enum Gw2ApiEndpointUrl {

    BASE("https://api.guildwars2.com");

    public enum V1 {

        BASE("https://api.guildwars2.com/v1"),
        BUILD("https://api.guildwars2.com/v1/build.json"),
        COLORS("https://api.guildwars2.com/v1/colors.json"),
        CONTINENTS("https://api.guildwars2.com/v1/continents.json"),
        EVENT_DETAILS("https://api.guildwars2.com/v1/event_details.json"),
        EVENT_NAMES("https://api.guildwars2.com/v1/event_names.json"),
        EVENTS("https://api.guildwars2.com/v1/events.json"),
        FILES("https://api.guildwars2.com/v1/files.json"),
        GUILD_DETAILS("https://api.guildwars2.com/v1/guild_details.json"),
        ITEM_DETAILS("https://api.guildwars2.com/v1/item_details.json"),
        ITEMS("https://api.guildwars2.com/v1/items.json"),
        MAP_FLOOR("https://api.guildwars2.com/v1/map_floor.json"),
        MAP_NAMES("https://api.guildwars2.com/v1/map_names.json"),
        MAPS("https://api.guildwars2.com/v1/maps.json"),
        RECIPE_DETAILS("https://api.guildwars2.com/v1/recipe_details.json"),
        RECIPES("https://api.guildwars2.com/v1/recipes.json"),
        SKIN_DETAILS("https://api.guildwars2.com/v1/skin_details.json"),
        SKINS("https://api.guildwars2.com/v1/skins.json"),
        WORLD_NAMES("https://api.guildwars2.com/v1/world_names.json"),
        WVW("https://api.guildwars2.com/v1/wvw.json"),
        WVW_MATCH_DETAILS("https://api.guildwars2.com/v1/wvw/match_details.json"),
        WVW_MATCHES("https://api.guildwars2.com/v1/wvw/matches.json"),
        WVW_OBJECTIVE_NAMES("https://api.guildwars2.com/v1/wvw/object_names.json");

        private final String url;

        V1(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }

    public enum V2 {

        BASE("https://api.guildwars2.com/v2"),
        BUILD("https://api.guildwars2.com/v2/build"),
        COLORS("https://api.guildwars2.com/v2/colors"),
        CONTINENTS("https://api.guildwars2.com/v2/continents"),
        CREATE_SUBTOKEN("https://api.guildwars2.com/v2/createsubtoken"),
        CURRENCIES("https://api.guildwars2.com/v2/currencies"),
        DAILY_CRAFTING("https://api.guildwars2.com/v2/dailycrafting"),
        DUNGEONS("https://api.guildwars2.com/v2/dungeons"),
        EMOTES("https://api.guildwars2.com/v2/emotes"),
        FILES("https://api.guildwars2.com/v2/files"),
        FINISHERS("https://api.guildwars2.com/v2/finishers"),
        GLIDERS("https://api.guildwars2.com/v2/gliders"),
        ITEMS("https://api.guildwars2.com/v2/items"),
        ITEM_STATS("https://api.guildwars2.com/v2/itemstats"),
        JADE_BOTS("https://api.guildwars2.com/v2/jadebots"),
        LEGENDARY_ARMORY("https://api.guildwars2.com/v2/legendaryarmory"),
        LEGENDS("https://api.guildwars2.com/v2/legends"),
        LOGOS("https://api.guildwars2.com/v2/logos"),
        MAIL_CARRIERS("https://api.guildwars2.com/v2/mailcarriers"),
        MAP_CHESTS("https://api.guildwars2.com/v2/mapchests"),
        MAPS("https://api.guildwars2.com/v2/maps"),
        MASTERIES("https://api.guildwars2.com/v2/masteries"),
        MATERIALS("https://api.guildwars2.com/v2/materials"),
        MINIS("https://api.guildwars2.com/v2/minis"),
        NOVELTIES("https://api.guildwars2.com/v2/novelties"),
        OUTFITS("https://api.guildwars2.com/v2/outfits"),
        PETS("https://api.guildwars2.com/v2/pets"),
        PROFESSIONS("https://api.guildwars2.com/v2/professions"),
        QUAGGANS("https://api.guildwars2.com/v2/quaggans"),
        QUESTS("https://api.guildwars2.com/v2/quests"),
        RACES("https://api.guildwars2.com/v2/races"),
        RAIDS("https://api.guildwars2.com/v2/raids"),
        SKIFFS("https://api.guildwars2.com/v2/skiffs"),
        SKILLS("https://api.guildwars2.com/v2/skills"),
        SKINS("https://api.guildwars2.com/v2/skins"),
        SPECIALIZATIONS("https://api.guildwars2.com/v2/specializations"),
        TITLES("https://api.guildwars2.com/v2/titles"),
        TOKEN_INFO("https://api.guildwars2.com/v2/tokeninfo"),
        TRAITS("https://api.guildwars2.com/v2/traits"),
        WORLD_BOSSES("https://api.guildwars2.com/v2/worldbosses"),
        WORLDS("https://api.guildwars2.com/v2/worlds");

        public enum ACCOUNT {
            BASE("https://api.guildwars2.com/v2/account"),
            ACHIEVEMENTS("https://api.guildwars2.com/v2/account/achievements"),
            BANK("https://api.guildwars2.com/v2/account/bank"),
            BUILD_STORAGE("https://api.guildwars2.com/v2/account/buildstorage"),
            DAILY_CRAFTING("https://api.guildwars2.com/v2/account/dailycrafting"),
            DUNGEONS("https://api.guildwars2.com/v2/account/dungeons"),
            DYES("https://api.guildwars2.com/v2/account/dyes"),
            EMOTES("https://api.guildwars2.com/v2/account/emotes"),
            FINISHERS("https://api.guildwars2.com/v2/account/finishers"),
            GLIDERS("https://api.guildwars2.com/v2/account/gliders"),
            HOME("https://api.guildwars2.com/v2/account/home"),
            HOME_CATS("https://api.guildwars2.com/v2/account/home/cats"),
            HOME_NODES("https://api.guildwars2.com/v2/account/home/nodes"),
            HOMESTEAD("https://api.guildwars2.com/v2/account/homestead"),
            HOMESTEAD_DECORATIONS("https://api.guildwars2.com/v2/account/homestead/decorations"),
            HOMESTEAD_GLYPHS("https://api.guildwars2.com/v2/account/homestead/glyphs"),
            INVENTORY("https://api.guildwars2.com/v2/account/inventory"),
            JADE_BOTS("https://api.guildwars2.com/v2/account/jadebots"),
            LEGENDARY_ARMORY("https://api.guildwars2.com/v2/account/legendaryarmory"),
            LUCK("https://api.guildwars2.com/v2/account/luck"),
            MAIL_CARRIERS("https://api.guildwars2.com/v2/account/mailcarriers"),
            MAP_CHESTS("https://api.guildwars2.com/v2/account/mapchests"),
            MASTERIES("https://api.guildwars2.com/v2/masteries"),
            MASTERY_POINTS("https://api.guildwars2.com/v2/mastery/points"),
            MATERIALS("https://api.guildwars2.com/v2/materials"),
            MINIS("https://api.guildwars2.com/v2/minis"),
            MOUNTS("https://api.guildwars2.com/v2/mounts"),
            MOUNT_SKINS("https://api.guildwars2.com/v2/mounts/skins"),
            MOUNT_TYPES("https://api.guildwars2.com/v2/mounts/types"),
            NOVELTIES("https://api.guildwars2.com/v2/account/novelties"),
            OUTFITS("https://api.guildwars2.com/v2/account/outfits"),
            PROGRESSION("https://api.guildwars2.com/v2/account/progression"),
            PVP_HEROES("https://api.guildwars2.com/v2/account/pvp/heroes"),
            RAIDS("https://api.guildwars2.com/v2/account/raids"),
            RECIPES("https://api.guildwars2.com/v2/account/recipes"),
            SKIFFS("https://api.guildwars2.com/v2/account/skiffs"),
            SKINS("https://api.guildwars2.com/v2/account/skins"),
            TITLES("https://api.guildwars2.com/v2/account/titles"),
            WALLETS("https://api.guildwars2.com/v2/account/wallets"),
            WIZARDS_VAULT("https://api.guildwars2.com/v2/account/wizardsvault"),
            WIZARDS_VAULT_DAILY("https://api.guildwars2.com/v2/account/wizardsvault/daily"),
            WIZARDS_VAULT_LISTINGS("https://api.guildwars2.com/v2/account/wizardsvault/listings"),
            WIZARDS_VAULT_SPECIAL("https://api.guildwars2.com/v2/account/wizardsvault/special"),
            WIZARDS_VAULT_WEEKLY("https://api.guildwars2.com/v2/account/wizardsvault/weekly"),
            WORLD_BOSSES("https://api.guildwars2.com/v2/account/worldbosses"),
            WVW("https://api.guildwars2.com/v2/account/wvw");



            private final String url;

            ACCOUNT(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum ACHIEVEMENTS {
            BASE("https://api.guildwars2.com/v2/achievements"),
            CATEGORIES("https://api.guildwars2.com/v2/achievements/categories"),
            DAILY("https://api.guildwars2.com/v2/achievement/daily"),
            DAILY_TOMORROW("https://api.guildwars2.com/v2/achievements/daily/tomorrow"),
            GROUPS("https://api.guildwars2.com/v2/achievements/groups");

            private final String url;

            ACHIEVEMENTS(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum BACKSTORY {

            BASE("https://api.guildwars2.com/v2/backstory"),
            ANSWERS("https://api.guildwars2.com/v2/backstory/answers"),
            QUESTIONS("https://api.guildwars2.com/v2/backstory/questions");

            private final String url;

            BACKSTORY(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum CHARACTERS {

            BASE("https://api.guildwars2.com/v2/characters"),
            BACKSTORY("https://api.guildwars2.com/v2/characters/{id}/backstory"),
            BUILD_TABS("https://api.guildwars2.com/v2/characters/{id}/buildtabs"),
            CORE("https://api.guildwars2.com/v2/characters/{id}/core"),
            CRAFTING("https://api.guildwars2.com/v2/characters/{id}/crafting"),
            EQUIPMENT("https://api.guildwars2.com/v2/characters/{id}/equipment"),
            EQUIPMENT_TABS("https://api.guildwars2.com/v2/characters/{id}/equipmenttabs"),
            HERO_POINTS("https://api.guildwars2.com/v2/characters/{id}/heropoints"),
            INVENTORY("https://api.guildwars2.com/v2/characters/{id}/inventory"),
            QUESTS("https://api.guildwars2.com/v2/characters/{id}/quests"),
            RECIPES("https://api.guildwars2.com/v2/characters/{id}/recipes"),
            SAB("https://api.guildwars2.com/v2/characters/{id}/sab"),
            SKILLS("https://api.guildwars2.com/v2/characters/{id}/skills"),
            SPECIALIZATIONS("https://api.guildwars2.com/v2/characters/{id}/specializations"),
            TRAINING("https://api.guildwars2.com/v2/characters/{id}/training");

            private final String url;

            CHARACTERS(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum COMMERCE {

            BASE("https://api.guildwars2.com/v2/commerce"),
            DELIVERY("https://api.guildwars2.com/v2/commerce/delivery"),
            EXCHANGE("https://api.guildwars2.com/v2/commerce/exchange"),
            EXCHANGE_COINS("https://api.guildwars2.com/v2/commerce/exchange/coins"),
            EXCHANGE_GEMS("https://api.guildwars2.com/v2/commerce/exchange/gems"),
            LISTINGS("https://api.guildwars2.com/v2/commerce/listings"),
            PRICES("https://api.guildwars2.com/v2/commerce/prices"),
            TRANSACTIONS("https://api.guildwars2.com/v2/commerce/transactions");

            private final String url;

            COMMERCE(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum EMBLEMS {

            BASE("https://api.guildwars2.com/v2/emblems"),
            BACKGROUNDS("https://api.guildwars2.com/v2/emblems/backgrounds"),
            FOREGROUNDS("https://api.guildwars2.com/v2/emblems/foregrounds");

            private final String url;

            EMBLEMS(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum GUILD {

            BASE("https://api.guildwars2.com/v2/guild"),
            OVERVIEW("https://api.guildwars2.com/v2/guild/{id}"),
            LOG("https://api.guildwars2.com/v2/guild/{id}/log"),
            MEMBERS("https://api.guildwars2.com/v2/guild/{id}/members"),
            RANKS("https://api.guildwars2.com/v2/guild/{id}/ranks"),
            STASH("https://api.guildwars2.com/v2/guild/{id}/stash"),
            STORAGE("https://api.guildwars2.com/v2/guild/{id}/storage"),
            TEAMS("https://api.guildwars2.com/v2/guild/{id}/teams"),
            TREASURY("https://api.guildwars2.com/v2/guild/{id}/treasury"),
            UPGRADES_OWNED("https://api.guildwars2.com/v2/guild/{id}/upgrades"),
            PERMISSIONS("https://api.guildwars2.com/v2/guild/permissions"),
            SEARCH("https://api.guildwars2.com/v2/guild/search"),
            UPGRADES("https://api.guildwars2.com/v2/guild/upgrades");

            private final String url;

            GUILD(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum HOME {

            BASE("https://api.guildwars2.com/v2/home"),
            CATS("https://api.guildwars2.com/v2/home/cats"),
            NODES("https://api.guildwars2.com/v2/home/nodes");

            private final String url;

            HOME(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum HOMESTEAD {

            BASE("https://api.guildwars2.com/v2/homestead"),
            DECORATIONS("https://api.guildwars2.com/v2/homestead/decorations"),
            DECORATIONS_CATEGORIES("https://api.guildwars2.com/v2/homestead/categories"),
            GLYPHS("https://api.guildwars2.com/v2/homestead/glyphs");

            private final String url;

            HOMESTEAD(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum MOUNTS {

            BASE("https://api.guildwars2.com/v2/mounts"),
            MOUNT_SKINS("https://api.guildwars2.com/v2/mounts/skins"),
            MOUNT_TYPES("https://api.guildwars2.com/v2/mounts/types");

            private final String url;

            MOUNTS(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum PVP {

            BASE("https://api.guildwars2.com/v2/pvp"),
            AMULETS("https://api.guildwars2.com/v2/pvp/amulets"),
            GAMES("https://api.guildwars2.com/v2/pvp/games"),
            HEROES("https://api.guildwars2.com/v2/pvp/heroes"),
            RANKS("https://api.guildwars2.com/v2/pvp/ranks"),
            SEASONS("https://api.guildwars2.com/v2/pvp/seasons"),
            SEASONS_LEADERBOARDS("https://api.guildwars2.com/v2/pvp/seasons/leaderboards"),
            STANDINGS("https://api.guildwars2.com/v2/pvp/standings"),
            STATS("https://api.guildwars2.com/v2/pvp/stats");

            private final String url;

            PVP(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum RECIPES {

            BASE("https://api.guildwars2.com/v2/recipes"),
            SEARCH("https://api.guildwars2.com/v2/recipes/search");

            private final String url;

            RECIPES(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum STORIES {

            BASE("https://api.guildwars2.com/v2/stories"),
            SEASONS("https://api.guildwars2.com/v2/stories/seasons");

            private final String url;

            STORIES(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum WIZARDS_VAULT {

            BASE("https://api.guildwars2.com/v2/wizardsvault"),
            LISTINGS("https://api.guildwars2.com/v2/wizardsvault/listings"),
            OBJECTIVES("https://api.guildwars2.com/v2/wizardsvault/objectives");

            private final String url;

            WIZARDS_VAULT(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        public enum WVW {
            BASE("https://api.guildwars2.com/v2/wvw"),
            ABILITIES("https://api.guildwars2.com/v2/wvw/abilities"),
            GUILDS("https://api.guildwars2.com/v2/wvw/guilds"),
            GUILDS_NA("https://api.guildwars2.com/v2/wvw/guilds/na"),
            GUILDS_EU("https://api.guildwars2.com/v2/wvw/guilds/eu"),
            MATCHES("https://api.guildwars2.com/v2/wvw/matches"),
            MATCH_WORLD_OVERVIEW("https://api.guildwars2.com/v2/wvw/matches/overview?world="),
            MATCH_WORLD_SCORES("https://api.guildwars2.com/v2/wvw/matches/scores?world="),
            MATCH_WORLD_STATS("https://api.guildwars2.com/v2/wvw/matches/stats?world="),
            OBJECTIVES("https://api.guildwars2.com/v2/wvw/objectives"),
            RANKS("https://api.guildwars2.com/v2/wvw/ranks"),
            TIMERS("https://api.guildwars2.com/v2/wvw/timers"),
            TIMERS_LOCKOUT("https://api.guildwars2.com/v2/timers/lockout"),
            TIMERS_TEAM_ASSIGNMENT("https://api.guildwars2.com/v2/timers/teamassignment");

            private final String url;

            WVW(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }
        }

        private final String url;

        V2(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }

    private final String url;

    Gw2ApiEndpointUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
