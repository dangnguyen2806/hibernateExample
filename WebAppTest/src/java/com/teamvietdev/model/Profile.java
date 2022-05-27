package com.teamvietdev.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author TVD
 */
@Entity(name = "Profile")
public class Profile implements Serializable {

    @Id
    @GeneratedValue
    private long profileId;
    
    @Column(name = "profileName")
    private String profileName;
    
    @Column(name = "profileImage")
    private String profileImage;
    
    @Temporal(TemporalType.DATE)
    @JoinColumn(name = "profileDateofBirth")
    private Date profileDateofBirth;

    @Column(name = "profileStatus")
    private boolean profileStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club")
    private Club club;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position")
    private Position position;

    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public Date getProfileDateofBirth() {
        return profileDateofBirth;
    }

    public void setProfileDateofBirth(Date profileDateofBirth) {
        this.profileDateofBirth = profileDateofBirth;
    }

    public boolean isProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(boolean profileStatus) {
        this.profileStatus = profileStatus;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
