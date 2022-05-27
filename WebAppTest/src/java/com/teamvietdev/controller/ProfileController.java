package com.teamvietdev.controller;

import com.teamvietdev.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.teamvietdev.service.ProfileService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TVD
 */
@Controller
@RequestMapping(value = "profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping(value = "list.html", method = RequestMethod.GET)
    public String listEmployee(ModelMap mm) {
        mm.put("listProfile", profileService.getListNav(0, 5));
        mm.put("totalItem", profileService.totalItem() / 5);
        return "jsp/profile_list";
    }

    @RequestMapping(value = "list/{page}.html", method = RequestMethod.GET)
    public String listEmployeeByNav(ModelMap mm, @PathVariable("page") int page) {
        mm.put("listProfile", profileService.getListNav((page - 1) * 5, 5));
        mm.put("totalItem", profileService.totalItem() / 5);
        return "jsp/profile_list";
    }

    @RequestMapping(value = "create.html", method = RequestMethod.GET)
    public String createEmployee(ModelMap mm) {
        mm.put("profile", new Profile());
        // position
        List<String> listPostion = new ArrayList<>();
        listPostion.add("Thủ môn");
        listPostion.add("Hậu vệ");
        listPostion.add("Tiền vệ");
        listPostion.add("Tiền đạo");
        mm.put("listPostion", listPostion);
        // club
        List<String> listClub = new ArrayList<>();
        listClub.add("Hoàng Anh Gia Lai");
        listClub.add("Becamex Bình Dương");
        listClub.add("Hà Nội");
        listClub.add("FLC Thanh Hóa");
        listClub.add("Nam Định");
        listClub.add("TP Hồ Chí Minh");
        listClub.add("SHB Đà Nẵng");
        listClub.add("Sông Lam Nghệ An");
        listClub.add("Hải Phòng");
        mm.put("listClub", listClub);
        return "jsp/profile_form";
    }

    @RequestMapping(value = "edit/{profileId}.html", method = RequestMethod.GET)
    public String editEmployee(ModelMap mm, @PathVariable("profileId") int profileId) {
        Profile profile = profileService.findById(profileId);
        mm.put("profile", profile);
        // position
        List<String> listPostion = new ArrayList<>();
        listPostion.add("Thủ môn");
        listPostion.add("Hậu vệ");
        listPostion.add("Tiền vệ");
        listPostion.add("Tiền đạo");
        mm.put("listPostion", listPostion);
        // club
        List<String> listClub = new ArrayList<>();
        listClub.add("Hoàng Anh Gia Lai");
        listClub.add("Becamex Bình Dương");
        listClub.add("Hà Nội");
        listClub.add("FLC Thanh Hóa");
        listClub.add("Nam Định");
        listClub.add("TP Hồ Chí Minh");
        listClub.add("SHB Đà Nẵng");
        listClub.add("Sông Lam Nghệ An");
        listClub.add("Hải Phòng");
        mm.put("listClub", listClub);
        return "jsp/profile_form";
    }

    @RequestMapping(value = "delete/{profileId}.html", method = RequestMethod.GET)
    public String deleteEmployee(ModelMap mm, @PathVariable("profileId") int profileId) {
        Profile profile = profileService.findById(profileId);
        if (profile != null) {
            profileService.delete(profile);
        }
        mm.put("listProfile", profileService.getListNav(0, 5));
        mm.put("totalItem", profileService.totalItem() / 5);
        return "jsp/profile_list";
    }

    @RequestMapping(value = "save.html", method = RequestMethod.POST)
    public String saveEmployee(ModelMap mm, @ModelAttribute("profile") Profile profile) {
        if (profile.getProfileId() == 0) {
            // findByID
            profileService.create(profile);
        } else {
            profileService.update(profile);
        }
        mm.put("listProfile", profileService.getListNav(0, 5));
        mm.put("totalItem", profileService.totalItem() / 5);
        return "jsp/profile_list";
    }

}