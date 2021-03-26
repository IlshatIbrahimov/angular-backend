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

        Group pizza = Group.builder().name("Пицца").build();

        Item pizza1 = Item.builder()
                .group(pizza)
                .name("Цезарь")
                .imageUrl("/pizza/pizza1.png")
                .price("429")
                .size("25 см")
                .description("Свежие листья салата айсберг, цыплёнок, томаты черри, сыры чеддер и пармезан, моцарелла, сливочный соус, соус цезарь")
                .build();
        Item pizza2 = Item.builder()
                .group(pizza)
                .name("Сырная")
                .imageUrl("/pizza/pizza2.png")
                .price("249")
                .size("25 см")
                .description("Увеличенная порция моцареллы, сыры чеддер и пармезан, соус альфредо")
                .build();

        Item pizza3 = Item.builder()
                .group(pizza)
                .name("Пепперони")
                .imageUrl("/pizza/pizza3.png")
                .price("379")
                .size("25 см")
                .description("Пикантная пепперони, увеличенная порция моцареллы, томатный соус\n")
                .build();

        Item pizza4 = Item.builder()
                .group(pizza)
                .name("Четыре сезона")
                .imageUrl("/pizza/pizza4.png")
                .price("379")
                .size("25 см")
                .description("Увеличенная порция моцареллы, ветчина, пикантная пепперони, кубики брынзы, томаты, шампиньоны, томатный соус, итальянские травы")
                .build();

        Item pizza5 = Item.builder()
                .group(pizza)
                .name("Карбонара")
                .imageUrl("/pizza/pizza5.png")
                .price("379")
                .size("25 см")
                .description("Бекон, сыры чеддер и пармезан, моцарелла, томаты черри, красный лук, чеснок, соус альфредо, итальянские травы")
                .build();

        Item pizza6 = Item.builder()
                .group(pizza)
                .name("Гавайская")
                .imageUrl("/pizza/pizza6.png")
                .price("379")
                .size("25 см")
                .description("Цыпленок, ананасы, моцарелла, томатный соус")
                .build();

        Item pizza7 = Item.builder()
                .group(pizza)
                .name("Мясная")
                .imageUrl("/pizza/pizza7.png")
                .price("429")
                .size("25 см")
                .description("Цыпленок, ветчина, пикантная пепперони, острая чоризо, моцарелла, томатный соус")
                .build();

        Item pizza8 = Item.builder()
                .group(pizza)
                .name("Маргарита")
                .imageUrl("/pizza/pizza7.png")
                .price("329")
                .size("25 см")
                .description("Увеличенная порция моцареллы, томаты, итальянские травы, томатный соус")
                .build();

        pizza.setItemList(List.of(pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7, pizza8));

        groupRepo.save(pizza);

        Group snacks = Group.builder().name("Закуски").build();

        Item snack1 = Item.builder()
                .group(snacks)
                .name("Картофель из печи")
                .imageUrl("/snacks/snack1.png")
                .price("179")
                .size("1 шт")
                .description("Ароматный запеченный картофель с итальянскими травами")
                .build();

        Item snack2 = Item.builder()
                .group(snacks)
                .name("Куриные крылья")
                .imageUrl("/snacks/snack2.png")
                .price("359")
                .size("340 гр")
                .description("Куриные крылья со специями и ароматом копчения")
                .build();

        Item snack3 = Item.builder()
                .group(snacks)
                .name("Блинчики с ветчиной и сыром")
                .imageUrl("/snacks/snack3.png")
                .price("169")
                .size("2 шт")
                .description("Воздушные блинчики с сыром и ветчиной из свинины, приготовленные в печи")
                .build();

        Item snack4 = Item.builder()
                .group(snacks)
                .name("Куриные кусочки")
                .imageUrl("/snacks/snack4.png")
                .price("359")
                .size("280 гр")
                .description("Сочное куриное филе в панировке")
                .build();

        snacks.setItemList(List.of(snack1, snack2, snack3, snack4));
        groupRepo.save(snacks);

        Group drinks = Group.builder().name("Напитки").build();

        Item drink1 = Item.builder()
                .group(drinks)
                .name("Какао с маршмеллоу")
                .imageUrl("/drinks/drink1.png")
                .price("119")
                .size("0.3 л")
                .description("Горячий какао с молоком, молочной пенкой и ванильным маршмеллоу")
                .build();

        Item drink2 = Item.builder()
                .group(drinks)
                .name("Клубничный лимонад")
                .imageUrl("/drinks/drink2.png")
                .price("129")
                .size("0.32 л")
                .description("Освежающий газированный напиток с клубничным пюре и мандариновым сиропом")
                .build();

        Item drink3 = Item.builder()
                .group(drinks)
                .name("Марроканский пунш")
                .imageUrl("/drinks/drink3.png")
                .price("119")
                .size("0.3 л")
                .description("Согревающий пряный напиток с мякотью апельсина, соком лайма, имбирем, корицей, бадьяном, кориандром и гвоздикой")
                .build();

        Item drink4 = Item.builder()
                .group(drinks)
                .name("Кофе Капучино")
                .imageUrl("/drinks/drink4.png")
                .price("139")
                .size("0.4 л")
                .description("Горячий напиток на основе эспрессо со вспененным молоком")
                .build();

        Item drink5 = Item.builder()
                .group(drinks)
                .name("Облепиховый пунш")
                .imageUrl("/drinks/drink5.png")
                .price("119")
                .size("0.3 л")
                .description("Согревающий напиток с сиропом из ягод облепихи и лимонного сока")
                .build();

        drinks.setItemList(List.of(drink1, drink2, drink3, drink4, drink5));
        groupRepo.save(drinks);
    }
}
