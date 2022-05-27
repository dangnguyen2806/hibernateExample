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
@Entity(name = "Position")
@Table(name = "Position")
public class Position implements Serializable {

    @Id
    @GeneratedValue
    private long positionId;

    @Column(name = "positionName")
    private String positionName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "position")
    private Set<Profile> position = new HashSet<>();

    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Set<Profile> getPosition() {
        return position;
    }

    public void setPosition(Set<Profile> position) {
        this.position = position;
    }

}
