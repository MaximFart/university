//package com.foxminded.ui;
//
//import com.foxminded.model.Course;
//import com.foxminded.model.Groups;
//import com.foxminded.service.GroupsDaoService;
//import com.foxminded.service.exception.UserInputException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Controller
//@RequestMapping("/groups")
//public class GroupsController {
//
//    private final GroupsDaoService groupsDaoService;
//
//    @Autowired
//    public GroupsController(GroupsDaoService groupsDaoService) {
//        this.groupsDaoService = groupsDaoService;
//    }
//
//    @GetMapping()
//    public String findAll(Model model) {
//        model.addAttribute("groups", groupsDaoService.findAll().stream().map(Optional::get).collect(Collectors.toList()));
//        return "group/groups";
//    }
//    @GetMapping("/{id}")
//    public String getById(@PathVariable("id") int id, Model model) throws Exception {
//        model.addAttribute("group", groupsDaoService.getById(id).get());
//        return "group/show";
//    }
//    @GetMapping("/new")
//    public String newCourse(@ModelAttribute("group") Groups groups) {
//        return "group/new";
//    }
//
//    @PostMapping()
//    public String create(@ModelAttribute("group") Groups groups) throws UserInputException {
//        groupsDaoService.create(groups);
//        return "redirect:/groups";
//    }
//
//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") int id) throws Exception {
//        model.addAttribute("group", groupsDaoService.getById(id).get());
//        return "group/edit";
//    }
//
//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("group") Groups groups, @PathVariable("id") int id) throws UserInputException {
//        groupsDaoService.update(groups, id);
//        return "redirect:/groups";
//    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable("id") int id) throws UserInputException {
//        groupsDaoService.delete(id);
//        return "redirect:/groups";
//    }
//}