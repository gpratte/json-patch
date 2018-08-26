import java.util.ArrayList;
import java.util.List;

public class Thing {
    private int count;

    // Danger - to convert to JsonNode lists (maps, sets) cannot be null
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
