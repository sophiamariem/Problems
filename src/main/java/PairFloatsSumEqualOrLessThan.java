
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PairFloatsSumEqualOrLessThan {

    public static class Pair {
        private float one;
        private float two;

        public Pair(float one, float two) {
            this.one = one;
            this.two = two;
        }

        @Override
        public int hashCode() {
            return Objects.hash(one, two);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }

            Pair other = (Pair) obj;
            return Objects.equals(this.one, other.one) &&
                    Objects.equals(this.two, other.two);
        }
    }

    public List<Pair> findPairs(float[] floats, float value) {
        List<Pair> pairs = new ArrayList<>();

        Arrays.sort(floats);
        int i = 0;
        while (i < floats.length) {
            float compl = value - floats[i];
            for (int j = i + 1; j < floats.length; j++) {
                if (floats[j] <= compl) {
                    pairs.add(new Pair(floats[i], floats[j]));
                } else {
                    continue;
                }
            }
            i++;
        }
        return pairs;
    }
}
