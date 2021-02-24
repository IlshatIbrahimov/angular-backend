package kfu.group.dev.taskmanager.runner;

import kfu.group.dev.taskmanager.model.Group;
import kfu.group.dev.taskmanager.model.Item;
import kfu.group.dev.taskmanager.repository.GroupRepo;
import kfu.group.dev.taskmanager.repository.ItemRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MenuRunner implements CommandLineRunner {

    final GroupRepo groupRepo;
    final ItemRepo itemRepo;

    public MenuRunner(GroupRepo groupRepo, ItemRepo itemRepo) {
        this.groupRepo = groupRepo;
        this.itemRepo = itemRepo;
    }


    @Override
    public void run(String... args) throws Exception {

        Group boul = Group.builder().name("Боулы").build();

        Item boul1 = Item.builder()
            .group(boul)
            .name("Будда боул с лососем и икрой масаго")
            .imageUrl("/boul/boul1.png")
            .price("300")
            .size("1 шт / 290 г")
            .build();

        Item boul2 = Item.builder()
            .group(boul)
            .name("Манга боул с дамплингами со свининой")
            .imageUrl("/boul/boul2.png")
            .price("320")
            .size("1 шт / 350 г")
            .build();

        Item boul3 = Item.builder()
            .group(boul)
            .name("Лотос боул с курицей и чукой")
            .imageUrl("/boul/boul3.png")
            .price("300")
            .size("1 шт / 310 г")
            .build();

        Item boul4 = Item.builder()
            .group(boul)
            .name("Мантра боул с тунцом и эдамаме")
            .imageUrl("/boul/boul4.png")
            .price("300")
            .size("1 шт / 310 г")
            .build();

        Item boul5 = Item.builder()
            .group(boul)
            .name("")
            .imageUrl("/boul/boul5.png")
            .price("")
            .size("")
            .build();

        Item boul6 = Item.builder()
            .group(boul)
            .name("Том Ям боул с дамплингами с креветкой")
            .imageUrl("/boul/boul6.png")
            .price("320")
            .size("1 шт / 370 г")
            .build();

        boul.setItemList(List.of(boul1, boul2, boul3, boul4, boul5, boul6));

        groupRepo.save(boul);
    }
}
