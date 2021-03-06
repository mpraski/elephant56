package it.unisa.elephant56.util.hadoop;

import org.apache.avro.hadoop.io.AvroKeyComparator;
import org.apache.avro.mapred.AvroKey;

/**
 * Compares all objects as equal.
 */
public class AvroKeyAllEqualComparator<K> extends AvroKeyComparator<K> {

    @Override
    public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
        return 0;
    }

    @Override
    public int compare(AvroKey<K> x, AvroKey<K> y) {
        return 0;
    }
}
