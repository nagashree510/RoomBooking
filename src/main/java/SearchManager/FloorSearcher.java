package SearchManager;

public class FloorSearcher implements Searcher{
    private final String name;

    public FloorSearcher(String name) {
        this.name = name;
    }

    @Override
    public List<Room> searcher() {
        return null;
    }
}
