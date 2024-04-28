package org.tonight.apipracticespring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GitUserDto {

    private String login;
    private Integer id;
    private String url;
    private String organizations_url;
    private String repos_url;
    private String type;
    private String site_admin;
    private String name;
    private String company;
    private String location;
    private String public_repos;
    private String created_at;
    private String updated_at;

}

//"login": "13tonight",
//        "id": 82394701,
//        "node_id": "MDQ6VXNlcjgyMzk0NzAx",
//        "avatar_url": "https://avatars.githubusercontent.com/u/82394701?v=4",
//        "gravatar_id": "",
//        "url": "https://api.github.com/users/13tonight",
//        "html_url": "https://github.com/13tonight",
//        "followers_url": "https://api.github.com/users/13tonight/followers",
//        "following_url": "https://api.github.com/users/13tonight/following{/other_user}",
//        "gists_url": "https://api.github.com/users/13tonight/gists{/gist_id}",
//        "starred_url": "https://api.github.com/users/13tonight/starred{/owner}{/repo}",
//        "subscriptions_url": "https://api.github.com/users/13tonight/subscriptions",
//        "organizations_url": "https://api.github.com/users/13tonight/orgs",
//        "repos_url": "https://api.github.com/users/13tonight/repos",
//        "events_url": "https://api.github.com/users/13tonight/events{/privacy}",
//        "received_events_url": "https://api.github.com/users/13tonight/received_events",
//        "type": "User",
//        "site_admin": false,
//        "name": "GURRAM HASWANTH",
//        "company": "Chemtex",
//        "blog": "",
//        "location": "Texas",
//        "email": null,
//        "hireable": true,
//        "bio": null,
//        "twitter_username": null,
//        "public_repos": 7,
//        "public_gists": 0,
//        "followers": 0,
//        "following": 1,
//        "created_at": "2021-04-12T14:49:23Z",
//        "updated_at": "2024-01-23T03:02:34Z"