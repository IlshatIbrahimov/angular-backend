package kfu.group.dev.taskmanager.controller;

import kfu.group.dev.taskmanager.model.Group;
import kfu.group.dev.taskmanager.repository.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    final GroupRepo groupRepo;

    public GroupController(GroupRepo groupRepo) {
        this.groupRepo = groupRepo;
    }

    @GetMapping
    public List<Group> getGroups() {
        return groupRepo.findAll();
    }
}
