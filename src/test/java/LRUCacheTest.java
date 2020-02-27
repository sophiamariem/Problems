import org.junit.Test;

public class LRUCacheTest {

    @Test
    public void testOne() {
        LRUCache lruCache = new LRUCache(1);
        lruCache.put(2, 1);
        lruCache.get(2);
        lruCache.put(3, 2);
        lruCache.get(2);
        lruCache.get(3);
    }

    @Test
    public void testTwo() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.get(1);
        lruCache.put(3, 3);
        lruCache.get(2);
        lruCache.put(4, 4);
        lruCache.get(1);
        lruCache.get(3);
        lruCache.get(4);
    }

}
