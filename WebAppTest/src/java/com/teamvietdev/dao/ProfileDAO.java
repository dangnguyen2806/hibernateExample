package com.teamvietdev.dao;

import com.teamvietdev.model.Profile;
import java.util.List;

/**
 *
 * @author TVD
 */
public interface ProfileDAO {
    
    // create
    public boolean create(Profile object);

    // update
    public boolean update(Profile object);

    // delete
    public boolean delete(Profile object);

    // find by id
    public Profile findById(long profileId);

    // load list by nav
    public List<Profile> getListNav(int start, int limit);
    
    // total item
    public int totalItem();
    
}