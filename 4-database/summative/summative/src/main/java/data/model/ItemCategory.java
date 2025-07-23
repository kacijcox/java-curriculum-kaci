package data.model;

import jakarta.persistence.*;

@Entity
@Table(name = "item_category")

public class ItemCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_category_id")
    private Integer itemCategoryId;

//    Item_Category_ID INT PRIMARY KEY AUTO_INCREMENT,
    @Column(name = "item_category_id", nullable = false)
    private Integer categoryId;

//    Item_Category_Name VARCHAR(25) NOT NULL
    @Column(name = "item_category_name", nullable = false)
    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getItemCategoryId() {
        return itemCategoryId;
    }

    public void setItemCategoryId(Integer itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }
}
