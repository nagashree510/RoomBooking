package SearchManager;

import java.util.List;

public class BuildingSearcher implements Searcher{
    private final String name;

    public BuildingSearcher(String name) {
        this.name = name;
    }

    @Override
    public List<Room> searcher() {
        return null;
    }
}
