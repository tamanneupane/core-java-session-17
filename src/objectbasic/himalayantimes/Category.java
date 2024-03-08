package objectbasic.himalayantimes;

import java.time.LocalDate;
import java.util.Objects;


/**
 * This class is used to create the category object that is required by Post
 * @author Taman Neupane
 * @since 11
 */
public class Category {

    //States
    /*
        Category Id - int
        Category Name - String
        Is Disabled - boolean
        order - int
        Is Deleted - boolean
        Created At - String
        Updated At - String
    */

    private int categoryId;
    private String categoryName;
    private boolean isDisabled;
    private int order;
    private boolean isDeleted;
    private String createdAt;
    private String updatedAt;

    /**
     * This is description of constructor
     * @deprecated This is deprecated use parameterized constructor instead
     *
     */
    @Deprecated
    public Category(){
        this.categoryId = 0;
        this.categoryName = "";
        this.isDisabled = false;
        this.order = 0;
        this.isDeleted = false;
        this.createdAt = LocalDate.now().toString();
        this.updatedAt = LocalDate.now().toString();
    }

    // Parameterized Constructor

    /**
     * This is description
     * @param categoryId This category id should be integer
     * @param categoryName This category name cannot be empty or null
     */
    public Category(int categoryId, String categoryName){
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Category(int categoryId, String categoryName, boolean isDisabled, int order, boolean isDeleted) {
        this(categoryId, categoryName);
        this.isDisabled = isDisabled;
        this.order = order;
        this.isDeleted = isDeleted;
    }

    public Category(int categoryId, String categoryName, boolean isDisabled, int order, boolean isDeleted, String createdAt, String updatedAt) {
        this(categoryId, categoryName, isDisabled, order, isDeleted);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        // this => kathmandu
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getCreatedAt() {
        return Objects.requireNonNullElse(createdAt, "2024-01-01");
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This function should be used to get category name when category
     * id is passed to it.
     * @param categoryId This category id should be positive integer
     * @return This function will return name of category if found else it will return null
     */
    public String getCategoryNameById(int categoryId){
        return "category name";
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", isDisabled=" + isDisabled +
                ", order=" + order +
                ", isDeleted=" + isDeleted +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
