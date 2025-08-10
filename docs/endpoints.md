# Types

The following table details available types along with their corresponding endpoints.
Please see the corresponding model documentation or visit wiki.guildwars2.com/api to see full object details.

| Endpoint                                 | Object                       | Fully-Qualified Class Name                             | Endpoint Router Class                     |
|------------------------------------------|------------------------------|--------------------------------------------------------|-------------------------------------------|
| /v2/wvw/abilities/{abilityId}            | [WvwAbility]()               | sh.snaxx.gw2javaapi.model.v2.wvw.WvwAbility            | [WvwAbilityByIdEndpoint]()                |
| /v2/wvw/abilities?ids={abilityIdsList}   | [List< WvwAbility >]()       | sh.snaxx.gw2javaapi.model.v2.wvw.WvwAbility            | [WvwMultipleAbilitiesByIdEndpoint]()      |
| /v2/wvw/guilds/{region}                  | Map< String, String >        | n/a                                                    | [WvwGuildsEndpoint]()                     |
| /v2/wvw/matches                          | List< String >               | n/a                                                    | [WvwMatchesEndpoint]()                    |
| /v2/wvw/matches/{matchId}                | [WvwMatchOverview]()         | sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchOverview      | [WvwMatchOverviewByIdEndpoint]()          |
| /v2/wvw/matches/matchIdsList}            | [List< WvwMatchOverview >]() | sh.snaxx.gw2javaapi.model.v2.wvw.WvwMatchOverview      | [WvwMultipleMatchOverviewsByIdEndpoint]() |
| /v2/wvw/matches/overview?world={worldId} | [WvwMatchWorldOverview]()    | sh.snaxx.gw2javaapi.model.v2.wvw.WveMatchWorldOverview | [WvwMatchWorldOverviewEndpoint]()         |
| /v2/wvw/matches/scores?world={worldId}   | [WvwMatchWorldScores]()      | sh.snaxx.gw2javaapi.mode.v2.wvw.WvwMatchWorldScores    | [WvwMatchWorldScoresEndpoint]()           