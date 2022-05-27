/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamvietdev.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/*
 * @author Admin
 */
@Entity(name = "Club")
@Table(name = "Club")
public class Club implements Serializable {

    @Id
    @GeneratedValue
    private long clubId;

    @Column(name = "clubName")
    private String clubName;

    @Column(name = "managerName")
    private String managerName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "club")
    private Set<Profile> listProfile = new HashSet<>();

    public long getClubId() {
        return clubId;
    }

    public void setClubId(long clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Set<Profile> getListProfile() {
        return listProfile;
    }

    public void setListProfile(Set<Profile> listProfile) {
        this.listProfile = listProfile;
    }

}
