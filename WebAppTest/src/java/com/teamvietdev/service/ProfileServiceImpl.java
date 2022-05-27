package com.teamvietdev.service;

import com.teamvietdev.model.Profile;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teamvietdev.dao.ProfileDAO;

/**
 *
 * @author TVD
 */
@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileDAO profileDAO;

    @Override
    public boolean create(Profile object) {
        return profileDAO.create(object);
    }

    @Override
    public boolean update(Profile object) {
        return profileDAO.update(object);
    }

    @Override
    public boolean delete(Profile object) {
        return profileDAO.delete(object);
    }

    @Override
    public Profile findById(long profileId) {
        return profileDAO.findById(profileId);
    }

    @Override
    public List<Profile> getListNav(int start, int limit) {
        return profileDAO.getListNav(start, limit);
    }

    @Override
    public int totalItem() {
        return profileDAO.totalItem();
    }

}