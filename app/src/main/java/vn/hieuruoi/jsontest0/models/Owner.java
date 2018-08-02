package vn.hieuruoi.jsontest0.models;

import java.util.HashMap;
import java.util.Map;

public class Owner {
    private String mLogin;
    private int mId;
    private String mNodeId;
    private String mAvatarUrl;
    private String mGravatarId;
    private String mUrl;
    private String mHtmlUrl;
    private String mFollowerUrl;
    private String mFollowingUrl;
    private String mGistsUrl;
    private String mStarredUrl;
    private String mSubcriptionsUrl;
    private String mOrganizationsUrl;
    private String mReposUrl;
    private String mEventUrl;
    private String mReceivedEventsUrl;
    private String mStyle;
    private boolean mSiteAdmin;
    private Map<String, Object> mAdditionalProperties = new HashMap<String, Object>();

    public Owner() {
    }


    public Owner(String login,
                 int id,
                 String nodeId,
                 String avatarUrl,
                 String gravatarId,
                 String url,
                 String htmlUrl,
                 String followerUrl,
                 String followingUrl,
                 String gistsUrl, String starredUrl,
                 String subcriptionsUrl,
                 String organizationsUrl,
                 String reposUrl,
                 String eventUrl,
                 String receivedEventsUrl,
                 String style, boolean siteAdmin,
                 Map<String, Object> additionalProperties){
        mLogin = login;
        mId = id;
        mNodeId = nodeId;
        mAvatarUrl = avatarUrl;
        mGravatarId = gravatarId;
        mUrl = url;
        mHtmlUrl = htmlUrl;
        mFollowerUrl = followerUrl;
        mFollowingUrl = followingUrl;
        mGistsUrl = gistsUrl;
        mStarredUrl = starredUrl;
        mSubcriptionsUrl = subcriptionsUrl;
        mOrganizationsUrl = organizationsUrl;
        mReposUrl = reposUrl;
        mEventUrl = eventUrl;
        mReceivedEventsUrl = receivedEventsUrl;
        mStyle = style;
        mSiteAdmin = siteAdmin;
        mAdditionalProperties = additionalProperties;
    }

    public Owner(int ownerId, String ownerAvatar) {
        this.mId = ownerId;
        this.mAvatarUrl = ownerAvatar;
    }

    public void setLogin(String login) {
        mLogin = login;
    }

    public void setId(int id) {
        mId = id;
    }

    public void setNodeId(String nodeId) {
        mNodeId = nodeId;
    }

    public void setAvatarUrl(String avatarUrl) {
        mAvatarUrl = avatarUrl;
    }

    public void setGravatarId(String gravatarId) {
        mGravatarId = gravatarId;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public void setFollowerUrl(String followerUrl) {
        mFollowerUrl = followerUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        mFollowingUrl = followingUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        mGistsUrl = gistsUrl;
    }

    public void setStarredUrl(String starredUrl) {
        mStarredUrl = starredUrl;
    }

    public void setSubcriptionsUrl(String subcriptionsUrl) {
        mSubcriptionsUrl = subcriptionsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        mOrganizationsUrl = organizationsUrl;
    }

    public void setReposUrl(String reposUrl) {
        mReposUrl = reposUrl;
    }

    public void setEventUrl(String eventUrl) {
        mEventUrl = eventUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        mReceivedEventsUrl = receivedEventsUrl;
    }

    public void setStyle(String style) {
        mStyle = style;
    }

    public void setSiteAdmin(boolean siteAdmin) {
        mSiteAdmin = siteAdmin;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        mAdditionalProperties = additionalProperties;
    }

    public String getLogin() {
        return mLogin;
    }

    public int getId() {
        return mId;
    }

    public String getNodeId() {
        return mNodeId;
    }

    public String getAvatarUrl() {
        return mAvatarUrl;
    }

    public String getGravatarId() {
        return mGravatarId;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public String getFollowerUrl() {
        return mFollowerUrl;
    }

    public String getFollowingUrl() {
        return mFollowingUrl;
    }

    public String getGistsUrl() {
        return mGistsUrl;
    }

    public String getStarredUrl() {
        return mStarredUrl;
    }

    public String getSubcriptionsUrl() {
        return mSubcriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return mOrganizationsUrl;
    }

    public String getReposUrl() {
        return mReposUrl;
    }

    public String getEventUrl() {
        return mEventUrl;
    }

    public String getReceivedEventsUrl() {
        return mReceivedEventsUrl;
    }

    public String getStyle() {
        return mStyle;
    }

    public boolean isSiteAdmin() {
        return mSiteAdmin;
    }

    public Map<String, Object> getAdditionalProperties() {
        return mAdditionalProperties;
    }
}
