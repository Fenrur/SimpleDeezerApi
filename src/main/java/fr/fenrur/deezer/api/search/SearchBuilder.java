package fr.fenrur.deezer.api.search;

import java.util.ArrayList;
import java.util.List;

public class SearchBuilder {

    private List<Searcher> searches = new ArrayList<>();

    public SearchBuilder() {

    }

    public SearchBuilder(List<Searcher> searches) {
        this.searches = searches;
    }

    public SearchBuilder addSearch(Searcher searcher) {
        this.searches.add(searcher);
        return this;
    }

    public List<Searcher> getSearches() {
        return searches;
    }

    public SearchBuilder setSearches(List<Searcher> searches) {
        this.searches = searches;
        return this;
    }

    public enum SearchType {
        ARTIST("artist"),
        ALBUM("album"),
        TRACK("track"),
        LABEL("label"),
        DURATION_MAX("dur_max"),
        DURATION_MIX("dur_min"),
        BPM_MAX("bpm_max"),
        BPM_MIN("bpm_min");

        private final String search;

        SearchType(String search) {
            this.search = search;
        }

        private String getSearch() {
            return search;
        }
    }

    public class Searcher {
        private final SearchType type;
        private final String value;

        public Searcher(SearchType type, String value) {
            this.type = type;
            this.value = value;
        }

        public SearchType getType() {
            return type;
        }

        public String getValue() {
            return value;
        }
    }
}
