package data.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "item_category")

public class ItemCategory {

    //    Item_Category_ID INT PRIMARY KEY AUTO_INCREMENT,


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_category_id")
    private Integer itemCategoryId;

    @OneToMany(mappedBy = "itemCategory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Item> itemCatId;

//    Item_Category_Name VARCHAR(25) NOT NULL
    @Column(name = "item_category_name", nullable = false)
    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

}
