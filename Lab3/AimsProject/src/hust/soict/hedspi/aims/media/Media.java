package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media() {
    }
<<<<<<< HEAD
// Phương thức accessor cho các trường
=======

>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
<<<<<<< HEAD
// Các phương thức khác của lớp Media (nếu cần)

    @Override
    public boolean equals(Object obj) {
        // Check if the reference is the same
=======


    @Override
    public boolean equals(Object obj) {
       
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        if (this == obj) {
            return true;
        }

<<<<<<< HEAD
        // Check if the passed object is null or of a different class
=======
        
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

<<<<<<< HEAD
        // Cast the object to Media
        Media otherMedia = (Media) obj;

        // Check if titles are equal
=======
        
        Media otherMedia = (Media) obj;

        
>>>>>>> 5e289b7e0843d8b9d95784ac66d4a7b51a57a139
        return title.equals(otherMedia.title);
    }


}
