import java.util.ArrayList;
import java.util.List;

public class Thing {
    private int count;

    // Danger - to convert to JsonNode lists (maps, sets) cannot be null
    // May be able to do this with lombok
    //@Builder
    //class MyClass{
    //    @Singular
    //    private List<Type> myList;
    //}
    // https://stackoverflow.com/questions/38522092/initialize-list-if-list-is-null-with-lombok-getter
    private List<String> names = new ArrayList<>();

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

}
