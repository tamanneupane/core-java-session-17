package objectbasic.himalayantimes;

public final class ImmutableCategory {

    private final int categoryId;
    private final String categoryName;
    private final boolean isDisabled;
    private final int order;
    private final boolean isDeleted;
    private final String createdAt;
    private final String updatedAt;

    public ImmutableCategory(int categoryId, String categoryName, boolean isDisabled, int order, boolean isDeleted, String createdAt, String updatedAt) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.isDisabled = isDisabled;
        this.order = order;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public ImmutableCategory setCategoryName(String categoryName){
        return new ImmutableCategory(this.categoryId, categoryName, this.isDisabled, this.order, this.isDeleted, this.createdAt, this.updatedAt);
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public int getOrder() {
        return order;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
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
